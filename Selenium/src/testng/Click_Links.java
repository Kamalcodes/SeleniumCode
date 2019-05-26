package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class Click_Links 
{
	WebDriver driver;
	WebDriverWait wait;
	
	public void click(String locator)
	{
		driver.findElement(By.linkText(locator)).click();
	}
	
	
  @Test
  public void f() throws InterruptedException 
  {
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Projects")));
	click("Projects");
	Thread.sleep(3000);
	click("Download");
	Thread.sleep(3000);
	click("Documentation");
	driver.close();
  }
  
  @BeforeTest
  public void beforeTest() throws InterruptedException 
  {
	 //System.setProperty("webdriver.chrome.driver", System.getProperty("E.dir")+"//downloads//selenium//packages//chromedriver.exe");
	  System.setProperty("webdriver.chrome.driver", "E:\\dwnloads\\selenium\\Packages\\chromedriver.exe");
	  driver=new ChromeDriver();
	  Thread.sleep(1000);
	 driver.get("https://www.seleniumhq.org/");
	 driver.manage().window().maximize();
	 wait=new WebDriverWait(driver,3);
	 
  }

}
