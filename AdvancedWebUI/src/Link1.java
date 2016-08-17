import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Link1 {

	//@SuppressWarnings("unused")
	public static void main(String[] args) {

		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.ebay.com");
		
		WebElement coll=driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		System.out.println(coll.findElements(By.tagName("a")).size());
		String BeforeClicking = null;
		String AfterClicking;
		
		for(int i=0;i<coll.findElements(By.tagName("a")).size(); i++)
		{
			System.out.println(i);
			
			if(coll.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
		//	if(coll.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
			{
				System.out.println("12345");

			BeforeClicking=driver.getTitle();
			coll.findElements(By.tagName("a")).get(i).click();
			System.out.println("Clicked on Site map");
			break;
			}
			
			
			AfterClicking=driver.getTitle();
			
			if(BeforeClicking!=AfterClicking)
			{
				if(driver.getPageSource().contains("View our sitemap"))
				System.out.println("PASS");
				break;
			}
			
			else 
			{
				System.out.println("Fail");
				break;
			}
		}
			
	}

}
