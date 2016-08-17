import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class VEMouseMovement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www1.virtualedge.fiti.ve.whc/ETRACKSystem/index.cfm?FuseAction=EMS");
		driver.findElement(By.name("Company")).sendKeys("VEDemoWEST");
		driver.findElement(By.name("UserName")).sendKeys("VEDemoWESTadmin");
		driver.findElement(By.name("Password")).sendKeys("@dprm1301");
		driver.findElement(By.name("btnSubmit")).click();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		//mouse hover to Requisition
		Actions requisition=new Actions(driver);
		
	WebElement element=driver.findElement(By.xpath(".//*[@id='Requisitions_navItem_label']"));
	requisition.moveToElement(element).build().perform();
	
	driver.findElement(By.xpath(".//*[@id='revit_navigation_NavItem_12_label']")).click();
		

	}

}
