package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Print_Links { //printing on console the count of links in a page.
	
	WebDriver driver;
  @Test
  public void f() 
  {
	  	List<WebElement>links=driver.findElements(By.tagName("a"));
	  	System.out.println(links.size());
	  	
	  	for(int i=0;i<links.size();i++) 
	  	{
	  		if(!links.get(i).getText().equalsIgnoreCase(""));
	  		System.out.println(links.get(i).getText());
	  	}
  }
  
  @BeforeTest
  public void beforetest ()
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\dwnloads\\selenium\\Packages\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://spicejet.com");
	  driver.manage().window().maximize();
  }
}
