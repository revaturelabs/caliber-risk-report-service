/**
* The batch weekly route uses a before model that redirects the client to the main-page
*
* @class index route
* @method A before model method transitions the client to the main page before the
* model is loaded.
* @Authors Vincent, Dominic
*/

import Route from '@ember/routing/route';

export default Route.extend({
    beforeModel() {
        this.transitionTo('main-page');
    }
});
