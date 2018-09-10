
import MapWithDefault from '../map-with-default';
import Map from '../map';

import { typeForRelationshipMeta, relationshipFromMeta } from "../relationship-meta";

export var relationshipsDescriptor = Ember.computed(function () {
  var map = new MapWithDefault({
    defaultValue() {
      return [];
    }
  });

  // Loop through each computed property on the class
  this.eachComputedProperty((name, meta) => {
    // If the computed property is a relationship, add
    // it to the map.
    if (meta.isRelationship) {
      meta.key = name;
      var relationshipsForType = map.get(typeForRelationshipMeta(meta));

      relationshipsForType.push({
        name: name,
        kind: meta.kind
      });
    }
  });

  return map;
}).readOnly();

export var relatedTypesDescriptor = Ember.computed(function () {
  var modelName = void 0;
  var types = Ember.A();

  // Loop through each computed property on the class,
  // and create an array of the unique types involved
  // in relationships
  this.eachComputedProperty((name, meta) => {
    if (meta.isRelationship) {
      meta.key = name;
      modelName = typeForRelationshipMeta(meta);

      (true && !(modelName) && Ember.assert(`You specified a hasMany (${meta.type}) on ${meta.parentType} but ${meta.type} was not found.`, modelName));


      if (!types.includes(modelName)) {
        (true && !(!!modelName) && Ember.assert(`Trying to sideload ${name} on ${this.toString()} but the type doesn't exist.`, !!modelName));

        types.push(modelName);
      }
    }
  });

  return types;
}).readOnly();

export var relationshipsByNameDescriptor = Ember.computed(function () {
  var map = new Map();

  this.eachComputedProperty((name, meta) => {
    if (meta.isRelationship) {
      meta.key = name;
      var relationship = relationshipFromMeta(meta);
      relationship.type = typeForRelationshipMeta(meta);
      map.set(name, relationship);
    }
  });

  return map;
}).readOnly();