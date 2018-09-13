import DS from 'ember-data';

export default DS.RESTSerializer.extend({
    normalizeResponse(store, primaryModelClass, payload, id, requestType) {
        console.log(payload);
        var result = [],
            obj;
        payload.forEach(function(el, index) {
            el['id'] = index;
            result.push(el);
        });
        payload = {'redawr': payload };
        console.log(payload);
        return this._super(store, primaryModelClass, payload, id, requestType);

    }
});