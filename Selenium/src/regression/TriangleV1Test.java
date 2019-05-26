package regression;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class TriangleV1Test
{
	static final int INVALID=0;
	static final int SCALENE=1;
	static final int ISOSCELES=2;
	static final int EQUILATERAL=3;
	
	TriangleV1 tv1;
	
	@Before
	public void setup()
	{
		tv1=new TriangleV1();
	}
	
	@Test
	public final void t0()
	{
		assertEquals(""+INVALID+" "+0.00, tv1.Type_Area(0, 1, 1));
	}
	
	@Test
	public final void t1()
	{
		assertEquals(""+EQUILATERAL+" "+1.73, tv1.Type_Area(2, 2, 2));
	}
	
	@Test
	public final void t2()
	{
		assertEquals(""+ISOSCELES+" "+5.56, tv1.Type_Area(4, 4, 3));
	}
	
	@Test
	public final void t3()
	{
		assertEquals(""+SCALENE+" "+6.00, tv1.Type_Area(5, 4, 3));
	}
	
	@Test
	public final void t4()
	{
		assertEquals(""+SCALENE+" "+9.92, tv1.Type_Area(6, 5, 4));
	}
	
	@Test
	public final void t5()
	{
		assertEquals(""+EQUILATERAL+" "+3.89, tv1.Type_Area(3, 3, 3));
	}
	
	@Test
	public final void t6()
	{
		assertEquals(""+ISOSCELES+" "+4.47, tv1.Type_Area(4, 3, 3));
	}
	
	@Test
	public final void t7()
	{
		assertEquals(""+INVALID+" "+0.00, tv1.Type_Area(3, 1, 1));
	}
}
