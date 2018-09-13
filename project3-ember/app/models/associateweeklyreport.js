<<<<<<< HEAD
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
*/

=======
>>>>>>> juby
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
