package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Window_Handling
{
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException 
  {
	 
	  driver.findElement(By.linkText("Feedback")).click();
	  Set<String>s=driver.getWindowHandles();
	  Object[] str=s.toArray();
	  driver.switchTo().window(str[1].toString());
	  Thread.sleep(3000);
	  driver.close();
	  driver.switchTo().window(str[2].toString());
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.findElement(By.id("name")).sendKeys("test");
	  driver.findElement(By.id("email")).sendKeys("test@gmail.com");
	  //driver.findElement(By.xpath("/html/body/div[2]/div/div/form/p/button[1]")).click();
	 Thread.sleep(10000);
	  driver.findElement(By.linkText("Logout")).click();
	  driver.close();
	  driver.switchTo().window(str[0].toString());
	  driver.close();
	 
  }
  
  @BeforeTest
  public void beforetest() throws InterruptedException
  {
	System.setProperty("webdriver.chrome.driver", "E:\\dwnloads\\selenium\\Packages\\chromedriver.exe") ;
	driver=new ChromeDriver();
	driver.get("http://selenium4testing.com/hms");
	 driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
	
	
	
  }
  
}
