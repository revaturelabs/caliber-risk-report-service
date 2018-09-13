/**
* This is a description of the associate weekly report model
*
* @class associate weekly report model
* @property {email} Sets the expected email datatype to a string.
* @property {name} Sets the expected  name datatype to a string.
* @property {assID} Sets the expected  associate id datatype to a number.
* @property {idnum} Sets the expected  primary key datatype to a number.
* @property {status} Sets the expected status datatype to a string.
* @property {qcscore} Sets the expected qcscore datatype to a number.
* @property {qcred} Sets the expected qcred datatype to a number.
* @property{week} Sets the expected week datatype to a number.
* @property {skill} Sets the expected skill datatype to a string.
* @property {phone} Sets the expected phone number datatype to a string.
* @property{profileurl} Sets the expected profile url datatype to a string.
* @property {flagstatus} Sets the expected flag status datatype to a string.
* @property {reporttime} Sets the expected report time datatype to a date.
* @Authors Vincent, Dominic
*/


import DS from 'ember-data';

export default DS.Model.extend({
    idnum: DS.attr('number'),
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
