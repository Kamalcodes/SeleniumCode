package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ajax_Handling 
{
	WebDriver driver;
  /*@Test
  public void f() throws InterruptedException 
  {
	  driver.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys("Hyd");
	  Thread.sleep(1000);
	  
	  WebElement Ajax_values=driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[1]/div"));
	  List<WebElement>values=Ajax_values.findElements(By.tagName("id"));
	  
	  for(WebElement option:values)
	  {
		  if(option.getText().equalsIgnoreCase("Hyderpora"))
		  {
			  option.click();
			  break;
		  }
		  }*/
	@Test
	  public void f() throws Exception {
		  driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).sendKeys("amr");
		  Thread.sleep(10000);									
		  WebElement ajax_values=  driver.findElement(By.xpath("//*[@id=\"citydropdown\"]/tbody/tr[2]/td[2]"));
		  
		  List<WebElement> values= ajax_values.findElements(By.tagName("li"));
		  
		  for (WebElement option : values) 
		  {
			if (option.getText().equalsIgnoreCase("Amritsar"))
				{
				option.click();
				break;
				
			}
			
		}
		
	  }
	  
	  
  
  
  @BeforeTest
  public void beforetest()
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\dwnloads\\selenium\\Packages\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.spicejet.com");
	  driver.manage().window().maximize();
  }
}
