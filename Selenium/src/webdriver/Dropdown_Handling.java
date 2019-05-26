package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Handling 
{
		WebDriver driver;
	
	public static void main(String args[]) throws InterruptedException// static method
	{
		
		Dropdown_Handling d=new Dropdown_Handling();
		d.openUrl();
		d.login();
		d.dropdown_byindex();
		d.dropdown_byValue();
		d.dropdown_visibletext();
	}
	 //we can define dropdown by three methods byvalue, byintex, visibletext.
		
	
	public void openUrl()//Instance Method
	{
		System.setProperty("webdriver.chrome.driver","E:\\dwnloads\\selenium\\Packages\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmal.com");
		driver.manage().window().maximize();
	}
	
	public void login() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.linkText("submit")).click();
		Thread.sleep(2000);
	}
	
	public void dropdown_visibletext()
	{
		new Select(driver.findElement(By.name("abcc"))).selectByVisibleText("Insurance");
	}
	
	public void dropdown_byValue()
	{
		new Select(driver.findElement(By.name("Education"))).selectByValue("B.tech");
	}
	
	public void dropdown_byindex()
	{
		new Select(driver.findElement(By.name("Education"))).selectByIndex(3);
		
	}
	
}


