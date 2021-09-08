package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	//@BeforeClass
	public void preclass() 
	{
	System.out.println("i am day3 before class");
		
	}
	@Test(groups= {"smoke"})
	public void Weblogincarloan() 
	{
	System.out.println("Weblogincar");
		
	}
	//@BeforeMethod
	public void preevery() 
	{
	System.out.println("i am day3 before method");
		
	}
	//@AfterMethod
	public void afevery() 
	{
	System.out.println("i am day3 afte methodr");
	
	
	
	}
	@BeforeSuite
	public void pre() 
	{
	System.out.println("number 1");
		
	}
	
	@Test(dataProvider="getdata")
	public void Mobilelogincarloan(String name, String pass) 
	{
	System.out.println("mobilelogincar");
		System.out.println(name);
		System.out.println(pass);
	}
	@Parameters({"URL"})
	@Test
	public void Mobilesignupcarloan(String urlname) 
	{
	System.out.println("mobilesignupcar");
	System.out.println(urlname);
	}
	@Test(enabled= false)
	public void Mobilesignincarloan() 
	{
	System.out.println("mobilesignincar");
		
	}
	//@BeforeTest
	public void first() 
	{
	System.out.println("I will execute first");
		
	}
	
	@Test(dependsOnMethods={"Mobilelogincarloan","Mobilesignupcarloan"})
	public void LoginAPIcarloan() 
	{
	System.out.println("LoginAPIcar");
	}

	@DataProvider
	public Object[][] getdata()
	{
		
		Object[][] data = new Object[3][2];
		
		//first set
		data[0][0]="name1";
		data[0][1]="password1";
		
		
		//second set
				data[1][0]="name2";
				data[1][1]="password2";
	
				//third set
				data[2][0]="name3";
				data[2][1]="password3";
				return data;
				
	}


}

