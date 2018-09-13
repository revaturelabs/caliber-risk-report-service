

export default function isEnabled() {
  return Ember.FEATURES.isEnabled(...arguments);
}