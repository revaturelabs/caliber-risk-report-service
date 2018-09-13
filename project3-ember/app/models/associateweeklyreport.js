/**
* This is a description of the associate weekly report model
*
* @model associate weekly report
* @field {email} Sets the expected email datatype to a string.
* @field {name} Sets the expected  name datatype to a string.
* @field {assID} Sets the expected  associate id datatype to a number.
* @field {idnum} Sets the expected  primary key datatype to a number.
* @field {status} Sets the expected status datatype to a string.
* @field {qcscore} Sets the expected qcscore datatype to a number.
* @field {qcred} Sets the expected qcred datatype to a number.
* @field {week} Sets the expected week datatype to a number.
* @field {skill} Sets the expected skill datatype to a string.
* @field {phone} Sets the expected phone number datatype to a string.
* @field {profileurl} Sets the expected profile url datatype to a string.
* @field {flagstatus} Sets the expected flag status datatype to a string.
* @field {reporttime} Sets the expected report time datatype to a date.
*/

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
