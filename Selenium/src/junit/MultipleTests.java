package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MultipleTests {

	@Before//1
	public void setUp() 
	{
		System.out.println("before method");
	}

	@After
	public void tearDown() 
	{
		System.out.println("after method");
	}

	@Test//2
	public void test_001() 
	{
		System.out.println("test_001 method");
		
	}
	@Test
	public void test_002()
	{
		System.out.println("test_002 method");
		
	}

}
