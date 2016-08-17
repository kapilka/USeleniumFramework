package testngFiles;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class TestEamil {
	 WebDriver driver;


		@BeforeTest()
		public void setup()
		{
		    driver = new FirefoxDriver();
			driver.get("https://www.google.co.in/?gws_rd=ssl");
			Set<Cookie>abcd=driver.manage().getCookies();
			System.out.println("Cookies are present ="+abcd.size());
			driver.manage().deleteAllCookies(); // to delete cookies
			driver.manage().window().maximize(); // to maximize
			
			driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
			
		}

}
