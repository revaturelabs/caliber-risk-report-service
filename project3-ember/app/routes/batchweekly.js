import Route from '@ember/routing/route';

export default Route.extend({
    model(params) {
        return (this.get('store').findAll('batchweeklyreport', {
            filter: {
                batch_id: params.batch_id
            }
        }))
    }
});