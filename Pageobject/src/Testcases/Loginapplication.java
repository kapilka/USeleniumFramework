package Testcases;

import objectrepository.RediffHomepage;
import objectrepository.RediffLoginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Loginapplication {

	
	// Login page RediffLoginpage has PageObject Factory model
	// RediffHomepage has normal Page object model
	
	@Test()
	public void Login()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginpage rd=new RediffLoginpage(driver);
		rd.Username().sendKeys("hello usernmae");
		rd.Password().sendKeys("hello pass");
		rd.Home().click();
		//rd.go().click();
		
		RediffHomepage rhome=new RediffHomepage(driver);
		rhome.Search().sendKeys("rediff");
		rhome.Submit().click();
	
	}
	
	
}
