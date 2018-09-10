

export function _bind(fn, ...args) {

  return function () {
    return fn.apply(undefined, args);
  };
}

export function _guard(promise, test) {
  var guarded = promise.finally(() => {
    if (!test()) {
      guarded._subscribers.length = 0;
    }
  });

  return guarded;
}

export function _objectIsAlive(object) {
  return !(Ember.get(object, "isDestroyed") || Ember.get(object, "isDestroying"));
}

var ASYNC_REQUEST_COUNT = 0;
export function incrementRequestCount() {
  ASYNC_REQUEST_COUNT++;
}

if (true /* DEBUG */) {
  Ember.Test.registerWaiter(() => {
    return ASYNC_REQUEST_COUNT === 0;
  });
}

export function guardDestroyedStore(promise, store, label) {
  var wrapperPromise = Ember.RSVP.resolve(promise, label).then(v => promise);

  return _guard(wrapperPromise, () => {
    if (true /* DEBUG */) {
      ASYNC_REQUEST_COUNT--;
    }
    return _objectIsAlive(store);
  });
}