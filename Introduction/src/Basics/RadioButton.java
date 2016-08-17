package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
        driver.get("https://www1.virtualedge.fiti.ve.whc/ETRACKSystem/index.cfm?FuseAction=EMS");
		
		driver.findElement(By.name("Company")).sendKeys("VEDemoWEST");
		driver.findElement(By.name("UserName")).sendKeys("VEDemoWESTadmin");
		driver.findElement(By.name("Password")).sendKeys("@dprm1301");
		driver.findElement(By.name("btnSubmit")).click();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		//click on Search tab
		driver.findElement(By.xpath(".//*[@id='mainSearchContainer_tablist_searchFilterPanel']/span[1]")).click();
		//click on Candidate Filters
		driver.findElement(By.xpath(".//*[@id='revit_layout_TitlePane_1']/div[1]/div")).click();
		//click on Activity Filters
		driver.findElement(By.xpath(".//*[@id='revit_layout_TitlePane_2']/div[1]/div/img")).click();
		//Click on radio button Requisition Hotfile	Excl
		//driver.findElement(By.xpath(".//*[@id='SELJOBHFEXL']")).click();
		
		//click on all radio button on the page
		
		System.out.println(driver.findElements(By.xpath(".//*[@type='radio']")).size());
		
		 int count=driver.findElements(By.xpath(".//*[@type='radio']")).size();
		 		
		for(int i=0;i<count;i++)
		{	
			//driver.findElements(By.xpath(".//*[@type='radio']")).get(i).click();
			//get the id of all radio buttons present on the page
			System.out.println(driver.findElements(By.xpath(".//*[@type='radio']")).get(i).getAttribute("id"));
				
			String text =driver.findElements(By.xpath(".//*[@type='radio']")).get(i).getAttribute("id");
			if(text.equals("chkDrillDownCandSearch2"))
			{
				driver.findElements(By.xpath(".//*[@type='radio']")).get(i).click();
			}
		}
		
		
	}

}
