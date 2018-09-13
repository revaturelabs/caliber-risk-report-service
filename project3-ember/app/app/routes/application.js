/**
* The Application adapter makes a test that takes the batch ID as a parameter, the make
* test method then sets the attributes for the bathID parameter.
*
* @class  Application route
* @method makeTest
* @param {number} batchID A number that represents the batch ID.
* @Authors Vincent, Dominic
*/

import Route from '@ember/routing/route';

export default Route.extend({
    actions: {
        makeTest: function(batchId) {
            this.get('store').unloadAll('batchweeklyreport')
            this.get('store').push({
                data: {
                    id: 1,
                    type: 'batchweeklyreport',
                    attributes: {
                        batch_id: batchId,
                        batch_name: 'Test Batch',

                        qc_count_green: 12,
                        qc_count_yellow: 19,
                        qc_count_red: 5,
                        qc_score: 80,

                        survey_count_green: 13,
                        survey_count_yellow: 15,
                        survey_count_red: 17,
                        survey_score: 100,

                        trainer: 'Mehrab Rahman',
                        associate_ids: 1, //THIS WILL BE A LIST OF NUMBERS
                        location: 'Arlington',
                        skilltype: 'Java',
                        end_date: new Date('09-14-2018'),
                        weeks: 10,
                        current_week: 6,
                        category_name: 'DevOps',
                        report_time: new Date('09-07-2018'),
                    }
                }
            })
            console.log("created a test report")
        }
    }
});
