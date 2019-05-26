package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTable_Handling 
{
  WebDriver driver;
	
  @Test	
  public void f() 
  {
		WebElement table=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]"));
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		for(int i=0;i<rows.size();i++) 
		{
			List<WebElement>columns=rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<columns.size();j++)
			{
				System.out.print(columns.get(j).getText()+"		");
			}
			System.out.println();
		}
  }	
		
	@BeforeTest
	public void beforetest() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\dwnloads\\selenium\\Packages\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://selenium4testing.com/hms");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Registration")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Registration List")).click();
		Thread.sleep(10000);
		
	}
}
