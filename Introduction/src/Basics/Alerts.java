package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) {
		
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www1.virtualedge.fiti.ve.whc/ETRACKSystem/index.cfm?FuseAction=EMS");
	
	driver.findElement(By.name("Company")).sendKeys("VEDemoWEST");
	driver.findElement(By.name("UserName")).sendKeys("VEDemoWESTadmin");
	driver.findElement(By.name("Password")).sendKeys("@dprm1301");
	driver.findElement(By.name("btnSubmit")).click();
	driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
	//click on HotFiles
	driver.findElement(By.xpath(".//*[@id='mainSearchContainer_tablist_hotfilesPanel']/span[1]")).click();
	System.out.println(driver.getPageSource());

	driver.switchTo().frame("idIFrame");

	driver.findElement(By.xpath(".//*[@id='revit_form_Button_33']/span[1]")).click();

	//driver.findElement(By.linkText("Add HotFile")).click();
	//driver.findElement(By.partialLinkText("Add HotFile")).click();
	//driver.findElement(By.name("Add HotFile")).click();
	//driver.findElement(By.id("//*[id='revit_form_Button_47_label']")).click();
	//driver.findElement(By.xpath("//*[id='revit_form_Button_47_label']")).click();
	//driver.findElement(By.linkText("//*[id='revit_form_Button_47_label']")).click();
	//driver.findElement(By.cssSelector("span[id='revit_form_Button_47_label']")).click();
	//driver.findElement(By.linkText("span[id='revit_form_Button_47_label']")).click();

	/*
	driver.findElement(By.linkText("Doe, Bill")).click();
	driver.manage().timeouts().implicitlyWait(40000,TimeUnit.MILLISECONDS);
	*/
	
	//driver.findElement(By.linkText("Rollback")).click();
	//driver.findElement(By.partialLinkText("Rollback")).click();
	
		
	}

}
