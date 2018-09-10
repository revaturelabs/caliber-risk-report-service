
import InternalModel from './model/internal-model';

/**
 `InternalModelMap` is a custom storage map for internalModels of a given modelName
 used by `IdentityMap`.

 It was extracted from an implicit pojo based "internalModel map" and preserves
 that interface while we work towards a more official API.

 @class InternalModelMap
 @private
 */
export default class InternalModelMap {
  constructor(modelName) {
    this.modelName = modelName;
    this._idToModel = Object.create(null);
    this._models = [];
    this._metadata = null;
  }

  /**
   * @method get
   * @param id {String}
   * @return {InternalModel}
   */
  get(id) {
    return this._idToModel[id];
  }

  has(id) {
    return !!this._idToModel[id];
  }

  get length() {
    return this._models.length;
  }

  set(id, internalModel) {
    (true && !(id) && Ember.assert(`You cannot index an internalModel by an empty id'`, id));
    (true && !(internalModel instanceof InternalModel) && Ember.assert(`You cannot set an index for an internalModel to something other than an internalModel`, internalModel instanceof InternalModel));
    (true && !(this.contains(internalModel)) && Ember.assert(`You cannot set an index for an internalModel that is not in the InternalModelMap`, this.contains(internalModel)));
    (true && !(!this.has(id) || this.get(id) === internalModel) && Ember.assert(`You cannot update the id index of an InternalModel once set. Attempted to update ${id}.`, !this.has(id) || this.get(id) === internalModel));


    this._idToModel[id] = internalModel;
  }

  add(internalModel, id) {
    (true && !(!this.contains(internalModel)) && Ember.assert(`You cannot re-add an already present InternalModel to the InternalModelMap.`, !this.contains(internalModel)));


    if (id) {
      this._idToModel[id] = internalModel;
    }

    this._models.push(internalModel);
  }

  remove(internalModel, id) {
    delete this._idToModel[id];

    var loc = this._models.indexOf(internalModel);

    if (loc !== -1) {
      this._models.splice(loc, 1);
    }
  }

  contains(internalModel) {
    return this._models.indexOf(internalModel) !== -1;
  }

  /**
   An array of all models of this modelName
   @property models
   @type Array
   */
  get models() {
    return this._models;
  }

  /**
   * meta information about internalModels
   * @property metadata
   * @type Object
   */
  get metadata() {
    return this._metadata || (this._metadata = Object.create(null));
  }

  /**
   deprecated (and unsupported) way of accessing modelClass
    @property type
   @deprecated
   */
  get type() {
    throw new Error('InternalModelMap.type is no longer available');
  }

  /**
   Destroy all models in the internalModelTest and wipe metadata.
    @method clear
   */
  clear() {
    var models = this._models;
    this._models = [];

    for (var i = 0; i < models.length; i++) {
      var model = models[i];
      model.unloadRecord();
    }

    this._metadata = null;
  }

}