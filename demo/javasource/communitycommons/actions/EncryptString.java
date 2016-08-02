// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import communitycommons.StringUtils;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Decrypts an AES encrypted string.
 * The keylength should exactly be 16 characters (128 bit).
 */
public class EncryptString extends CustomJavaAction<String>
{
	private String valueToEncrypt;
	private String key;

	public EncryptString(IContext context, String valueToEncrypt, String key)
	{
		super(context);
		this.valueToEncrypt = valueToEncrypt;
		this.key = key;
	}

	@Override
	public String executeAction() throws Exception
	{
		// BEGIN USER CODE
		return StringUtils.encryptString(key, valueToEncrypt);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "EncryptString";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
