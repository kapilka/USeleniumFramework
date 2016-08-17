package Basics;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserinvocation {
	

	public static void main(String[] args) {

	//	System.setProperty(webdriver.chrome.driver, value)
		//WebDriver driver = new ChromeDriver();
		// classobject.methodname

		WebDriver driver = new FirefoxDriver();
		driver.get("http://qaclickacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();


	}

}
