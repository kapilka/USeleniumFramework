import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserTest {

	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		
	System.setProperty("webdriver.ie.driver","C:\\Drivers\\IEDriverServer.exe");
		
	//WebDriver driver = new FirefoxDriver();
		
	//WebDriver driver = new ChromeDriver();

	WebDriver driver = new InternetExplorerDriver();
	driver.get("http://google.com");

		
	
	}

}
