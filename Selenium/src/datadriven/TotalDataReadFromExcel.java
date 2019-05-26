package datadriven;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class TotalDataReadFromExcel
{
		@Test
		public void f() throws Exception
		{
			File f=new File("");
			FileInputStream fi=new FileInputStream(f);
			XSSFWorkbook w=new XSSFWorkbook(fi);
			XSSFSheet s=w.getSheet("Sheet1");
			int rows_count=s.getLastRowNum();
			for(int i=0;i<=rows_count;i++)
			{
				XSSFRow row= s.getRow(i);
				for(int j=0;j<row.getLastCellNum();j++)
				{
					System.out.print(row.getCell(j).getStringCellValue()+" ||");	
				}
			System.out.println();
		}
			w.close();
	}

}
