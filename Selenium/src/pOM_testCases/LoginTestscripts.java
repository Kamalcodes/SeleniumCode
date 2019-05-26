package pOM_testCases;

import org.testng.annotations.Test;

import pOM_components.LoginMethods;
import pOM_utility.Base_Class;

public class LoginTestscripts extends Base_Class

{
	LoginMethods methods=new LoginMethods();
	
	@Test(description="verify the login functionality")
	public void f() throws Exception
	{
		readData.readTestDataFile("E:\\dwnloads\\selenium\\30122018\\Hms_POM\\testdata\\Test.xlsx","1");
		methods.launchApp();
		methods.login();
	}
	
}
