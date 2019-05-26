package sikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class File_Upload {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	 //driver.findElement(By.name("image")).sendKeys("E:\\dwnloads\\selenium\\22122018\\sikuli\\1545451285364.png");
	  driver.findElement(By.name("image")).click();
	  Thread.sleep(2000);
	  Screen s=new Screen();
	  s.type("E:\\dwnloads\\selenium.sikuli\\file name.png", "E:\\dwnloads\\selenium\\22122018\\sikuli\\1546158462747.png");//(file name path, image to upload);
      s.click("E:\\dwnloads\\selenium.sikuli\\open.png");
      Thread.sleep(3000);
  }
  @BeforeTest
  public void beforetest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\dwnloads\\selenium\\Packages\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("http://selenium4testing.com/hms");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
       driver.findElement(By.name("submit")).click();
       driver.findElement(By.linkText("Registration")).click();
 	  driver.findElement(By.linkText("Permanent Registration")).click();
       
  }
  
}
