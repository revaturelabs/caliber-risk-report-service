
import ManyRelationship from "./has-many";
import BelongsToRelationship from "./belongs-to";


function shouldFindInverse(relationshipMeta) {
  var options = relationshipMeta.options;
  return !(options && options.inverse === null);
}

function createRelationshipFor(internalModel, relationshipMeta, store) {
  var inverseKey = void 0;
  var inverse = null;

  if (shouldFindInverse(relationshipMeta)) {
    inverse = internalModel.type.inverseFor(relationshipMeta.key, store);
  } else if (true /* DEBUG */) {
    internalModel.type.typeForRelationship(relationshipMeta.key, store);
  }

  if (inverse) {
    inverseKey = inverse.name;
  }

  if (relationshipMeta.kind === 'hasMany') {
    return new ManyRelationship(store, internalModel, inverseKey, relationshipMeta);
  } else {
    return new BelongsToRelationship(store, internalModel, inverseKey, relationshipMeta);
  }
}

export default class Relationships {
  constructor(internalModel) {
    this.internalModel = internalModel;
    this.initializedRelationships = Object.create(null);
  }

  // TODO @runspired deprecate this as it was never truly a record instance
  get record() {
    return this.internalModel;
  }

  has(key) {
    return !!this.initializedRelationships[key];
  }

  forEach(cb) {
    var rels = this.initializedRelationships;
    Object.keys(rels).forEach(name => {
      cb(name, rels[name]);
    });
  }

  get(key) {
    var relationships = this.initializedRelationships;
    var relationship = relationships[key];
    var internalModel = this.internalModel;

    if (!relationship) {
      var relationshipsByName = Ember.get(internalModel.type, 'relationshipsByName');
      var rel = relationshipsByName.get(key);

      if (!rel) {
        return undefined;
      }

      var relationshipPayload = internalModel.store._relationshipsPayloads.get(internalModel.modelName, internalModel.id, key);

      relationship = relationships[key] = createRelationshipFor(internalModel, rel, internalModel.store);

      if (relationshipPayload) {
        relationship.push(relationshipPayload, true);
      }
    }

    return relationship;
  }
}