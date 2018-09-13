/**
* This is a description of the associate weekly report model
*
* @class associate weekly report model
* @property {idnum} Sets the expected primary key datatype to a number.
* @property {batchname} Sets the expected batch name datatype to a string.
* @property {qcgreens} Sets the expected qcgreens datatype to a number.
* @property {qcyellow} Sets the expected qcyellow datatype to a number.
* @property {qcred} Sets the expected qcred datatype to a number.
* @property {qcscore} Sets the expected qcscore datatype to a number.
* @property {survgreen} Sets the expected survgreen datatype to a number.
* @property {survyellow} Sets the expected survyellow datatype to a number.
* @property {survred} Sets the expected survred datatype to a number.
* @property {survscore} Sets the expected survscore datatype to a number.
* @property{trainer} Sets the expected trainer datatype to a string.
* @property {location} Sets the expected location datatype to a string.
* @property {skilltype} Sets the expected skilltype datatype to a string.
* @property {enddate} Sets the expected enddate datatype to a date.
* @property {weeks} Sets the expected weeks datatype to a number.
* @property {currweek} Sets the expected currweek datatype to a number.
* @property {categoryname} Sets the expected categoryname datatype to a string.
* @property {reporttime} Sets the expected reporttime datatype to a date.
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
