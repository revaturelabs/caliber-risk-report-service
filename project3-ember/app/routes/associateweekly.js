import Route from '@ember/routing/route';

export default Route.extend({
    model(params) {
        //this.get('store').unloadAll('associateweeklyreport')
        return this.get('store').peekAll('associateweeklyreport').filterBy('assId', parseInt(params.assId)).sortBy('week')
    }
});