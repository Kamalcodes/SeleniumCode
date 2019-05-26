package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetOptions {
	
	WebDriver driver;
  @Test
  public void f() 
  {
	  List<WebElement>dropdownvalues=new Select(driver.findElement(By.name("PATIENT_CAT"))).getOptions();
	  for(int i=0;i<dropdownvalues.size();i++)
	  {
		  System.out.println(dropdownvalues.get(i).getText());
	  }
	  
  }
  
  @BeforeTest 
  public void beforetest()
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\dwnloads\\selenium\\Packages\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get("http://selenium4testing.com/hms/");
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
	  driver.manage().window().maximize();
	  driver.findElement(By.linkText("Registration")).click();
	  driver.findElement(By.linkText("Permanent Registration")).click();
  }
}
