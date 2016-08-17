package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FieldIsDisplayed {

	public static void main(String[] args) {

	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.makemytrip.com/");
	System.out.println("Before clicking on Multi City");
	//isDisplayed is only use if element is present on website and is hidden/invisible or not
	System.out.println(driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());   // to check if field is displayed
	driver.findElement(By.xpath(".//*[@id='multi_city_button']/span")).click();
	System.out.println("after clicking on Multi City");
	System.out.println(driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());

	//if you want to validate if object is present on web page or code base
	int count=driver.findElements(By.xpath("abcdxyz")).size();
	if(count==0)
	{
		System.out.println("Verified");
	}	
	}

}
