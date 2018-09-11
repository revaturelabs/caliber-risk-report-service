import EmberRouter from '@ember/routing/router';
import config from './config/environment';

const Router = EmberRouter.extend({
  location: config.locationType,
  rootURL: config.rootURL
});

Router.map(function() {
  this.route('batchweekly', {path: '/reports/:idnum'});
  this.route('associateweekly', {path: '/associates/:assId'});
  this.route('main-page');
});

export default Router;
