import DS from 'ember-data';

export default DS.Model.extend({
    associates: DS.attr(), //
    batches: DS.attr(), //
    time: DS.attr('date')
});