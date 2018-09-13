import DS from 'ember-data';

export default DS.RESTSerializer.extend({
    primaryKey: 'user',
    
    normalizeResponse(store, primaryModelClass, payload, id, requestType) {
        console.log(payload);
        payload = {'batchweeklyreport': payload };
        console.log(payload);
        return this._super(store, primaryModelClass, payload, id, requestType);
        
    }
});