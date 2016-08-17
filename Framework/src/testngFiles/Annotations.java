package testngFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotations {
	public WebDriver driver=null;


	@BeforeMethod
	// generating user ID for every @test
	public void userIDGeneration()
	{
		System.out.println("@BeforeMethod - This block execute before each test - Generated user ID ");
	}
	
	@BeforeTest
	// Before test starts deleting cookies
	public void DeleteCookies()
	
	{
		System.out.println("@BeforeTest - This block executes before all test cases -Before test starts deleting cookies");
		
	}
	
	@AfterTest
	
	//Deleting cookies after completing test
	public void AfterCookies()
	
	{
		System.out.println("@AfterTest - Deleting cookies after completing ALL test");
	}
	
	
	@Test
		
		public void login() throws IOException
		{
			Properties prop=new Properties();
			FileInputStream fis=new FileInputStream("C:\\Udemy\\VE\\src\\VirtaulEdge\\datadriven.properties"); // in java provides double \\
			prop.load(fis);
			
			System.out.println(prop.getProperty("Company"));
			
			if(prop.getProperty("Browser").equals("firefox"))
			{
			 driver= new FirefoxDriver();
			 driver.get("https://www.google.co.in/?gws_rd=ssl");
			}
			else if(prop.getProperty("Browser").equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
				 driver = new ChromeDriver();
				 driver.get("https://www.google.co.in/?gws_rd=ssl");

				
			}
			else
			{
				 driver= new InternetExplorerDriver();
				 driver.get("https://www.google.co.in/?gws_rd=ssl");


			}
			
			driver.get(prop.getProperty("url"));
			
		}

	
	
	@AfterMethod  // This block executes after each methods
	
	public void ReportAdding()
	
	{
		System.out.println("@AfterMethod - This block executes after each test");
		
	}
	
	@Test
	
	public void openingBrowser()
	{
	
	System.out.println("tes1t");
}
	
	@Test
	
	public void navigating()
	{
	
	System.out.println("navigating");
}
	

	@Test
	
	public void Clicking()
	{
	
	System.out.println("Clicking");
}
	
@Test
	
	public void DropdownField()
	{
	
	System.out.println("DropdownField");
}
	/*
	@Test
	@Parameters({"adminUserid"})
	public void flightBooking(String Userid)
	{
		System.out.println(Userid);
		System.out.println("test2");

	}
	*/
}