
var exec = require('cordova/exec');

var getAppVersion = function (success, fail) {
	exec(success, fail, "AppVersion", "getVersionNumber", []);
};

module.exports = getAppVersion;
