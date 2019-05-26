package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class isDisplayed {
	WebDriver driver;
	
@Test
public void f() {
WebElement username=driver.findElement(By.name("admin"));
Assert.assertEquals(username.isDisplayed(), true);
username.sendKeys("admin");
WebElement password=driver.findElement(By.name("admin"));
Assert.assertEquals(password.isDisplayed(),true);
password.sendKeys("admin");
	}

@BeforeTest
public void beforeTest()
{
	System.setProperty("webdriver.chrome.driver", "E:\\dwnloads\\selenium\\Packages\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://selenium4testing.com/hms/");
	}
}
