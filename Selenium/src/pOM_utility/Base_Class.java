package pOM_utility;

import org.apache.tomcat.jni.Time;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.log4testng.Logger;

public class Base_Class 
{
	public WebDriver driver;
	public static ReadData readData=new ReadData();
	public Logger log=Logger.getLogger(Base_Class.class);
	
	public void openBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "");
			driver=new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "");
			driver=new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "");
			driver=new InternetExplorerDriver();
		}
	}
	
	public void openURL(String url)
	{
		driver.get(url);
	}
	public void click(By locator)
	{
		driver.findElement(locator).click();
	}
	
	public void type(By locator, String data)
	{
		try
		{
			driver.findElement(locator).clear();
			driver.findElement(locator).sendKeys(data);
		}
		catch (Exception e)
		{
			System.out.println("error in entering data");// TODO: handle exception
		}
	}
	
	public void Select(By locator,String value)
	{
		try
		{
			Select dropdown=new Select(driver.findElement(locator));
			dropdown.selectByVisibleText(value);
		}
		catch (Exception e)
		{
			System.out.println("error in selecting text");// TODO: handle exception
		}
	}
	
	public void SelectByValue(By locator,String value)
	{
		try
		{
			Select dropdown=new Select(driver.findElement(locator));
			dropdown.selectByValue(value);
		}
		catch (Exception e)
		{
			System.out.println("error in selecting the value from dropdown");
		}
	}
	
	public void SelectByIndex(By locator,int value)
	{
		try
		{
			Select dropdown=new Select(driver.findElement(locator));
			dropdown.selectByIndex(value);
		}
		catch (Exception e) 
		{
		System.out.println("");
	}
	}
	
		public void scrollup(String action)
		{
			Actions a=new Actions(driver);
	if(action.equalsIgnoreCase("home"))
	{
		a.sendKeys(Keys.HOME).perform();
	}
	else if (action.equalsIgnoreCase("pageup"))
	{
		a.sendKeys(Keys.PAGE_UP).perform();
	}
		}

		public void scroll_down(String action)
		{
			Actions a=new Actions(driver);
			if(action.equalsIgnoreCase("end"))
			{
				a.sendKeys(Keys.END).perform();
			}
			else if (action.equalsIgnoreCase("page_down")) 
			{
				a.sendKeys(Keys.PAGE_DOWN).perform();
			}
		}
		

		
		
		
		
		public void acceptAlert(String alert)
		{
			if(alert.equalsIgnoreCase("accept"))
			{
				driver.switchTo().alert().accept();
			}
			else if (alert.equalsIgnoreCase("dismiss"))
			{
				driver.switchTo().alert().dismiss();
			}
		}
		
		
		
		
		public String getAlertData()
		{
			Alert alert=driver.switchTo().alert();
			String alertdata=alert.getText();
			return alertdata;
		}
		
		public void swithchtowindow(int c)
		{
			try
			{
				String childwindow=(String)driver.getWindowHandles().toArray()[c];
				driver.switchTo().window(childwindow);
			}
			catch (Exception e)
			{
					System.out.println("error in switching window: "+c);// TODO: handle exception
			}
		}
		
		
				
	
	
	
			
	


}
