package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomizedXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://commonag-ve-fit.nj.adp.com/prohv/public/index.cfm?fuseAction=SetEnvironmentRoute");
			
		driver.get("https://www1.virtualedge.fiti.ve.whc/ETRACKSystem/index.cfm?FuseAction=EMS");
				//driver.findElement(By.xpath("html/body/div[1]/ul[1]/li[1]")).click();		
				//driver.findElement(By.xpath("")).click();
		
		driver.findElement(By.name("Company")).sendKeys("VEDemoWEST");
		driver.findElement(By.name("UserName")).sendKeys("VEDemoWESTadmin");
		driver.findElement(By.name("Password")).sendKeys("@dprm1301");
		driver.findElement(By.name("btnSubmit")).click();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		//customized xpath
		//     //tagname[@attribute='value']
		//     //*[@attribute='value']
		//writing Customized xpath using tagnames Traversing as below .sendKeys("test")
		driver.findElement(By.xpath("//div[@id='widget_revit_form_TextBox_0']/div[1]/input")).sendKeys("test");
		
		//driver.findElement(By.id("//*[@id='revit_navigation_NavItem_10_label']")).click();

		

	}

}
