package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mouse_Hover {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  WebElement more=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[1]/div/a[2]/div/img"));
	  Actions a=new Actions(driver);
	  a.moveToElement(more).build().perform();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\\\"app\\\"]/div/div[3]/div/div[1]/div/a[2]/div/img")).click();
    
  
  }
  @BeforeTest
  public void beforetest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\dwnloads\\selenium\\Packages\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://paytm.com");
	  
  }
}
