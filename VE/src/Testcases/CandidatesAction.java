package Testcases;

import objectrepository.Candidates;
import objectrepository.VirtualEdgeLoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class CandidatesAction {

	
	@Test
	
	public void CandidateNavigation() throws InterruptedException
	{
		
		WebDriver driver = null;
		Loginapplication LA=new Loginapplication();
		LA.Login();
		
		Thread.sleep(10000L);
		Candidates Cand=new Candidates(driver);
		
		Actions candidate=new Actions(driver);
		
		WebElement element=driver.findElement(By.xpath(".//*[@id='Candidates_navItem_label']"));

		candidate.moveToElement(element).build().perform();
		
		driver.findElement(By.xpath(".//*[@id='revit_navigation_NavItem_6_label']")).click();
	

	}
}
