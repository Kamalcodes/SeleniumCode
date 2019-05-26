package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import pages.Guru99HomePage;
import pages.Guru99Login;

public class Test99GuruLoginWithPageFactory
{
	WebDriver driver;
	Guru99Login objLogin;
	Guru99HomePage objHomePage;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
	}
	@Test(priority=0)
	public void test_Home_Page_Appear_correct()
	{
		objLogin=new Guru99Login(driver);
		String loginPageTitle=objLogin.getLoginTitle();
		AssertJUnit.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
		objLogin.loginToGuru99("mgr123", "mgr!23");
		objHomePage=new Guru99HomePage(driver);
		AssertJUnit.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manager id:mgr123"));
	}
	
	
}
