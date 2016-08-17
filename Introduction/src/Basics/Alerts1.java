	package Basics;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
		
		System.out.println(driver.switchTo().alert().getText());  // to check the text present on Alert PopUp
		driver.switchTo().alert().accept(); // accept is clicking positive buttons exampl ok, save,done
		//driver.switchTo().alert().dismiss();  // to cancel
		
	}

}
