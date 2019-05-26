package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Excel_Write_Existed 
{
	WebDriver driver;
	
	@Test
		public void f() throws Exception
		{
			File f=new File("E:\\dwnloads\\selenium\\25122018\\Test.xlsx");
			FileInputStream fi=new FileInputStream(f);
			XSSFWorkbook w= new XSSFWorkbook(fi);
			XSSFSheet s=w.getSheet("Sheet1");
			s.getRow(1).createCell(0).setCellValue("null");
			FileOutputStream fo=new FileOutputStream(f);
			w.write(fo);
			w.close();	
		}
	
	@BeforeTest
	public void beforeTest()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\dwnloads\\selenium\\Packages\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://selenium4testing.com/hms");
		driver.manage().window().maximize();
	}
}
