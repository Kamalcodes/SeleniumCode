package actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scroll_Down_Up {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  Actions a=new Actions(driver);
	  a.sendKeys(Keys.END).build().perform();
	  
	  Thread.sleep(4000);
	  a.sendKeys(Keys.HOME).build().perform();
	  Thread.sleep(4000);
	  a.sendKeys(Keys.PAGE_DOWN).build().perform();
	  Thread.sleep(4000);
	  a.sendKeys(Keys.PAGE_UP).build().perform();
  }
  @BeforeTest
  public void beforetest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\dwnloads\\selenium\\Packages\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("http://paytm.com");
		driver.manage().window().maximize();
	  
  }
}
