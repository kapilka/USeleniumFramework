import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Chrome {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();

		driver.get("file:///H:/reports/report.html");
		Set<Cookie>abcd=driver.manage().getCookies();
		System.out.println("Cookies are present ="+abcd.size());
		driver.manage().deleteAllCookies(); // to delete cookies
		driver.manage().window().maximize(); // to maximize
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		System.out.println("Scroll down");
		driver.findElement(By.id("extent-container")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(5000);
		

	}

}
