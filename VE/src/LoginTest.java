import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
			
		driver.get("https://www1.virtualedge.fiti.ve.whc/ETRACKSystem/index.cfm?FuseAction=EMS");
		
		driver.findElement(By.name("Company")).sendKeys("VEDemoWEST");
		driver.findElement(By.name("UserName")).sendKeys("VEDemoWESTadmin");
		driver.findElement(By.name("Password")).sendKeys("@dprm1301");
		driver.findElement(By.name("btnSubmit")).click();
		
		Actions candidate=new Actions(driver);
		
	WebElement element=driver.findElement(By.xpath(".//*[@id='Candidates_navItem_label']"));

	candidate.moveToElement(element).build().perform();
	
	driver.findElement(By.xpath(".//*[@id='revit_navigation_NavItem_7_label']")).click();
	
	driver.findElement(By.xpath(".//*[@id='ddgtxt_Jobseeker_FirstName']")).sendKeys("Kapil");
	
	driver.findElement(By.xpath(".//*[@id='ddgtxt_Jobseeker_LastName']")).sendKeys("KapiLastname");
	
	driver.findElement(By.xpath(".//*[@id='ddgtxt_Jobseeker_City']")).sendKeys("city");
	
	//driver.findElement(By.xpath(".//*[@id='widget_ddgsel_Jobseeker_CountryID']/div[1]/input")).click();
	
	//driver.findElement(By.xpath(".//*[@id='ddgsel_Jobseeker_CountryID_popup14']")).click();
	//driver.findElement(By.xpath("//li[text()='Singapore']")).click();
	
	//.//*[@id='ddgsel_Jobseeker_CountryID']
	
	driver.findElement(By.xpath("//*[@id='ddgsel_Jobseeker_CountryID']")).sendKeys("Singapore");
	driver.findElement(By.xpath(".//*[@id='ddgsel_Jobseeker_CountryID_popup0']")).click();
	
	driver.findElement(By.xpath(".//*[@id='widget_ddgsel_Jobseeker_StateID']/div[1]/input")).click();
	
	driver.findElement(By.xpath(".//*[@id='ddgsel_Jobseeker_StateID_popup4']")).click();
	
	
	driver.findElement(By.xpath(".//*[@id='widget_ddgsel_Jobseeker_JobSeekerTypeID']/div[1]/input")).click();
	driver.findElement(By.xpath(".//*[@id='ddgsel_Jobseeker_JobSeekerTypeID_popup0']")).click();
		
	
	
	//contains
	//ddgsel_Jobseeker_JobSeekerTypeID_popup0
	
	/*
	 * Select candidattype= new Select(driver.findElement(By.xpath(".//*[@id='ddgsel_Jobseeker_JobSeekerTypeID']")));
	 
	
	candidattype.selectByVisibleText("Internal");
	candidattype.selectByValue("1");
	*/
	
	
	
	
	
	

	}

}
