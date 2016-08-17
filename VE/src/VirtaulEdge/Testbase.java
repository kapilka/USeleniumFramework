package VirtaulEdge;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

@Test
public class Testbase {

	public WebDriver driver=null;
	
	public void login() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Udemy\\VE\\src\\VirtaulEdge\\datadriven.properties"); // in java provides double \\
		prop.load(fis);
		
		System.out.println(prop.getProperty("Company"));
		
		if(prop.getProperty("Browser").equals("firefox"))
		{
		 driver= new FirefoxDriver();
		}
		else if(prop.getProperty("Browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
			
		}
		else
		{
			 driver= new InternetExplorerDriver();

		}
		
		driver.get(prop.getProperty("url"));


		
	}
}
