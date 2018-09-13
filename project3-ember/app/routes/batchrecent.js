import Route from '@ember/routing/route';
import RSVP from 'rsvp';

export default Route.extend({
    model() {
        return RSVP.hash({
        //this.get('store').unloadAll('batchweeklyreport')
        //console.log(new Date())
            batchFull: this.get('store').peekAll('batchweeklyreport').sortBy('reporttime').reverse()
        })
    }
});