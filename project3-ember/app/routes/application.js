import Route from '@ember/routing/route';
import RSVP from 'rsvp';

export default Route.extend({
    beforeModel() {
		this.transitionTo('batchrecent');
	},
    model() {
        return RSVP.hash({
            batches: this.get('store').findAll('batchweeklyreport'),
            associates: this.get('store').findAll('associateweeklyreport'),
            batchesRed: this.get('store').findAll('redbwr'),
            associatesRed: this.get('store').findAll('redawr')
        })
    }
});