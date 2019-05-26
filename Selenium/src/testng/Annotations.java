package testng;

import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Annotations {
	
@Test
	public void test_001()
	{
		System.out.println("test_001 Method");
	}
	@Test
	public void test_002()
	{
		System.out.println("test_002 Method");
		}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");		
	}	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");	
	}
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("Before Method");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
	

}





