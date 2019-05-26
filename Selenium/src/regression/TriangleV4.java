package regression;

public class TriangleV4
{
	static final int INVALID=0;
	static final int SCALENE=1;
	static final int ISOSCELES=2;
	static final int EQUILATERAL=3;
	static final int RIGHT=4;
	
	String Type_Area(int a,int b,int c)
	{
		int type;
		if(a<=0 || b<=0 || c<=0 || (a+b<=c) || (b+c<=a) || (a+c<=b))
		{
			type=INVALID;
		}
		else
		{
			type=SCALENE;
			
			if(a==b || b==a)
			type =ISOSCELES;
			
			if(a*a==b*b +c*c)
				type=RIGHT;
			
			if(a==b && b==c)
				type=EQUILATERAL;
		}
		double area;
		switch(type) {
		case INVALID:
			area=0;
			break;
		
		case EQUILATERAL:
			area=(a*a*Math.sqrt(3)/4);
			break;
		
		default :
			double s=(double)(a+b+c)/2;
			area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
			break;
		}
		area=area*100;
		area=(double)((int)area);
		area=area/100;
		
		return ""+type+" "+area;
	}
}
