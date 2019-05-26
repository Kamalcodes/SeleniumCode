package sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClickOnNavigate {
WebDriver driver;
  @Test
  public void f() throws Exception {
	  Screen s=new Screen();
	  s.click("E:\\dwnloads\\selenium\\22122018\\sikuli\\libs\\073621.png");
	  
  }
  @BeforeTest
  public void beforetest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\dwnloads\\selenium\\Packages\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://paytm.com");
	  
  }

}



//just a normal login page

