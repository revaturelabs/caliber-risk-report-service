define('ember-welcome-page/components/welcome-page', ['exports', 'ember-welcome-page/templates/components/welcome-page'], function (exports, _welcomePage) {
  'use strict';

  Object.defineProperty(exports, "__esModule", {
    value: true
  });
  exports.default = Ember.Component.extend({
    layout: _welcomePage.default,

    emberVersion: Ember.computed(function () {
      let [major, minor] = Ember.VERSION.split(".");

      return `${major}.${minor}.0`;
    })
  });
});