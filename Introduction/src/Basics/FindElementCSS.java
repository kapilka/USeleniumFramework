package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementCSS {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
			
		driver.get("https://www1.virtualedge.fiti.ve.whc/ETRACKSystem/index.cfm?FuseAction=EMS");
			
		driver.findElement(By.name("Company")).sendKeys("VEDemoWEST");
		driver.findElement(By.name("UserName")).sendKeys("VEDemoWESTadmin");
		driver.findElement(By.name("Password")).sendKeys("@dprm1301");
		driver.findElement(By.name("btnSubmit")).click();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		/* customized xpath
		  Xpath = //tagname[@attribute='value']
		  Xpath =  //*[@attribute='value']
		writing Customized xpath using tagnames Traversing as below .sendKeys("test")
		*/
		driver.findElement(By.xpath("//div[@id='widget_revit_form_TextBox_0']/div[1]/input")).sendKeys("test");
		

		/* CSS is 10 times faster than Xpaths and class under the class can be identified only by CSS
		
		   css == tagname[attribute='value']
		
		 remember, while using css, if there is space in value then use .(dot)
		 
		 session learnt-
		 1. verify in firebug before you run the script
		 2. css customized xpath
		 3. #idname
		 .classname
		 4. find the unique attribute
		 	 	
	 	*/

		driver.findElement(By.cssSelector("span[class='revitDockButtonLabel dijitInline']")).click();	
		}
	
	
}
