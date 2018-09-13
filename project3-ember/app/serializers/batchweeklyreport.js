/**
* The batch weekly report serializer uses the normalizeResponse method to normalize a
* the batch weekly report payload from the server to a JSON-API Document.
*
* @class batch weekly report serializer
* @property {number} primaryKey Sets the primary key to the batch report primary key.
* @method normalizeResponse A method that normalizes used to normalize the payload from
* the server to a JSON-API Document.
* @param {DS.Store} store The DS.Store.
* @param {DS.Model} primaryModelClass The primary model class.
* @param {Object} payload The payload that will be normalized.
* @param {number} id The id.
* @param {Object} requestType The type of the request sent in.
* @return {Object} Returns a JSON-API Document.
*/
import DS from 'ember-data';

export default DS.RESTSerializer.extend({
    primaryKey: 'idnum',

    normalizeResponse(store, primaryModelClass, payload, id, requestType) {
        console.log(payload);
        payload = {'batchweeklyreport': payload };
        console.log(payload);
        return this._super(store, primaryModelClass, payload, id, requestType);

    }
});
