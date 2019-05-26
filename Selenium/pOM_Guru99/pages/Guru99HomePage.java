package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99HomePage 
{
	WebDriver driver;
	
	By homePageUserName=By.xpath("/html//form[@name='frmLogin']/table//input[@name='uid']");
	
	public Guru99HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public String getHomePageDashboardUserName()
	{
		return driver.findElement(homePageUserName).getText();
		
	}
	
}
