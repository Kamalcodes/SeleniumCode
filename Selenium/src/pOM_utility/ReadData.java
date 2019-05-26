	package pOM_utility;
	
	import java.awt.Robot;
	import java.awt.Toolkit;
	import java.awt.image.BufferedImage;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.text.DecimalFormat;
	import java.text.SimpleDateFormat;
	import java.util.ArrayList;
	import java.util.Calendar;
	import java.util.Date;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
	import javax.imageio.ImageIO;
	import org.apache.commons.io.FileUtils;
	import org.apache.poi.hssf.usermodel.HSSFWorkbook;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	
	public class ReadData{
		public Map<String, String> testData = new HashMap<String, String>();
		public Map<String, String> testDataValue = new HashMap<String, String>();;
		public  long testCaseStartTime;
		public  long testCaseStopTime;
		public  long testCaseElapsedTime;
		public  String strCaseStartTime;
		public  String strCaseStopTime;
		public  static File suiteFolder;
		protected static File testFolder;
		private static File suiteFile;
		public static String suiteFilePath;
		public static String suiteName;
		public static String testCaseReportsFolder = "Test";
		public static String snapShotsFolder = "Snapshots";
		public  String filePath;
		public  List<String> testCaseStartTimeList = new ArrayList();
		public  List<Integer> failCount = new ArrayList();
		public  List<Integer> passCount = new ArrayList();
		public  List<String> testCaseEndTimeList = new ArrayList();
		public  List<String> testCaseNameList = new ArrayList();
		public  List<String> testCaseDescriptionList = new ArrayList();
		public  final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		public  final SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMM-yyyy");
		public static  final SimpleDateFormat DATE_FORMAT_NOW = new SimpleDateFormat("yyyyMMddHHmmss");
		public static long testStepTempTime;
		public  List<String> testStepElapsedTimeList = new ArrayList();
		public static List<String> testCaseElapsedTimeList = new ArrayList();
		public static File snapShotFolder;
		public  List<String> snapShotPathList = new ArrayList();
		public static  Map<String, String> statusMap = new HashMap();
		public  List<String> stepCount = new ArrayList();
		public  List<String> stepDescription = new ArrayList();
		public  List<String> stepDescription1 = new ArrayList();
	
		public  List<String> stepPrequisite = new ArrayList();
		public  List<String> stepExpected = new ArrayList();
		public  List<String> stepActual = new ArrayList();
		public  List<String> stepStatus = new ArrayList();
		public  static List<String> stepStatus1 = new ArrayList();
	
		public  List<String> objectEvidence = new ArrayList();
		public List<String> testCaseName = new ArrayList();
		public  List<String> testCaseDesc = new ArrayList();
		public static List<String> testCaseName1 = new ArrayList();
		public static List<String> testFullName= new ArrayList();
		public static List<String> testmethod1 = new ArrayList();
		public static List<String> testCaseDesc1 = new ArrayList();
		public static List<String> testCaseStartTimeList1 = new ArrayList();
		public static List<String> testCaseEndTimeList1 = new ArrayList();
		public static List<String> classes= new ArrayList <String>();
		public static List<String> methods= new ArrayList <String>();
		public static List<String> errorDes= new ArrayList <String>();
		public static List<String> ScreenShots= new ArrayList <String>();
		public  String screenShotPath = null;
		
	
			
		public  void readTestDataFile(String filePath, String tcID) throws Exception{
			int s = 0;
			try{
				FileInputStream testRunReport = new FileInputStream(filePath);
				Workbook workbook ;
				Sheet  worksheet;
				int n=filePath.indexOf(".");
				String extension=filePath.substring(n);
				if (extension.equalsIgnoreCase(".xlsx"))
				{
					workbook=new XSSFWorkbook(testRunReport);
				} else {
					workbook=new HSSFWorkbook(testRunReport);
	
				}
				int sheets=workbook.getNumberOfSheets();
				System.out.println("sheets "+sheets);
				int j=0;
				List<String> arrayOfString = new ArrayList<>();;
				// for(s=0; s<sheets; s++ ){
				// XSSFSheet worksheet = workbook.getSheetAt(s);
				String str=workbook.getSheetName(0);
				System.out.println(str);
				if(str.contains("PreCondition"))
				{
					worksheet=workbook.getSheet(str);
					Row Headertrow = worksheet.getRow(0);
					// for(int i=1;i<=totalrows;i++){
					Row currentrowww = worksheet.getRow(1);
					int columns=currentrowww.getLastCellNum();
					for (int k = 0; k < columns; k++) { 
						if(currentrowww !=null)
						{
							Cell cellkey = Headertrow.getCell(k);
							System.out.println("cellkey "+cellkey); 
							Cell cellValue = currentrowww.getCell(k);
							System.out.println("cellValue "+cellValue);
							System.out.println("-----------------------------");
							if(cellkey.toString() != ""){
								if(!arrayOfString.contains(cellkey.toString())){
									arrayOfString.add(cellkey.toString());
									testData.put(cellkey.toString(), cellValue.toString());
								}else
								{
									System.out.println("Duplicate Key In Test Data File : "+cellkey.toString());
								//	throw new AutomationException("Duplicate Key In Test Data File : "+cellkey.toString());
								}
							}
							else
							{
								System.out.println("Row is empty in Test Data file : ");
							}
						}
					}
					//}
				} 
				String str1=workbook.getSheetName(1); 
				System.out.println(str1);
				if(str1.contains("data"))
				{
					worksheet=workbook.getSheet(str1);
					Row Headertrow = worksheet.getRow(0);
					// int totalrows = worksheet.getLastRowNum()-worksheet.getFirstRowNum();
					int startValue=Integer.parseInt(tcID);
					int endValue=startValue; 
					for(int i=startValue; i<=endValue;i++)
					{
						Row currentrow = worksheet.getRow(i);
						int columns=currentrow.getLastCellNum();
						// if(currentrow.getCell(1).getStringCellValue().equalsIgnoreCase(BaseClass.tcno)){ 
						for (int k = 0; k < columns; k++)
							{ 
							if(currentrow !=null){
								Cell cellkey = Headertrow.getCell(k);
								System.out.println("cellkey "+cellkey); 	
								Cell cellValue = currentrow.getCell(k);
								System.out.println("cellValue "+cellValue);
								System.out.println("-----------------------------");
								if(cellkey.toString() != ""){
									if(!arrayOfString.contains(cellkey.toString())){
										arrayOfString.add(cellkey.toString());
										testData.put(cellkey.toString(), cellValue.toString());
										testDataValue.put(cellkey.toString(), cellValue.toString());
									}
									else
									{
										System.out.println("Duplicate Key In Test Data File : "+cellkey.toString());
										//throw new AutomationException("Duplicate Key In Test Data File : "+cellkey.toString());
									}
								}
								else
								{
									System.out.println("Row is empty in Test Data file : "+(i+1));
								}
							}
						}
						//}
					}
				}
			}
			catch (IOException localIOException)
			{
				System.out.println("Unable to read test data file : " + s);
			}
			catch (Exception localAutomationException)
			{
				throw localAutomationException;
			}  
		}}
	
