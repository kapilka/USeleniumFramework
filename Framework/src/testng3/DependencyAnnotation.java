package testng3;

import org.testng.annotations.Test;

public class DependencyAnnotation {

	@Test
	
	public void openingBrowser()
	{
		System.out.println("Opening browser...");
		
	}
	
@Test(dependsOnMethods={"openingBrowser"},alwaysRun=true)   // if still you want to run this test even if dependen fails then give alwaysRun=true	
	
	public void BookingTicket()
	{
		System.out.println("Booking Ticket..");
		
	}
	
@Test(enabled=false)

public void thirdTestcase()
{
	System.out.println("Third TestCase");
}


@Test(timeOut=5000) // if you want this test to be execute in 5 sec

public void Timeout()
{
System.out.println("timeout test");
}

}







