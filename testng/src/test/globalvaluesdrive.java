package test;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class globalvaluesdrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		Properties prop=new Properties();
		FileInputStream fis =new FileInputStream("C:\\Users\\Abhijot kaur\\eclipse-workspace\\testng\\src\\data.property");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser"));
		
		FileOutputStream fos= new FileOutputStream("C:\\Users\\Abhijot kaur\\eclipse-workspace\\testng\\src\\data.property");
		prop.store(fos, null);
		
	}

}
