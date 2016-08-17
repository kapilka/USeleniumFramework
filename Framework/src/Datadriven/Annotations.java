package Datadriven;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
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
	
	@Test
	public void flightBooking()
	{
		System.out.println("test2");
	}
	
	@Test(dataProvider="getData")
	public void userID(String username,String pass, String id)
	{
		System.out.println("get data test");
		System.out.println(username);
		System.out.println(pass);
		System.out.println(id);
		
	}
	
	
	@DataProvider
	public Object [][] getData()
	{
		// i stands for number of test cases should run
		// j stands for number of parameter it should send for one go
		Object[][] data=new Object[3][3];
		data[0][0]="1abcdusername";
		data[0][1]="1PAsswordxyz";
		data[0][2]="1ID";
		
		data[1][0]="2abcdusername";
		data[1][1]="2PAsswordxyz";
		data[1][2]="2ID";
		
		data[2][0]="3abcdusername";
		data[2][1]="3PAsswordxyz";
		data[2][2]="3ID";
		
		return data;
	
	}
	
	
	
}