package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import webdriver.Dropdown_Handling;

public class Z_login {
	WebDriver driver;
	
	 

@Test
public void f()
{
	 Dropdown_Handling d=new Dropdown_Handling();
	 d.dropdown_byValue();
}

	
	
	
	
	
@BeforeTest
public void beforeTest() throws InterruptedException 
{
	 //System.setProperty("webdriver.chrome.driver", System.getProperty("E.dir")+"//downloads//selenium//packages//chromedriver.exe");
	  System.setProperty("webdriver.chrome.driver", "E:\\dwnloads\\selenium\\Packages\\chromedriver.exe");
	  driver =new ChromeDriver();
	  Thread.sleep(2000);
	 driver.get("https://");
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("");
	 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
	driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/form/table/tbody/tr[3]/td[2]/input[2]")).click();
	 driver.findElement(By.xpath("//*[@id=\"TAB_COMPOSE\"]/span[2]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"toField\"]")).sendKeys("email id name");
	 driver.findElement(By.xpath("/html")).sendKeys("Hi This is test email");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"subjectField\"]")).sendKeys("Test");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"SOPSEND\"]")).click();
	 driver.findElement(By.xpath("//*[@id=\"skin_spacing_app_row\"]/tbody/tr/td[2]/a[2]")).click();
	 
}
}
