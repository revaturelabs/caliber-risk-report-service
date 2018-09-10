

var backburner = new Ember._Backburner(['normalizeRelationships', 'syncRelationships', 'finished']);

if (true /* DEBUG */) {
  Ember.Test.registerWaiter(() => {
    return !backburner.currentInstance && !backburner.hasTimers();
  });
}

export default backburner;