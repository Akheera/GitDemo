package test;

import org.testng.annotations.Test;

public class day4 {

	
	@Test
	public void Webloginhomeloan() 
	{
	System.out.println("Webloginhome");
		
	}
	
	@Test(groups= {"smoke"})
	public void Mobileloginhomeloan() 
	{
	System.out.println("mobileloginhome");
		
	}
	
	@Test
	public void LoginAPIhomeloan() 
	{
	System.out.println("LoginAPIhome");
		
	}
	
}
