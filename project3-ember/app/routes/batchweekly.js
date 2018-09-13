import Route from '@ember/routing/route';

export default Route.extend({
    model(params) {
        return (this.get('store').peekAll('batchweeklyreport', params.batch_id/**.query('batchweeklyreport', {
            filter: {
                batch_id: params.batch_id
            }
        }*/))
    }
});