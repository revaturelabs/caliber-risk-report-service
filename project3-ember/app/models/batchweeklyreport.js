import DS from 'ember-data';

export default DS.Model.extend({
    idnum: DS.attr('string'),
    batchName: DS.attr('string'),
    qcgreens: DS.attr('number'),
    qcyellow: DS.attr('number'),
    qcred: DS.attr('number'),
    qcscore: DS.attr('number'),
    survgreen: DS.attr('number'),
    survyellow: DS.attr('number'),
    survred: DS.attr('number'),
    survscore: DS.attr('number'),
    trainer: DS.attr('string'),
    associates: DS.attr(),//
    location: DS.attr('string'),
    skilltype: DS.attr('string'),
    enddate: DS.attr('date'),
    weeks: DS.attr('number'),
    currweek: DS.attr('number'),
    categoryname: DS.attr('string'),
    reporttime: DS.attr('date')
});