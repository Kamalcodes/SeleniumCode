package regression;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TriangleV4Regression 
{
	static final int INVALID=0;
	static final int SCALENE=1;
	static final int ISOSCELES=2;
	static final int EQUILATERAL=3;
	static final int RIGHT=4;
	
	TriangleV4 tv4;
	
	@Before
	public void setUp() throws Exception
	{
		tv4=new TriangleV4();
	}

	@Ignore
	public final void t3()
	{
		assertEquals(""+SCALENE+" "+6.00, tv4.Type_Area(5, 4, 3));
	}
	
	@Test
	public final void t8()
	{
		assertEquals(""+RIGHT+" "+6.00, tv4.Type_Area(5, 4, 3));
	}

}
