package testng3;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotation2
{

	@BeforeSuite
	
	public void installSoftware()
	{
		System.out.println("i am the first");
	}
	
@Test
	
	public void Software()
	{
		System.out.println("i am the Test");
	}
	
	
	@AfterSuite
	
	public void Done()
	{
		System.out.println("i am the Last");
	}
	
}
