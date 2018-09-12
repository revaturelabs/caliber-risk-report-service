import DS from 'ember-data';

export default DS.RESTSerializer.extend({
    primaryKey: 'assId',
    
    normalizeResponse(store, primaryModelClass, payload, id, requestType) {
        console.log(payload);
        payload = {'associateweeklyreport': payload };
        console.log(payload);
        return this._super(store, primaryModelClass, payload, id, requestType);
        
    }
});
