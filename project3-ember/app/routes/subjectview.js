import Route from '@ember/routing/route';
import RSVP from 'rsvp';

export default Route.extend({
    queryParams: {
        subject: {
            refreshModel: true
        },
    },

    model(params) {
        return RSVP.hash({
            theReport: this.get('store').peekAll('batchweeklyreport').filterBy('categoryname', params.subject).sortBy('reporttime'),
        })
    }
});