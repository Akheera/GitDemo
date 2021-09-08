package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	
	@Parameters({"URL","key"})
	@Test(groups= {"smoke"})
	public void demo(String urlname, String pass) 
	{
	System.out.println("good");
	System.out.println(urlname);
	System.out.println(pass);
	
	System.out.println("new");
	System.out.println("change");
	System.out.println("has");
	System.out.println("been done in develop branch ");
	}
	@AfterTest
	public void last() 
	{
	System.out.println("I will execute last");
		
	}
	
}
