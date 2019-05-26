package excel_handling;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.Months;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Jquery_Date_Picker {
 WebDriver driver;
  
   int i=0;
  @Test
  public void f() throws Exception {
   driver.switchTo().frame(0);
   driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
   Thread.sleep(3000);
   String setdatestr ="28/10/2018 ";//dd/MM/yyyy 
   Thread.sleep(3000);
 String currentdatestr= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText(); //MMMM yyyy
 Date setdate=new SimpleDateFormat("dd/MM/yyyy").parse(setdatestr);
 Date currentdate=new SimpleDateFormat("MMMM yyyy").parse(currentdatestr);
 
 int monthdiffrence=Months.monthsBetween(new DateTime(currentdate).withDayOfMonth(1), new DateTime(setdate).withDayOfMonth(1)).getMonths();
 
 
 boolean isFuture=true;
 
 if (monthdiffrence<0) {
 isFuture=false;
 monthdiffrence=-1 * monthdiffrence;
 
 }
 for (int i = 0; i < monthdiffrence; i++) {
 
 if (isFuture) {
 
 driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();//next
 
 }
 else {
 driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]")).click();//prev
 }
 
 }
 
 String day;
 day=new SimpleDateFormat("dd").format(setdate);
 driver.findElement(By.xpath("//a[text()='"+Integer.parseInt(day)+"']")).click();
 }
   
  
  
  @BeforeTest
  public void beforetest() throws Exception {
   System.setProperty("webdriver.chrome.driver", "E:\\dwnloads\\selenium\\Packages\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.get("https://jqueryui.com/datepicker/");
   driver.manage().window().maximize();
   Thread.sleep(3000);
   
   
  }
}