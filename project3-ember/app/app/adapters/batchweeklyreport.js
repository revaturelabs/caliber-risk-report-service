/**
* This is a description of the associate weekly report adapter
*
* @class Application Adapter
* @return {object} Returns the batch weekly report from the batch weekly report backend
* controller as a list of objects.
* @Authors Vincent, Dominic
*/

import ApplicationAdapter from './application';

export default ApplicationAdapter.extend({
    pathForType() {
        return 'reports'
    }
})
