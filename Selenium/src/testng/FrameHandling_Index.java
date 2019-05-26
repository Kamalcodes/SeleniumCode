package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FrameHandling_Index {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	List<WebElement> l=driver.findElements(By.tagName("frame"));
	System.out.println(l.size());
	driver.switchTo().frame(2);
	
	driver.findElement(By.xpath("/html/body/div[1]/ul/li[5]")).click();
  }
  
  @BeforeTest
  public void beforetest()
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\dwnloads\\selenium\\Packages\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
	  driver.manage().window().maximize();
	  
  }
}
