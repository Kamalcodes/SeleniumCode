package pOM_components;

import pOM_objects.LoginPage_Locators;
import pOM_utility.Base_Class;
import testng.Click_Links;

public class LoginMethods extends Base_Class
{
	LoginPage_Locators loginlocators=new LoginPage_Locators();
	
	
	public void launchApp()
	{
		openBrowser(readData.testDataValue.get("browser"));
		openURL(readData.testDataValue.get("TestURL"));
	}
	
	public void login()throws Exception
	{
	type(loginlocators.username,readData.testDataValue.get("username"));
		type(loginlocators.password,readData.testDataValue.get("password"));
		 click(loginlocators.login);
		 
			 
	}
	
	
}
