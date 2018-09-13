import EmberRouter from '@ember/routing/router';
import config from './config/environment';

const Router = EmberRouter.extend({
  location: config.locationType,
  rootURL: config.rootURL
});

Router.map(function() {
  this.route('batchweekly', {path: '/batchweekly/:idnum'});
  this.route('associateweekly', {path: '/associateweekly/:assId'});
  this.route('batchrecent', {path: '/batchrecent'});
  this.route('associaterecent', {path: '/associaterecent'});
  this.route('redbatches', {path: '/redbatches'});
  this.route('redassociates', {path: '/redassociates'});
  this.route('subjectview', {path: '/subjectview'});
});

export default Router;
