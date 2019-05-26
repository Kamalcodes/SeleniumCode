package pOM_testCases;

import org.testng.annotations.Test;

import pOM_components.Registration_Methods;
import pOM_utility.Base_Class;

public class RegistrationScript extends Base_Class
{
	Registration_Methods regmethods=new Registration_Methods();
	@Test
	public void f() throws Exception
	{
		readData.readTestDataFile("E:\\dwnloads\\selenium\\30122018\\Hms_POM\\testdata\\Test.xlsx","2");
		regmethods.launchApp();
		regmethods.login();
		regmethods.registration();
		
	}
}





































