package pOM_wordpress.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pOM_Helper.BrowserFactory;

public class VerifyValidLogin 
{
	@Test
	public void checkValidUser()
	{
		//This will launch browser and specific url
		WebDriver driver=BrowserFactory.startBrowser("chrome", "http://demosite.center/wordpress/wp-login.php");
		
		//Created page object using page factory
		LoginPage_New login_page =PageFactory.initElements(driver, LoginPage_New.class);
		
		//call the method
		login_page.login_wordpress("admin","demo123");
	}
}
