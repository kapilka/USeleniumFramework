package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetText {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www1.virtualedge.fiti.ve.whc/ETRACKSystem/index.cfm?FuseAction=EMS");
		driver.findElement(By.name("Company")).sendKeys("VEDemoWEST");
		driver.findElement(By.name("UserName")).sendKeys("VEDemoWESTadmin");
		driver.findElement(By.name("Password")).sendKeys("@dprm1301");
		driver.findElement(By.name("btnSubmit")).click();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		//click on Search button
		driver.findElement(By.xpath(".//*[@id='mainSearchContainer_tablist_searchFilterPanel']/span[1]")).click();
	    //Get text present on web page
		System.out.println(driver.findElement(By.xpath(".//*[@id='revit_layout_TitlePane_0_pane']/fieldset[2]/table/tbody/tr/td[2]/div[1]/label")).getText());
	}

}
