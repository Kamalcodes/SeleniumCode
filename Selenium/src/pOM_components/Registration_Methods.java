package pOM_components;

import pOM_objects.LoginPage_Locators;
import pOM_objects.RegistrationPage_Locators;
import pOM_utility.Base_Class;

public class Registration_Methods extends Base_Class
{
	RegistrationPage_Locators registrationpage=new RegistrationPage_Locators();
	LoginPage_Locators loginlocators=new LoginPage_Locators();
		
	
	
		public void launchApp()
		{
		openBrowser(readData.testDataValue.get("Browser"));
			openURL(readData.testDataValue.get("TestURL"));
		}
		
		public void  login() 
		{
			type(loginlocators.username,readData.testDataValue.get("username"));
			type(loginlocators.password,readData.testDataValue.get("password"));
			click(loginlocators.login);
		}
	
	
		
		
		public void registration() throws Exception
		{
			click(registrationpage.registration);
			wait(2000);
			click(registrationpage.per_registraion);
			Select(registrationpage.PATIENT_CAT,readData.testDataValue.get("PATIENT_CAT"));
			Select(registrationpage.RELATION,readData.testDataValue.get("RELATION"));
			type(registrationpage.Image,readData.testDataValue.get("image"));
			type(registrationpage.firstname,readData.testDataValue.get("firstname"));
			
		}
}
