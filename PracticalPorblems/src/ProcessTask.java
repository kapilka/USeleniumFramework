import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.os.WindowsUtils;


public class ProcessTask {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//WindowsUtils.tryToKillByName("notepad.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		Set<Cookie>abc=driver.manage().getCookies();
		System.out.println(abc.size());
		driver.manage().deleteAllCookies();
		Set<Cookie>abcd=driver.manage().getCookies();
		System.out.println(abcd.size());
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//now you can do whatever you need to do with it,example copy somewhere
		FileUtils.copyFile(scrFile, new File("H:\\Screenshot.png"));
		
		
	}

}
