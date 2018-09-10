

import { _bind, _guard, _objectIsAlive, guardDestroyedStore, incrementRequestCount } from "./common";

import { normalizeResponseHelper } from "./serializer-response";
import { serializerForAdapter } from "./serializers";

function payloadIsNotBlank(adapterPayload) {
  if (Array.isArray(adapterPayload)) {
    return true;
  } else {
    return Object.keys(adapterPayload || {}).length;
  }
}

export function _find(adapter, store, modelClass, id, internalModel, options) {
  if (true /* DEBUG */) {
    incrementRequestCount();
  }
  var snapshot = internalModel.createSnapshot(options);
  var { modelName } = internalModel;
  var promise = Ember.RSVP.Promise.resolve().then(() => {
    return adapter.findRecord(store, modelClass, id, snapshot);
  });
  var label = `DS: Handle Adapter#findRecord of '${modelName}' with id: '${id}'`;

  promise = guardDestroyedStore(promise, store, label);

  return promise.then(adapterPayload => {
    (true && !(payloadIsNotBlank(adapterPayload)) && Ember.assert(`You made a 'findRecord' request for a '${modelName}' with id '${id}', but the adapter's response did not have any data`, payloadIsNotBlank(adapterPayload)));

    var serializer = serializerForAdapter(store, adapter, modelName);
    var payload = normalizeResponseHelper(serializer, store, modelClass, adapterPayload, id, 'findRecord');
    (true && !(!Array.isArray(payload.data)) && Ember.assert(`Ember Data expected the primary data returned from a 'findRecord' response to be an object but instead it found an array.`, !Array.isArray(payload.data)));
    (true && Ember.warn(`You requested a record of type '${modelName}' with id '${id}' but the adapter returned a payload with primary data having an id of '${payload.data.id}'. Use 'store.findRecord()' when the requested id is the same as the one returned by the adapter. In other cases use 'store.queryRecord()' instead https://emberjs.com/api/data/classes/DS.Store.html#method_queryRecord`, payload.data.id === id, {
      id: 'ds.store.findRecord.id-mismatch'
    }));


    return store._push(payload);
  }, error => {
    internalModel.notFound();
    if (internalModel.isEmpty()) {
      internalModel.unloadRecord();
    }

    throw error;
  }, `DS: Extract payload of '${modelName}'`);
}

export function _findMany(adapter, store, modelName, ids, internalModels) {
  if (true /* DEBUG */) {
    incrementRequestCount();
  }
  var snapshots = Ember.A(internalModels).invoke('createSnapshot');
  var modelClass = store.modelFor(modelName); // `adapter.findMany` gets the modelClass still
  var promise = adapter.findMany(store, modelClass, ids, snapshots);
  var label = `DS: Handle Adapter#findMany of '${modelName}'`;

  if (promise === undefined) {
    throw new Error('adapter.findMany returned undefined, this was very likely a mistake');
  }

  promise = guardDestroyedStore(promise, store, label);

  return promise.then(adapterPayload => {
    (true && !(payloadIsNotBlank(adapterPayload)) && Ember.assert(`You made a 'findMany' request for '${modelName}' records with ids '[${ids}]', but the adapter's response did not have any data`, payloadIsNotBlank(adapterPayload)));

    var serializer = serializerForAdapter(store, adapter, modelName);
    var payload = normalizeResponseHelper(serializer, store, modelClass, adapterPayload, null, 'findMany');
    return store._push(payload);
  }, null, `DS: Extract payload of ${modelName}`);
}

export function _findHasMany(adapter, store, internalModel, link, relationship) {
  if (true /* DEBUG */) {
    incrementRequestCount();
  }
  var snapshot = internalModel.createSnapshot();
  var modelClass = store.modelFor(relationship.type);
  var promise = adapter.findHasMany(store, snapshot, link, relationship);
  var label = `DS: Handle Adapter#findHasMany of '${internalModel.modelName}' : '${relationship.type}'`;

  promise = guardDestroyedStore(promise, store, label);
  promise = _guard(promise, _bind(_objectIsAlive, internalModel));

  return promise.then(adapterPayload => {
    (true && !(payloadIsNotBlank(adapterPayload)) && Ember.assert(`You made a 'findHasMany' request for a ${internalModel.modelName}'s '${relationship.key}' relationship, using link '${link}' , but the adapter's response did not have any data`, payloadIsNotBlank(adapterPayload)));

    var serializer = serializerForAdapter(store, adapter, relationship.type);
    var payload = normalizeResponseHelper(serializer, store, modelClass, adapterPayload, null, 'findHasMany');
    var internalModelArray = store._push(payload);

    internalModelArray.meta = payload.meta;
    return internalModelArray;
  }, null, `DS: Extract payload of '${internalModel.modelName}' : hasMany '${relationship.type}'`);
}

export function _findBelongsTo(adapter, store, internalModel, link, relationship) {
  if (true /* DEBUG */) {
    incrementRequestCount();
  }
  var snapshot = internalModel.createSnapshot();
  var modelClass = store.modelFor(relationship.type);
  var promise = adapter.findBelongsTo(store, snapshot, link, relationship);
  var label = `DS: Handle Adapter#findBelongsTo of ${internalModel.modelName} : ${relationship.type}`;

  promise = guardDestroyedStore(promise, store, label);
  promise = _guard(promise, _bind(_objectIsAlive, internalModel));

  return promise.then(adapterPayload => {
    var serializer = serializerForAdapter(store, adapter, relationship.type);
    var payload = normalizeResponseHelper(serializer, store, modelClass, adapterPayload, null, 'findBelongsTo');

    if (!payload.data) {
      return null;
    }

    return store._push(payload);
  }, null, `DS: Extract payload of ${internalModel.modelName} : ${relationship.type}`);
}

export function _findAll(adapter, store, modelName, sinceToken, options) {
  if (true /* DEBUG */) {
    incrementRequestCount();
  }
  var modelClass = store.modelFor(modelName); // adapter.findAll depends on the class
  var recordArray = store.peekAll(modelName);
  var snapshotArray = recordArray._createSnapshot(options);
  var promise = Ember.RSVP.Promise.resolve().then(() => adapter.findAll(store, modelClass, sinceToken, snapshotArray));
  var label = "DS: Handle Adapter#findAll of " + modelClass;

  promise = guardDestroyedStore(promise, store, label);

  return promise.then(adapterPayload => {
    (true && !(payloadIsNotBlank(adapterPayload)) && Ember.assert(`You made a 'findAll' request for '${modelName}' records, but the adapter's response did not have any data`, payloadIsNotBlank(adapterPayload)));

    var serializer = serializerForAdapter(store, adapter, modelName);
    var payload = normalizeResponseHelper(serializer, store, modelClass, adapterPayload, null, 'findAll');

    store._push(payload);
    store._didUpdateAll(modelName);

    return recordArray;
  }, null, 'DS: Extract payload of findAll ${modelName}');
}

export function _query(adapter, store, modelName, query, recordArray, options) {
  if (true /* DEBUG */) {
    incrementRequestCount();
  }
  var modelClass = store.modelFor(modelName); // adapter.query needs the class

  var promise = void 0;
  var createRecordArray = adapter.query.length > 3 || adapter.query.wrappedFunction && adapter.query.wrappedFunction.length > 3;

  if (createRecordArray) {
    recordArray = recordArray || store.recordArrayManager.createAdapterPopulatedRecordArray(modelName, query);
    promise = Ember.RSVP.Promise.resolve().then(() => adapter.query(store, modelClass, query, recordArray, options));
  } else {
    promise = Ember.RSVP.Promise.resolve().then(() => adapter.query(store, modelClass, query));
  }

  var label = `DS: Handle Adapter#query of ${modelName}`;
  promise = guardDestroyedStore(promise, store, label);

  return promise.then(adapterPayload => {
    var serializer = serializerForAdapter(store, adapter, modelName);

    var payload = normalizeResponseHelper(serializer, store, modelClass, adapterPayload, null, 'query');

    var internalModels = store._push(payload);

    (true && !(Array.isArray(internalModels)) && Ember.assert('The response to store.query is expected to be an array but it was a single record. Please wrap your response in an array or use `store.queryRecord` to query for a single record.', Array.isArray(internalModels)));

    if (recordArray) {
      recordArray._setInternalModels(internalModels, payload);
    } else {
      recordArray = store.recordArrayManager.createAdapterPopulatedRecordArray(modelName, query, internalModels, payload);
    }

    return recordArray;
  }, null, `DS: Extract payload of query ${modelName}`);
}

export function _queryRecord(adapter, store, modelName, query, options) {
  if (true /* DEBUG */) {
    incrementRequestCount();
  }
  var modelClass = store.modelFor(modelName); // adapter.queryRecord needs the class
  var promise = Ember.RSVP.Promise.resolve().then(() => adapter.queryRecord(store, modelClass, query, options));

  var label = `DS: Handle Adapter#queryRecord of ${modelName}`;
  promise = guardDestroyedStore(promise, store, label);

  return promise.then(adapterPayload => {
    var serializer = serializerForAdapter(store, adapter, modelName);
    var payload = normalizeResponseHelper(serializer, store, modelClass, adapterPayload, null, 'queryRecord');

    (true && !(!Array.isArray(payload.data)) && Ember.assert(`Expected the primary data returned by the serializer for a 'queryRecord' response to be a single object or null but instead it was an array.`, !Array.isArray(payload.data), {
      id: 'ds.store.queryRecord-array-response'
    }));


    return store._push(payload);
  }, null, `DS: Extract payload of queryRecord ${modelName}`);
}