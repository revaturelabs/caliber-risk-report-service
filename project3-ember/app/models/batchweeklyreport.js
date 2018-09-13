/**
* This is a description of the associate weekly report model
*
* @model associate weekly report
* @field {idnum} Sets the expected primary key datatype to a number.
* @field {batchname} Sets the expected batch name datatype to a string.
* @field {qcgreens} Sets the expected qcgreens datatype to a number.
* @field {qcyellow} Sets the expected qcyellow datatype to a number.
* @field {qcred} Sets the expected qcred datatype to a number.
* @field {qcscore} Sets the expected qcscore datatype to a number.
* @field {survgreen} Sets the expected survgreen datatype to a number.
* @field {survyellow} Sets the expected survyellow datatype to a number.
* @field {survred} Sets the expected survred datatype to a number.
* @field {survscore} Sets the expected survscore datatype to a number.
* @field {trainer} Sets the expected trainer datatype to a string.
* @field {location} Sets the expected location datatype to a string.
* @field {skilltype} Sets the expected skilltype datatype to a string.
* @field {enddate} Sets the expected enddate datatype to a date.
* @field {weeks} Sets the expected weeks datatype to a number.
* @field {currweek} Sets the expected currweek datatype to a number.
* @field {categoryname} Sets the expected categoryname datatype to a string.
* @field {reporttime} Sets the expected reporttime datatype to a date.
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
