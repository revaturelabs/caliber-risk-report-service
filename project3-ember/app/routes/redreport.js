import Route from '@ember/routing/route';
import RSVP from 'rsvp';

export default Route.extend({
    model() {
        return RSVP.hash({
            batches: this.get('store').peekAll('redbwr').sortBy('reporttime').reverse(),
            associates: this.get('store').peekAll('redawr').sortBy('reporttime').reverse()
        })
    }
});