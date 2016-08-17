package PackageTwo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

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
	
	@Test(groups={"priority1"})
	public void flightBooking()
	{
		System.out.println("priority1");
	}
	
	@Test(groups={"priority2"})
	public void flightCancel()
	{
		System.out.println("priority2");
	}
	
}