package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class day1 {
	
	@Test
	public void demo() 
	{
	System.out.println("hello");
		Assert.assertTrue(false);
	}
	@AfterSuite
	public void last() 
	{
	System.out.println("number last");
	System.out.println("new");
	System.out.println("change");
	
	}
	


@Test
public void demo2()
{
System.out.println("bye");
System.out.println("has");
System.out.println("been done");
}
}