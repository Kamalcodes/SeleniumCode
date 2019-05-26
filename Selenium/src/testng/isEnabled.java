package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class isEnabled 
{  WebDriver driver;
  @Test
  public void f()
  {
	  WebElement login=driver.findElement(By.xpath("/html/body/div[4]/div/section/div/div/div/div/form/div[4]/button"));
	  
	  Assert.assertFalse(login.isEnabled());
  }
  
  @BeforeTest
  public void beforetest()
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\dwnloads\\selenium\\Packages\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.viofixer.com/login");
	  driver.manage().window().maximize();
  }
}
