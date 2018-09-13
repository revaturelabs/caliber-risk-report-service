/**
* The batch weekly route makes a model that returns the primary key of the batch reports.
*
* @class  batchweekly route
* @method A model that grabs the primary key and returns it as a number.
* @param {object} params A object that sets the idnum field to the idnum primary key
* returned.
*/

import Route from '@ember/routing/route';

export default Route.extend({
    model(params) {
        return (this.get('store').findAll('batchweeklyreport', {
            filter: {
                idnum: params.idnum
            }
        }))
    }
});
