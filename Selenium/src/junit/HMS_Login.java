package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMS_Login 
{
	WebDriver driver;
	@Before
	public void openUrl()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\\\dwnloads\\\\selenium\\\\Packages\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://");
		
	}
	
	@After
	public void teardown()
	{
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.id("identifier")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.linkText("submit")).click();
		Thread.sleep(5000);
		
}
}