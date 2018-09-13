import Route from '@ember/routing/route';

export default Route.extend({
    model() {
        //this.get('store').unloadAll('batchweeklyreport')
        //console.log(new Date())
        return this.get('store').peekAll('batchweeklyreport').sortBy('reporttime').reverse()
    }
});
