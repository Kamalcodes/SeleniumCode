package testng;
import org.testng.annotations.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Get_Title 
{
	WebDriver driver;
	public void click(String locator)
	{
	driver.findElement(By.linkText(locator)).click();
	}
@BeforeTest
public void beforeTest()
{
	//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//lib//chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", "E:\\dwnloads\\selenium\\Packages\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.get("https://www.seleniumhq.org");
}

@Test
public void f() throws InterruptedException
{
	String homepage=driver.getTitle();
	System.out.println(homepage);
	click("Projects");
	String projects=driver.getTitle();
	if(homepage.equalsIgnoreCase(projects)) 
	{
		System.out.println("unable to click on projects");
	}
	else {
		System.out.println("Navigated to project page");
	}
	Thread.sleep(3000);
	click("Download");
	String download=driver.getTitle();
	Assert.assertEquals(projects.equals(download), false);
	System.out.println("------------");
		
		
	}
	
	
}



