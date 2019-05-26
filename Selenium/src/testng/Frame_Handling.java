package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frame_Handling {
	
	WebDriver driver;
	
	@Test
	public void f() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div[3]/div")).click();
		Thread.sleep(3000);
		
		WebElement f =driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[6]/div[2]/div/iframe"));
		driver.switchTo().frame(f);
		driver.findElement(By.xpath("//*[@id=\"wallet-container-new qr-bg-white\"]/qr-code-login/div[2]/div[2]/div[3]/span"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"input_0\"]")).sendKeys("8125744017");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"input_1\"]")).sendKeys("kamaljitpuri");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/md-content/button/span")).click();
		Thread.sleep(3000);
		driver.close();
	
  }
	
	@BeforeTest
	public void beforetest()
	{
		System.setProperty("webdriver.chrome.driver","E:\\dwnloads\\selenium\\Packages\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.paytm.com");
		driver.manage().window().maximize();
		
	}
}