/**
* The associate weekly route makes a model that returns all of the associate weekly
* reports.
*
* @class Associateweekly route
* @method A model that grabs all the associate weekly reports and returns them as a list
* of objects.
* @param {object} params A object that sets the associate ID field to the associate weekly
* report returned.
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
