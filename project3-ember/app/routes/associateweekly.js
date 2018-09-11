import Route from '@ember/routing/route';

export default Route.extend({
    model(params) {
        return (this.get('store').findAll('associateweeklyreport', {
            filter: {
                assId: params.assId
            }
        }))
    }
});
