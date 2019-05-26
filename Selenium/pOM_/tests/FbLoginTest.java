package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.FbHomePage;
import pages.FbLoginPage;

public class FbLoginTest extends TestBase {
	@Test
	public void init()
	{
		FbLoginPage loginpage=PageFactory.initElements(driver,FbLoginPage.class);
		loginpage.setEmail("puri.kamaljit92@gmail.com");
		loginpage.setPassword("here is my new password");
		loginpage.clickOnLoginButton();
		
		FbHomePage homepage=PageFactory.initElements(driver, FbHomePage.class);
		homepage.clickOnProfileDropdown();
		homepage.ClickOnMarketplace();
		homepage.ClickOnLogoutLink();
	}

}
