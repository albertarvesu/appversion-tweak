package uk.co.whiteoctober.cordova;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;

public class AppVersion extends CordovaPlugin {

	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

		if (action.equals("getVersionNumber")) {

			JSONObject r = new JSONObject();
			PackageManager packageManager = this.cordova.getActivity().getPackageManager();

			try {
				r.put("appVersion", packageManager.getPackageInfo(this.cordova.getActivity().getPackageName(), 0).versionName);
				callbackContext.success(r);
			} catch (NameNotFoundException e) {
				e.printStackTrace();
				return false;
			}

		} else {
			return false;
		}
		return true;
	}

}
