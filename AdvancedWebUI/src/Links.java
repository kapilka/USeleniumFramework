import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ebay.com");
		System.out.println("links on web page");
		// count of links present in webpage
		System.out.println(driver.findElements(By.tagName("a")).size());
		
	
		WebElement footer=driver.findElement(By.cssSelector("footer[id=glbfooter]"));
		System.out.println("links on footer page");

	System.out.println(footer.findElements(By.tagName("a")).size());
	
	//get the links present on sellcolumn
	WebElement sellcolumn=driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
	System.out.println("links on sellcolumn ");
	System.out.println(sellcolumn.findElements(By.tagName("a")).size());
	String BeforeClicking = null;
	String AfterClicking;
	
	//links name
	for(int i=0;i<sellcolumn.findElements(By.tagName("a")).size();i++)
	{
		//System.out.println(sellcolumn.findElements(By.tagName("a")).get(i).getText());
		
		if(sellcolumn.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
		{
			System.out.println(driver.getTitle());
			BeforeClicking=driver.getTitle();
			sellcolumn.findElements(By.tagName("a")).get(i).click();
			System.out.println("Clicked on Site map");
			break;
			
		}
		System.out.println(driver.getTitle());
		AfterClicking=driver.getTitle();

		if(BeforeClicking!=AfterClicking)
		{
			if(driver.getPageSource().contains("View our sitemap..."));
			System.out.println("PASS");
			break;
		}
		else
		{
			System.out.println("Fail");

		}
		
			}
	
	
	}

}
