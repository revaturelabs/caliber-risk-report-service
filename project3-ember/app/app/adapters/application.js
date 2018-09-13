/**
* This is a description of the associate weekly report model
*
* @class
* @property host Specifies the Rest endpoint.
* @Authors Vincent ,Dominic
*/
import DS from 'ember-data';

export default DS.RESTAdapter.extend({
    host: 'http://18.220.50.95:9090/api/staging-caliber-risk-report'
})
