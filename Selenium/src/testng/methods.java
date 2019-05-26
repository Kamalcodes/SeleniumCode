package testng;

//import org.testng.annotations.Test;

/*import com.beust.jcommander.Parameters;

import junit.framework.Assert;

import org.testng.AssertJUnit;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/*
//public class methods {
	// WebDriver driver;
	
	//WebDriver driver;
  /*@Test
  public void f() {
	  
	  //Open Browser
	  
	  System.setProperty("webdriver.chrome.driver","E:\\dwnloads\\selenium\\Packages\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.paytm.com");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("Password")).sendKeys("password");
	  driver.findElement(By.linkText("submit")).click();
	  driver.findElement(By.linkText("Logout")).click();
	 */
	  //Junits Annotations
	  
	/*  @Test
	  public void test()
	  {
		  System.out.println("method test");
	  }
	  @Test
	  public void test2()
	  {
		  System.out.println("method test2");
	  }
	  
	  
	  @BeforeTest
	  public void beforetest()
	  {
		  driver.findElement(By.name("username")).sendKeys("admin");
		  driver.findElement(By.name("Password")).sendKeys("admin");
		  driver.findElement(By.name("submit")).click();
	  }
	  
	  @AfterTest
	  public void aftertest()
	  
	  {
			  
		 driver.findElement(By.linkText("Logout")).click();
	  
}*/
	 //IMplicitlyWait
	 /*@BeforeTest
	 public void f()
	 {
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
	 }
	 
	 */
	 //Dropdown Handling
	 
	// we have 3 kinds of dropdown handling-1. Dropdown by value, 2.Dropdown by index 3. Dropdown visibleText
	 // in dropdown handling if we are passing 3 of methods together then we do need to call them as well.
	 /*@Test
	 public void Dropdown_byvalue()
	 {
		 new Select(driver.findElement(By.name("Religion"))).selectByValue("Hindu");
		 
	 }
	 
	 public void Dropdown_byIndex() 
	 {
		  new Select(driver.findElement(By.name("Patient"))).selectByIndex(2);
		  
	 }
	 
	 public void Dropdown_byVisibleText()
	 {
		 new Select(driver.findElement(By.name("Education"))).selectByVisibleText("Information technology");
	 }
	 
	 public static void main(String[]args)
	 {
		 methods Dropdown_Handling = new methods();
		 Dropdown_Handling.Dropdown_byvalue();
		 Dropdown_Handling.Dropdown_byIndex();
		 Dropdown_Handling.Dropdown_byVisibleText();
		 */
		 
		 
	 
	 /*AlertHandling** 
	 
	 public void alertdata()
	 {
		 String alertdata=driver.switchTo().alert().getText();
		 System.out.println(alertdata);
		 driver.switchTo().alert().accept();
	 }
	 */
	 
	 /*Anotations
	 
	 @Test
	 public void test() {
		 System.out.println("test");
	 }
	 @BeforeTest
	 @Aftertest
	 @BeforeClass
	 @AfterClass
	 @BeforeSuite
	 @AfterSuite
	 @BeforeMethod
	 @AfterMethod
	 @DataProvider
	 */
	 
	 //ClickLinks*TestNG Style
	
	/*WebDriver driver;
	WebDriverWait wait;
	
	public void click(String locator) {
		driver.findElement(By.linkText("Locator")).click();
	}
	@Test
	
     public void f() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Project")));
	 }*/
	
	//TestNG Path stylle
	/*public void f()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//lib//chromebrowser.exe");
		System.setProperty("", System.getProperty("user.dir"+""))
	}
	*/
	
	//GetTitle*Test NG
	//WebDriver driver;
	/*@Test
	public void f() 
	{
		String  homepage=driver.getTitle();
		System.out.println(homepage);
		click("projects");
		String projects=driver.getTitle();
		if(homepage.equalsIgnoreCase(projects))
		{
			System.out.println("unable to click on projects");
		}
		else {
			System.out.println("navigate to projcet page");
		}
		
	}*/
	 
	 /*//TestNG isDisplayed

          @Test
          public void f()
          {
        	  WebElement username=driver.findElement(By.name("username"));
        	  Assert.assertEquals(username.isDisplayed(), true);
          }
		//is_Enabled	
          @Test
          public void is_enabled() {
        	  WebElement password=driver.findElement(By.name("password"));
        	  Assert.assertEquals(username.isEnabled(),true);
          }
	 */
	/* 
	 //TestNG screenshot _validation
	@Test
	
public void f()
	{
		File f=(TakeScreenshot)driver.getScreenshotAs(OutputType.FILE));
	}*/
	
	
	//Window Handling
	
	/*@Test
	
		public void f() throws InterruptedException
		{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("Password")).sendKeys("admin");
		driver.findElement(By.id("login")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Feedback")).click();
		Set<String>s=driver.getWindowHandles();
		Object []str=s.toArray();
		driver.switchTo().window(str[1].toString());
		driver.findElement(By.id("textbox")).sendKeys("hello");
		driver.close();
		driver.switchTo().window(str[0].toString());
		Thread.sleep(20000);
		driver.findElement(By.linkText("Logout")).click();
		
	}*/
	
	/*//WebTable_Handlng
	@Test
	public void f()
	{
	WebElement table=driver.findElement(By.xpath(""));
	List<WebElement>rows=table.findElements(By.tagName("tr"));
	for(int i =0;i<rows.size();i++) 
	{
		List<WebElement>columns=rows.get(i).findElements(By.tagName("td"));
		for(int j=0;j<columns.size();j++)
		{
			System.out.println(columns.get(j).getText()+"	");
		}
		System.out.println();
	}*/
	
/*	//TestNG_Take_Screenshot
	
	public void screenshot(String screenshotName) throws IOException
	{
		Date d = new Date();
		SimpleDateFormat df=new SimpleDateFormat("hh_mm_ss");
		String time =df.format(d);
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("E:\\dwnloads\\selenium\\22122018\\images\\"+screenshotName+time+".png"));
	}
		
			public void f4() throws IOException
			{
				screenshot("Loginpage");
			}
		
*/
	
		//PrintLinks
		/*	@Test
			public void f()
			{
				List<WebElement>links=driver.findElements(By.tagName("a"));
				System.out.println(links.size());
				for(int i=0;i<links.size();i++)
				{
					if(!links.get(i).getText().equalsIgnoreCase(""))
					{
						System.out.println(links.get(i).getText());
					}
					}
					}*/
			
		//print_Fields
	
	/*	@Test
		public void f()
			
		{
			List<WebElement>textboxes=driver.findElements(By.tagName("input"));
			System.out.println(textboxes.size());
			for(int i= 0;i<textboxes.size();i++)
			{
				if(textboxes.get(i).getAttribute("type").equalsIgnoreCase("text"))
				{
					System.out.println(textboxes.get(i).getAttribute("name"));
				}
			}
			System.out.println();
		}*/
			
		/*	@Test
			public void print_Mandatory_Fields()
			{
				String box=driver.findElement(By.xpath("null",""));
				String []s=box.split("\n");
				for(int i=0;i<s.length;i++);
				{
					if(s[i].contains("*"))
					{
						System.out.println(s[i]);
					}
				}
			}
	 */

			//GetOptions
		
	/*		@Test
			public void f()
			{
				List<WebElement>dropdownvalues=new Select(driver.findElement(By.name("patient_cat"))).getOptions();
				for(int i=0;i<dropdownvalues.size();i++);
				{
						System.out.println(dropdownvalues.get(i).getText());
						 
				}
																											
			}
		*/	

			//Frame_Handling
		
	/*	@Test
		public void f()
		{
			driver.findElement(By.xpath("")).click();
			Thread.sleep(1000);
			
			WebElement f=driver.findElement(By.xpath(""));
			driver.switchTo().frame(f);
			driver.findElement(By.xpath("")).click();	
		}
		*/
		
		//Frame_HandlingIndex
		/*@Test
		public void ff()
		{
		List<WebElement>l=driver.findElements(By.tagName("frame"));
		System.out.println(l.size());
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("")).click();
		driver.switchTo().defaultContent();
		*/

			//Collections
		/*@Test
		public void list_example()
		{
			ArrayList<String>a=new ArrayList<String>();
			a.add("A");
			a.add("B");
			a.add("C");
			a.add("D");
			a.add("E");
			System.out.println(a.get(2));
			for(int i=0;i<a.size();i++);
			{
				System.out.println(a.get(i));
			}
			
		}
		
		@Test
		public void set_example() 
		{
			HashSet<String>h=new HashSet<String>();
			h.add("X");
			h.add("y");
			h.add("z");
			String s[]= {"a","b"};
			System.out.print(s);
			System.out.print(h);
			//Cursors: Cursors are to get the objects from collection
			
			//Enumerator
			//Iterator
			//List Iterator
			
			Iterator<String>itr=h.iterator();
				while (itr.hasNext())
				{
					System.out.println(itr.next());
				}
		}*/
//Ajax_Handling
		/*@Test
		public void ff() throws InterruptedException
		{
			driver.findElement(By.xpath("")).sendKeys("Hyd");
			Thread.sleep(2000);
			WebElement ajax_values=driver.findElement(By.xpath(""));
			
			List<WebElement>values=ajax_values.findElements(By.tagName("li"));
			for(WebElement option:values)
				{
					if(option.getText().equalsIgnoreCase("Hyderpora"))
					{
						option.click();
						break;
				}
			}
			
		}
		*/
		
		//Multiple Browsers
		/*
		 public class methods()
		 {
			 webdriver driver;
			 @Parameters("Browser")
			 @Test
			 public void f(String browserName)
			 {
				 if(browserName.equalsIgnoreCase("chrome"))
				 {
					 System.setProperty("webdriver.chrome.driver", "");
					 driver=new ChromeDriver();
				 }
				 else if(browserName.equalsIgnoreCase("Firefox"))
				 {
					 System.setProperty("webdriver.gecko.driver", "");
					 driver=new FirefoxDriver()
				 }
				 driver.get("https://www.paytm.com");
			 }*/
		
		
