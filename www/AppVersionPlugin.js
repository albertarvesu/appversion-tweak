cordova.define("uk.co.whiteoctober.cordova.AppVersion.AppVersionPlugin", function(require, exports, module) {

	var exec = require('cordova/exec');

	var getAppVersion = function (success, fail) {
		exec(success, fail, "AppVersion", "getVersionNumber", []);
	};

	module.exports = getAppVersion;
});

