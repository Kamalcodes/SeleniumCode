package datadriven;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ExcelWrite 
{
	WebDriver driver;
	
	@Test
	public void f() throws Exception
	{	
		FileOutputStream fo=new FileOutputStream("E:\\dwnloads\\selenium\\25122018\\Hello.xlsx");
		XSSFWorkbook w=new XSSFWorkbook();
		XSSFSheet s=w.createSheet("Hello");
		s.createRow(0).createCell(0).setCellValue("username");
		w.write(fo);
		w.close();
	}
}
