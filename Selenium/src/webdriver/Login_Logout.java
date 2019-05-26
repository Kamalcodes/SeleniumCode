package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Logout 
{
	
	WebDriver driver;
	public static void main(String args[]) throws InterruptedException
	{
		
		Login_Logout l = new Login_Logout();
		l.openUrl();
		l.login();
		l.logout();
	}
		
	public void openUrl()
	{
		System.setProperty("webdriver.chrome.driver","E:\\dwnloads\\selenium\\Packages\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
	}
	
	public void login() throws InterruptedException
	{
		driver.findElement(By.id("identifierId")).sendKeys("kamaljitpuri19@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("here is my new password");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);	
	}
	
	public void logout()
	{	
		driver.findElement(By.linkText("Logout")).click();
		
	}
}
