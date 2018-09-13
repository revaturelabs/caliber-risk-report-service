/**
  @module ember-data
*/

import cloneNull from './clone-null';
import { RecordArray, AdapterPopulatedRecordArray } from './record-arrays';

var emberRun = Ember.run.backburner;

/**
  @class RecordArrayManager
  @namespace DS
  @private
*/
export default class RecordArrayManager {
  constructor(options) {
    this.store = options.store;
    this.isDestroying = false;
    this.isDestroyed = false;
    this._liveRecordArrays = Object.create(null);
    this._pending = Object.create(null);
    this._adapterPopulatedRecordArrays = [];
  }

  recordDidChange(internalModel) {
    // TODO: change name
    // TODO: track that it was also a change
    this.internalModelDidChange(internalModel);
  }

  recordWasLoaded(internalModel) {
    // TODO: change name
    // TODO: track that it was also that it was first loaded
    this.internalModelDidChange(internalModel);
  }

  internalModelDidChange(internalModel) {

    var modelName = internalModel.modelName;

    if (internalModel._pendingRecordArrayManagerFlush) {
      return;
    }

    internalModel._pendingRecordArrayManagerFlush = true;

    var pending = this._pending;
    var models = pending[modelName] = pending[modelName] || [];
    if (models.push(internalModel) !== 1) {
      return;
    }

    emberRun.schedule('actions', this, this._flush);
  }

  _flushPendingInternalModelsForModelName(modelName, internalModels) {
    var modelsToRemove = [];

    for (var j = 0; j < internalModels.length; j++) {
      var internalModel = internalModels[j];
      // mark internalModels, so they can once again be processed by the
      // recordArrayManager
      internalModel._pendingRecordArrayManagerFlush = false;
      // build up a set of models to ensure we have purged correctly;
      if (internalModel.isHiddenFromRecordArrays()) {
        modelsToRemove.push(internalModel);
      }
    }

    var array = this._liveRecordArrays[modelName];
    if (array) {
      // TODO: skip if it only changed
      // process liveRecordArrays
      this.updateLiveRecordArray(array, internalModels);
    }

    // process adapterPopulatedRecordArrays
    if (modelsToRemove.length > 0) {
      removeFromAdapterPopulatedRecordArrays(modelsToRemove);
    }
  }

  _flush() {

    var pending = this._pending;
    this._pending = Object.create(null);

    for (var modelName in pending) {
      this._flushPendingInternalModelsForModelName(modelName, pending[modelName]);
    }
  }

  updateLiveRecordArray(array, internalModels) {
    return updateLiveRecordArray(array, internalModels);
  }

  _syncLiveRecordArray(array, modelName) {
    (true && !(typeof modelName === 'string') && Ember.assert(`recordArrayManger.syncLiveRecordArray expects modelName not modelClass as the second param`, typeof modelName === 'string'));

    var pending = this._pending[modelName];
    var hasPendingChanges = Array.isArray(pending);
    var hasNoPotentialDeletions = !hasPendingChanges || pending.length === 0;
    var map = this.store._internalModelsFor(modelName);
    var hasNoInsertionsOrRemovals = Ember.get(map, 'length') === Ember.get(array, 'length');

    /*
      Ideally the recordArrayManager has knowledge of the changes to be applied to
      liveRecordArrays, and is capable of strategically flushing those changes and applying
      small diffs if desired.  However, until we've refactored recordArrayManager, this dirty
      check prevents us from unnecessarily wiping out live record arrays returned by peekAll.
      */
    if (hasNoPotentialDeletions && hasNoInsertionsOrRemovals) {
      return;
    }

    if (hasPendingChanges) {
      this._flushPendingInternalModelsForModelName(modelName, pending);
      delete pending[modelName];
    }

    var internalModels = this._visibleInternalModelsByType(modelName);
    var modelsToAdd = [];
    for (var i = 0; i < internalModels.length; i++) {
      var internalModel = internalModels[i];
      var recordArrays = internalModel._recordArrays;
      if (recordArrays.has(array) === false) {
        recordArrays.add(array);
        modelsToAdd.push(internalModel);
      }
    }

    if (modelsToAdd.length) {
      array._pushInternalModels(modelsToAdd);
    }
  }

  _didUpdateAll(modelName) {
    var recordArray = this._liveRecordArrays[modelName];
    if (recordArray) {
      Ember.set(recordArray, 'isUpdating', false);
    }
  }

  /**
    Get the `DS.RecordArray` for a modelName, which contains all loaded records of
    given modelName.
     @method liveRecordArrayFor
    @param {String} modelName
    @return {DS.RecordArray}
  */
  liveRecordArrayFor(modelName) {
    (true && !(typeof modelName === 'string') && Ember.assert(`recordArrayManger.liveRecordArrayFor expects modelName not modelClass as the param`, typeof modelName === 'string'));


    var array = this._liveRecordArrays[modelName];

    if (array) {
      // if the array already exists, synchronize
      this._syncLiveRecordArray(array, modelName);
    } else {
      // if the array is being newly created merely create it with its initial
      // content already set. This prevents unneeded change events.
      var internalModels = this._visibleInternalModelsByType(modelName);
      array = this.createRecordArray(modelName, internalModels);
      this._liveRecordArrays[modelName] = array;
    }

    return array;
  }

  _visibleInternalModelsByType(modelName) {
    var all = this.store._internalModelsFor(modelName)._models;
    var visible = [];
    for (var i = 0; i < all.length; i++) {
      var model = all[i];
      if (model.isHiddenFromRecordArrays() === false) {
        visible.push(model);
      }
    }
    return visible;
  }

  /**
    Create a `DS.RecordArray` for a modelName.
     @method createRecordArray
    @param {String} modelName
    @param {Array} _content (optional|private)
    @return {DS.RecordArray}
  */
  createRecordArray(modelName, content) {
    (true && !(typeof modelName === 'string') && Ember.assert(`recordArrayManger.createRecordArray expects modelName not modelClass as the param`, typeof modelName === 'string'));


    var array = RecordArray.create({
      modelName,
      content: Ember.A(content || []),
      store: this.store,
      isLoaded: true,
      manager: this
    });

    if (Array.isArray(content)) {
      associateWithRecordArray(content, array);
    }

    return array;
  }

  /**
    Create a `DS.AdapterPopulatedRecordArray` for a modelName with given query.
     @method createAdapterPopulatedRecordArray
    @param {String} modelName
    @param {Object} query
    @return {DS.AdapterPopulatedRecordArray}
  */
  createAdapterPopulatedRecordArray(modelName, query, internalModels, payload) {
    (true && !(typeof modelName === 'string') && Ember.assert(`recordArrayManger.createAdapterPopulatedRecordArray expects modelName not modelClass as the first param, received ${modelName}`, typeof modelName === 'string'));


    var array = void 0;
    if (Array.isArray(internalModels)) {
      array = AdapterPopulatedRecordArray.create({
        modelName,
        query: query,
        content: Ember.A(internalModels),
        store: this.store,
        manager: this,
        isLoaded: true,
        isUpdating: false,
        meta: cloneNull(payload.meta),
        links: cloneNull(payload.links)
      });

      associateWithRecordArray(internalModels, array);
    } else {
      array = AdapterPopulatedRecordArray.create({
        modelName,
        query: query,
        content: Ember.A(),
        store: this.store,
        manager: this
      });
    }

    this._adapterPopulatedRecordArrays.push(array);

    return array;
  }

  /**
    Unregister a RecordArray.
    So manager will not update this array.
     @method unregisterRecordArray
    @param {DS.RecordArray} array
  */
  unregisterRecordArray(array) {

    var modelName = array.modelName;

    // remove from adapter populated record array
    var removedFromAdapterPopulated = remove(this._adapterPopulatedRecordArrays, array);

    if (!removedFromAdapterPopulated) {

      var liveRecordArrayForType = this._liveRecordArrays[modelName];
      // unregister live record array
      if (liveRecordArrayForType) {
        if (array === liveRecordArrayForType) {
          delete this._liveRecordArrays[modelName];
        }
      }
    }
  }

  willDestroy() {
    Object.keys(this._liveRecordArrays).forEach(modelName => this._liveRecordArrays[modelName].destroy());
    this._adapterPopulatedRecordArrays.forEach(destroy);
    this.isDestroyed = true;
  }

  destroy() {
    this.isDestroying = true;
    emberRun.schedule('actions', this, this.willDestroy);
  }
}

function destroy(entry) {
  entry.destroy();
}

function remove(array, item) {
  var index = array.indexOf(item);

  if (index !== -1) {
    array.splice(index, 1);
    return true;
  }

  return false;
}

function updateLiveRecordArray(array, internalModels) {
  var modelsToAdd = [];
  var modelsToRemove = [];

  for (var i = 0; i < internalModels.length; i++) {
    var internalModel = internalModels[i];
    var isDeleted = internalModel.isHiddenFromRecordArrays();
    var recordArrays = internalModel._recordArrays;

    if (!isDeleted && !internalModel.isEmpty()) {
      if (!recordArrays.has(array)) {
        modelsToAdd.push(internalModel);
        recordArrays.add(array);
      }
    }

    if (isDeleted) {
      modelsToRemove.push(internalModel);
      recordArrays.delete(array);
    }
  }

  if (modelsToAdd.length > 0) {
    array._pushInternalModels(modelsToAdd);
  }
  if (modelsToRemove.length > 0) {
    array._removeInternalModels(modelsToRemove);
  }

  // return whether we performed an update.
  // Necessary until 3.5 allows us to finish off ember-data-filter support.
  return (modelsToAdd.length || modelsToRemove.length) > 0;
}

function removeFromAdapterPopulatedRecordArrays(internalModels) {
  for (var i = 0; i < internalModels.length; i++) {
    var internalModel = internalModels[i];
    var list = internalModel._recordArrays.list;

    for (var j = 0; j < list.length; j++) {
      // TODO: group by arrays, so we can batch remove
      list[j]._removeInternalModels([internalModel]);
    }

    internalModel._recordArrays.clear();
  }
}

export function associateWithRecordArray(internalModels, array) {
  for (var i = 0, l = internalModels.length; i < l; i++) {
    var internalModel = internalModels[i];
    internalModel._recordArrays.add(array);
  }
}