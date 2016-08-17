import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class TableRowsColumns {

	public static void main(String[] args) {
		//handling http certificate,a pop up appears that your are trying to access untrusted websites....
		FirefoxProfile prof=new FirefoxProfile();
		prof.setAssumeUntrustedCertificateIssuer(false);
		WebDriver driver = new FirefoxDriver(prof);
			
		driver.get("https://www1.virtualedge.fiti.ve.whc/ETRACKSystem/index.cfm?FuseAction=EMS");
		driver.manage().deleteAllCookies(); // to delete cookies
		Set<Cookie>abcd=driver.manage().getCookies();
		System.out.println(abcd.size());
		
		driver.manage().window().maximize(); // to maximize
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		driver.findElement(By.name("Company")).sendKeys("VEDemoWEST");
		driver.findElement(By.name("UserName")).sendKeys("VEDemoWESTadmin");
		driver.findElement(By.name("Password")).sendKeys("@dprm1301");
		driver.findElement(By.name("btnSubmit")).click();
		WebElement table=driver.findElement(By.className("data"));
		//finding rows in table
		List<WebElement>noofrows=table.findElements(By.tagName("tr"));
		System.out.println("Rows are "+noofrows.size());
		
		int i=0;
		//finding column count in each row
		for(WebElement eachrow:noofrows)
		{
			List<WebElement>eachcolumn=eachrow.findElements(By.tagName("td"));
			i++;
			System.out.println("No of column in "+i+"th row are"+eachcolumn.size());
			
			// finding cell value
			for(WebElement text:eachcolumn)
			{
				System.out.println(text.getText());
			}
			
		}
		
	}

}
