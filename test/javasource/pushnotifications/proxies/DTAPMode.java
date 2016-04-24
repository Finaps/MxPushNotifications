// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package pushnotifications.proxies;

public enum DTAPMode
{
	DEVELOPMENT(new String[][] { new String[] { "en_US", "Development" }, new String[] { "nl_NL", "Development" } }),
	TESTING(new String[][] { new String[] { "en_US", "Testing" }, new String[] { "nl_NL", "Testing" } }),
	ACCEPTANCE(new String[][] { new String[] { "en_US", "Acceptance" }, new String[] { "nl_NL", "Acceptance" } }),
	PRODUCTION(new String[][] { new String[] { "en_US", "Production" }, new String[] { "nl_NL", "Production" } }),
	TRIAL(new String[][] { new String[] { "en_US", "Trial" }, new String[] { "nl_NL", "Trial" } });

	private java.util.Map<String,String> captions;

	private DTAPMode(String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<String,String>();
		for (String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public String getCaption(String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public String getCaption()
	{
		return captions.get("en_US");
	}
}