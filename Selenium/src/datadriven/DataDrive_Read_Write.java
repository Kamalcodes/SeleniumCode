package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDrive_Read_Write 
{
	WebDriver driver;
	String str;
	@Test
	public void f() throws Exception
	{
		File f=new File("E:\\dwnloads\\selenium\\testdata\\Data.xlsx");
		FileInputStream fi=new FileInputStream(f);
	    XSSFWorkbook w=new XSSFWorkbook(fi);
	    XSSFSheet s=w.getSheet("Sheet1");
	    FileOutputStream fo=new FileOutputStream(f);
	    	
	    for(int i=1;i<=s.getLastRowNum();i++)
	    {
	    	try
	    	{
	    		if(s.getRow(i).getCell(4).getStringCellValue().equalsIgnoreCase("url"))
	    				{
	    					driver.get(s.getRow(i).getCell(2).getStringCellValue());
	    				}
	    		else if(s.getRow(i).getCell(4).getStringCellValue().equalsIgnoreCase("textbox"))
	    		{
	    			driver.findElement(By.xpath(s.getRow(i).getCell(2).getStringCellValue())).sendKeys(s.getRow(i).getCell(4).getStringCellValue());
	    		}
	    		else if(s.getRow(i).getCell(4).getStringCellValue().equalsIgnoreCase("button"))
	    		{
	    			driver.findElement(By.xpath(s.getRow(i).getCell(2).getStringCellValue())).click();
	    		}
	    		else if(s.getRow(i).getCell(4).getStringCellValue().equalsIgnoreCase("link"))
	    		{
	    			driver.findElement(By.xpath(s.getRow(i).getCell(2).getStringCellValue())).click();
	    		}
	    		else if(s.getRow(i).getCell(4).getStringCellValue().equalsIgnoreCase("wait"))
	    		{
	    			Thread.sleep(2000);
	    		}
	    		
	    		str="pass";
	    	}
			catch (Exception e)
			{
				str="fail";
			}
	    	s.getRow(i).getCell(6).setCellValue(str);
	    }
	    s.getRow(0).getCell(6).setCellValue("Result");
	    w.write(fo);
	    w.close();
	}
	
	
	@BeforeTest
	public void beforeTest()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\dwnloads\\selenium\\Packages\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
}
