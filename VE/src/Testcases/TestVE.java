package Testcases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import objectrepository.VirtualEdgeLoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestVE {

	WebDriver driver;
	
    @Test(priority=0)
	public void setup(){
		
		WebDriver driver = new FirefoxDriver();
		  Set<Cookie>abcd=driver.manage().getCookies();
		  System.out.println(abcd.size());
		driver.manage().deleteAllCookies(); // to delete cookies

			
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		driver.get("https://commonag-ve-fit.nj.adp.com/prohv/public/index.cfm?fuseAction=SetEnvironmentRoute");
		
	}
	
    @Test(priority=1)
	public void LogintoVE() throws InterruptedException{
		
		
		VirtualEdgeLoginPage VELP=new VirtualEdgeLoginPage(driver);
		VELP.SelectEnvironment().click();
		VELP.AdministratorLogin().click();
		VELP.user().sendKeys("KKhurana@adp");
		VELP.Submit().click();		
		String txt = VELP.ActivationCodeText().getText();
		System.out.println(txt);
		VELP.ActivationCode().sendKeys(txt.trim());
		VELP.Nextbutton().click();
			
		
	// setting answer for question1	
		if(VELP.Question1().getText().contains("mother"))
		{
			VELP.Answer1().sendKeys("mother");
		}
		
		else 
			if(VELP.Question1().getText().contains("father"))
			{
				VELP.Answer1().sendKeys("father");
			}
			else
				if(VELP.Question1().getText().contains("pet"))
				{
					VELP.Answer1().sendKeys("pet");
				}
		// setting answer for question2

		if(VELP.Question2().getText().contains("mother"))
		{
			VELP.Answer2().sendKeys("mother");
		}
		
		else 
			if(VELP.Question2().getText().contains("father"))
			{
				VELP.Answer2().sendKeys("father");
			}
			else
				if(VELP.Question2().getText().contains("pet"))
				{
					VELP.Answer2().sendKeys("pet");
				}
		
		// setting answer for question3	
	
		if(VELP.Question3().getText().contains("mother"))
		{
			VELP.Answer3().sendKeys("mother");
		}
		
		else 
		if(VELP.Question3().getText().contains("father"))
		{
				VELP.Answer3().sendKeys("father");
		}
		
		else
		if(VELP.Question3().getText().contains("pet"))
				{
					VELP.Answer3().sendKeys("pet");
			}
		
		
		VELP.Nextbutton().click();
		VELP.Password().sendKeys("adpadp10");
		Thread.sleep(5000L);

		VELP.donebutton().click();
		Thread.sleep(5000L);
		
		if(VELP.SelCustomerOOId().getText().contains("Maritz"))
		{
			System.out.println("Maritz is Visible...");
			
		}
		
		Select client = new Select(driver.findElement(By.xpath("html/body/form/table[1]/tbody/tr[3]/td[2]/select")));	
		client.selectByValue("56c5a380334553a4ba16e7e6cde5de61760c10419f57fa1e7cda21d12be13614");
		
		VELP.Customersubmitbutton().click();
			
	}
	
	
	
}
