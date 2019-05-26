package webdriver;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome_Browser 
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\dwnloads\\selenium\\Packages\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(1000);
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("kamaljitpuri19@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("here is my new password");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content")).click();	
		Thread.sleep(1000);
		driver.findElement(By.linkText("Important")).click();
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]/div/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
		driver.close();
		//driver.manage().window().getSize();
		///Dimension d = new Dimension(100,200);
	  
	}
}