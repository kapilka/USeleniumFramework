package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Chrome_DropdownFields {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www1.virtualedge.fiti.ve.whc/ETRACKSystem/index.cfm?FuseAction=EMS");
		
		driver.findElement(By.name("Company")).sendKeys("VEDemoWEST");
		driver.findElement(By.name("UserName")).sendKeys("VEDemoWESTadmin");
		driver.findElement(By.name("Password")).sendKeys("@dprm1301");
		driver.findElement(By.name("btnSubmit")).click();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		//driver.findElement(By.xpath("//img[@class='candidateSearch']")).click();
		
		//System.out.println(driver.getPageSource());

		
		//click on Search button
		driver.findElement(By.xpath(".//*[@id='mainSearchContainer_tablist_searchFilterPanel']/span[1]")).click();
		
		
		// click on Order By
		driver.findElement(By.xpath(".//*[@id='widget_ORDERBY']/div[1]")).click();
		
		//unable to find value for drop down
		
		//driver.switchTo().frame("idIFrame");
		driver.findElement(By.linkText("Source (A-Z)")).click();
		//driver.findElement(By.partialLinkText("Source (A-Z)")).click();
		
		// if you want to access any methods in class, create object for that class using object.method
		
		
		/*
		  not working for static drop down
		Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='widget_ORDERBY']/div[1]")));	
		
		dropdown.selectByVisibleText("Source (A-Z)");
		*/
		
		
		// Checking for CheckBox
		
		//driver.findElement(By.xpath(".//*[@id='SuperUserInactive']")).click();
		//driver.findElement(By.xpath(".//*[@id='SuperUserInactive']")).isSelected();
		
		//printing if checkbox is selected or not
		//System.out.println(driver.findElement(By.xpath(".//*[@id='SuperUserInactive']")).isSelected());
	}

}
