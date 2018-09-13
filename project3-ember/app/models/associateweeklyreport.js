import DS from 'ember-data';

export default DS.Model.extend({
    email: DS.attr('string'),
    name: DS.attr('string'),
    assId: DS.attr('number'),
    idnum: DS.attr('number'),
    status: DS.attr('string'),
    qcscore: DS.attr('number'),
    qcred: DS.attr('number'),
    week: DS.attr('number'),
    skill: DS.attr('string'),
    phone: DS.attr('string'),
    profileurl: DS.attr('string'),
    flagstatus: DS.attr('string'),
    reporttime: DS.attr('date')
});
