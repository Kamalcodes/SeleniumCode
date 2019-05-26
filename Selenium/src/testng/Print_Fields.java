package testng;


import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Print_Fields 
{
	WebDriver driver;
	
  @Test
  public void f()
  {
	  List<WebElement>textboxes=driver.findElements(By.tagName("input"));
	  System.out.println(textboxes.size());
	  for(int i=0;i<textboxes.size();i++)
	  {
		  if(textboxes.get(i).getAttribute("type").equalsIgnoreCase("text"))
		  {
			  System.out.println(textboxes.get(i).getAttribute("name"));
		  }		  
	  }
	  System.out.println("------------------------------");
  }
  
  @Test
  public void print_mandotoryFields()
  {
	  String box=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]")).getText();
	  String s[]=box.split("\n");
	  for(int i=0;i<s.length;i++)
	  {
		  if(s[i].contains("*"))
		  {
			  System.out.println(s[i]);
		  }
	  }
  }
  
  @BeforeTest
  public void beforetest()
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\dwnloads\\selenium\\Packages\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get("http://selenium4testing.com/hms/");
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
	  driver.manage().window().maximize();
	  driver.findElement(By.linkText("Registration")).click();
	  driver.findElement(By.linkText("Permanent Registration")).click();
	

	
	  
  }
}
