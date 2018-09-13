import Route from '@ember/routing/route';
import RSVP from 'rsvp';

export default Route.extend({
    model() {
        return RSVP.hash({
        //this.get('store').unloadAll('batchweeklyreport')
        //console.log(new Date())
            associateFull: this.get('store').peekAll('associateweeklyreport').sortBy('reporttime').reverse()
        })
    }
});