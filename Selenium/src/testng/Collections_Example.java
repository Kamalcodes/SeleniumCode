package testng;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.testng.annotations.Test;

public class Collections_Example 
{
  @Test
  public void list_example() 
  {
	  ArrayList<String> a=new ArrayList<String>();
	  a.add("A");
	  a.add("B");
	  a.add("C");
	  a.add("D");
	  a.add("E");
	  System.out.println(a.get(2));
	 for(int i=0;i<5;i++)
	  {
		  System.out.println(a.get(i));
	  }
	  
  }
  
  @Test
  public void set_Example()
  {
	HashSet<String>h=new HashSet<String>();
	h.add("x");
	h.add("m");
	h.add("n");
	String s[]= {"x","m"};
	System.out.println(s);
	System.out.println(h);
	
	//cursors --> to get the objects from collection
	  //1. Enumarator
	  //2  Iterator
	  //3. List iterator
	
	Iterator<String>itr=h.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
  }
 
}
