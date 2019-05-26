package datadriven;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ExcelRead 
{
	WebDriver driver;
	@Test
	public void f() throws Exception
	{
		File f=new File("");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook w=new XSSFWorkbook(fi);
		XSSFSheet s=w.getSheet("Sheet1");
		System.out.println(s.getRow(0).getCell(0).getStringCellValue());
		w.close();
		
		
	}
	
	
}
