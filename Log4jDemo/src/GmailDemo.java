import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GmailDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Logger logger=Logger.getLogger("GmailDemo");
		PropertyConfigurator.configure("C:\\USeleniumFramework\\Log4jDemo\\log4j.properties");
		WebDriver driver = new FirefoxDriver();
		
		logger.info("opening browser");
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");	
		logger.info("Browser opened");
		
		try {
			driver.findElement(By.xpath("//input[@id='EmailTEST']")).sendKeys("ABCD@abc.com");;
			logger.info("Email info is sent ");

			
		} catch (Exception e) {
			
			logger.error("There is an error in sending email");
		}
		
				
		
	}

}
