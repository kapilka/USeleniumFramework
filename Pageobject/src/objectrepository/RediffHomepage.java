package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomepage {

	WebDriver driver;
	
	public RediffHomepage(WebDriver driver) {
		
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	

	 
	By search= By.id("srchinputcopy");
	By submit= By.xpath("//input[@type='submit']");
	
	
		
	public WebElement Submit()
	{
		return driver.findElement(submit);
	}

	public WebElement Search() {
		// TODO Auto-generated method stub
		return driver.findElement(search);
	}
	
}
