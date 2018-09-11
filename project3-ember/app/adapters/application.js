import DS from 'ember-data';

export default DS.RESTAdapter.extend({
    host: 'http://18.220.50.95:9090/api/staging-caliber-risk-report'
})