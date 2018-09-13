/**
* The Application adapter makes a test that takes the batch ID as a parameter, the make
* test method then sets the attributes for the bathID parameter.
*
* @route  Associateweekly
* @model A model that
* @param {object} batchID A number that represents the batch ID.
*/


import Route from '@ember/routing/route';

export default Route.extend({
    model(params) {
        return (this.get('store').findAll('associateweeklyreport', {
            filter: {
                assId: params.assId
            }
        }))
    }
});
