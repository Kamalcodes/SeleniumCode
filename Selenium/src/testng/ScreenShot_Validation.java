package testng;



//import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenShot_Validation 
{
	WebDriver driver;
  @Test
  public void f() 
  {
	  //File f=((TakeScreenshot)driver).getScreenshotAs(OutputType.FILE);
  }
  @BeforeTest
  public void beforetest()

  {
	  System.setProperty("webdriver.chrome.driver", "E:\\dwnloads\\selenium\\Packages\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get("http://seleniumhq.org");
	  driver.manage().window().maximize();
	  
  }
}
