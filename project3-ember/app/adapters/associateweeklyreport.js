/**
* This is a description of the associate weekly report adapter
*
* @class
* @return {object} Returns the associate weekly report from the Associate weekly report
*  as a list of objects from the backend controller.
*/


import ApplicationAdapter from './application';

export default ApplicationAdapter.extend({
    pathForType() {
        return 'associates'
    }
});
