package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handling 
{
		WebDriver driver;//Instance Variable 
		
		public static void main(String args[]) throws InterruptedException
		{
			Alert_Handling a=new Alert_Handling();
			a.openUrl();
			a.login();
			a.getalertdata();
			
		}
		
		
		public void openUrl()//Instance Method
		{
			System.setProperty("webdriver.chrome.driver", "E:\\dwnloads\\selenium\\Packages\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.get("https://www.gmail.com");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		}
		
		public void login() throws InterruptedException
		{
			driver.findElement(By.id("identifierId")).sendKeys("kamaljitpuri19@gmail.com");
			driver.findElement(By.id("identifierNext")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("here is my new password");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content")).click();	
			Thread.sleep(5000);
		}
		
		public void getalertdata()
		{
			String alertdata=driver.switchTo().alert().getText();
			System.out.println(alertdata);
			driver.switchTo().alert().accept();
		}
		
}
		












