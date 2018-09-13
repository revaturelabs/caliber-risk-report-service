import Route from '@ember/routing/route';
import RSVP from 'rsvp';

export default Route.extend({
    queryParams: {
        categoryname: {
            refreshModel: true
        },
        batchName: {
            refreshModel: true
        }
    },

    model(params) {
        console.log(params.reporttime)
        console.log(params.idnum)
        return RSVP.hash({
            theReport: this.get('store').peekAll('batchweeklyreport').filterBy('batchName', params.batchName).filterBy('categoryname', params.categoryname),
            associates: this.get('store').peekAll('associateweeklyreport').filterBy('idnum', parseInt(params.idnum)).filterBy('week', 1).sortBy('name')
            //associates needs to be filtered to match the idnum of params.idnum
        })
    }
});