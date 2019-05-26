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

public class Data_Read_write 
{
	WebDriver driver;
	
	@Test
	public void test() throws Exception
	{
	File f=new File("E:\\dwnloads\\selenium\\25122018\\Test.xlsx");
	FileInputStream fi=new FileInputStream(f);
	XSSFWorkbook w= new XSSFWorkbook(fi);
	XSSFSheet s=w.getSheet("Sheet1");
	String str;
	FileOutputStream fo=new FileOutputStream(f);
	for(int i=0;i<s.getLastRowNum();i++)
	{		
		try
			{
				driver.findElement(By.name("username")).sendKeys(s.getRow(i).getCell(0).getStringCellValue());
				driver.findElement(By.name("password")).sendKeys(s.getRow(i).getCell(0).getStringCellValue());
				driver.findElement(By.name("submit")).click();
				Thread.sleep(2000);
				driver.findElement(By.linkText("Logout")).click();
				str="pass";
			}	
			catch (Exception e) 
			{
					str="fail";
					driver.switchTo().alert().accept();
			}
		s.getRow(i).createCell(2).setCellValue(str);
     }
	s.getRow(0).createCell(2).setCellValue("Result");
	w.write(fo);
	w.close();
	}
	@BeforeTest
	public void f()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\dwnloads\\selenium\\Packages\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://selenium4testing.com/hms");
		driver.manage().window().maximize();	
	}	
}
