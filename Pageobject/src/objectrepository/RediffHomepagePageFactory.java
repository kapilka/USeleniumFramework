package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomepagePageFactory {

	WebDriver driver;
	
	public RediffHomepagePageFactory(WebDriver driver) {
		
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	//By search= By.id("srchinputcopy");
	//By submit= By.xpath("//input[@type='submit']");
	
	@FindBy(id="srchinputcopy")
	WebElement search;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	
		
	public WebElement Submit()
	{
		return submit;
	}

	public WebElement Search() {
		// TODO Auto-generated method stub
		return search;
	}
	
}
