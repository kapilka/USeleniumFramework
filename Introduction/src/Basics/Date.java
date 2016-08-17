package Basics;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import junit.framework.Assert;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www1.virtualedge.fiti.ve.whc/ETRACKSystem/index.cfm?FuseAction=EMS");
		driver.findElement(By.name("Company")).sendKeys("VEDemoWEST");
		driver.findElement(By.name("UserName")).sendKeys("VEDemoWESTadmin");
		driver.findElement(By.name("Password")).sendKeys("@dprm1301");
		driver.findElement(By.name("btnSubmit")).click();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		//click on Search button
		driver.findElement(By.xpath(".//*[@id='mainSearchContainer_tablist_searchFilterPanel']/span[1]")).click();
	    //click on Date 
		driver.findElement(By.xpath(".//*[@id='widget_TXTFROMSEARCHDATE']/div[3]/div")).click();
		//select Date
		driver.findElement(By.xpath(".//*[@id='TXTFROMSEARCHDATE_popup']/tbody/tr[4]/td[4]/span")).click();
		
		//Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='TXTFROMSEARCHDATE_popup']/tbody/tr[4]/td[4]/span")).click());
		// to click/expand icon 5 times
		int i=0;
		while(i<5)
		{
		driver.findElement(By.xpath(".//*[@id='revit_layout_TitlePane_1']/div[1]/div/img")).click();
		i++;
		}
	}

}
