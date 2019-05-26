package testng;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Take_Screenshot {
 
	WebDriver driver;
	
	public void screenshot(String screenshotName) throws Exception
	{
		Date d =new Date();
		SimpleDateFormat df= new SimpleDateFormat("hhmmss");
		
		String time=df.format(d);
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("E:\\dwnloads\\selenium\\images\\"+time+".png"));
	}
	
	@Test
  public void f() throws Exception
  {
	  screenshot("Loginpage");
  }
  
  @BeforeTest
  public void beforetest()
  {
	  System.setProperty("webdriver.chrome.driver","E:\\dwnloads\\selenium\\Packages\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("http://selenium4testing.com/hms/");
	  driver.manage().window().maximize();
  }
  
  
}
