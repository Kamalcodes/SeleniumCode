package sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mouse_Hover {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  Screen s=new Screen();
	  s.mouseMove("E:\\dwnloads\\selenium\\22122018\\sikuli\\sikuliimages.sikuli\\1545451786647.png");
      Thread.sleep(2000);
      s.click("E:\\dwnloads\\selenium.sikuli\\water.png");
     
  }
  @BeforeTest
  public void beforetest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\dwnloads\\selenium\\Packages\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://paytm.com");
	  
  }
}
