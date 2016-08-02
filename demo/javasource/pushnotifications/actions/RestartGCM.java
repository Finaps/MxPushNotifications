// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package pushnotifications.actions;

import pushnotifications.implementation.gcm.GCMConnection;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class RestartGCM extends CustomJavaAction<Boolean>
{
	private IMendixObject __settings;
	private pushnotifications.proxies.GCMSettings settings;

	public RestartGCM(IContext context, IMendixObject settings)
	{
		super(context);
		this.__settings = settings;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		this.settings = __settings == null ? null : pushnotifications.proxies.GCMSettings.initialize(getContext(), __settings);

		// BEGIN USER CODE
		boolean restartResult = true;
		GCMConnection connection = GCMConnection.getConnection();
		if (connection != null) {
			connection.stop();
		}
		if (settings.getEnabled()) {
			restartResult = connection.start(settings);
		}
		return restartResult;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "RestartGCM";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
