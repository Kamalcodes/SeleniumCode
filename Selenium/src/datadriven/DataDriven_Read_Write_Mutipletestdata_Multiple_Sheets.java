package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDriven_Read_Write_Mutipletestdata_Multiple_Sheets
{
	WebDriver driver;
	String str;
	
	@Test
	public void f() throws Exception
	{
		File f=new File("E:\\dwnloads\\selenium\\25122018\\Multipletestdata.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook w=new XSSFWorkbook(fi);
		XSSFSheet s;
		
		FileOutputStream fo=new FileOutputStream(f);
		for(int sheets=0;sheets<w.getNumberOfSheets();sheets++)
		{
			s=w.getSheetAt(sheets);
			XSSFRow headerrow=s.getRow(0);
			int Header_col=headerrow.getLastCellNum();
			
			for(int testdata=5;testdata<Header_col;testdata++)
			{
				for(int i=1;i<s.getLastRowNum();i++)
				{
					try {
						if(s.getRow(i).getCell(4).getStringCellValue().equalsIgnoreCase("url"))
						{
							driver.get(s.getRow(i).getCell(2).getStringCellValue());
						}
						else if(s.getRow(i).getCell(4).getStringCellValue().equalsIgnoreCase("textbox"))
						{
							driver.findElement(By.xpath(s.getRow(i).getCell(2).getStringCellValue())).sendKeys(s.getRow(i).getCell(2).getStringCellValue());
						}
						else if(s.getRow(i).getCell(4).getStringCellValue().equalsIgnoreCase("button"))
						{
							driver.findElement(By.xpath(s.getRow(i).getCell(2).getStringCellValue())).click();
						}
						else if(s.getRow(i).getCell(4).getStringCellValue().equalsIgnoreCase("wait"))
						{
							Thread.sleep(2000);
						}
						str="pass";
					}
					catch (Exception e) {
						str="fail";
						driver.switchTo().alert().accept();
					}
						s.getRow(i).createCell(testdata+3).setCellValue(str);			
						}			
				s.getRow(0).createCell(testdata+3).setCellValue(s.getRow(0).getCell(testdata).getStringCellValue()+"Result");
			}
		}
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
