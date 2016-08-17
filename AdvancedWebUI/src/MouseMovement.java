import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseMovement {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.in");
		Actions abc=new Actions(driver);
		WebElement element=driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[2]"));
		abc.moveToElement(element).build().perform();
		
		// to enter letters in text box
		WebElement element1=driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
		abc.keyDown(Keys.SHIFT).moveToElement(element1).sendKeys("small letters").build().perform();
		
		// to right click on page
		abc.contextClick(element1).build().perform();
		
		// to drag and drop
		//abc.dragAndDrop(source, target);
		
		
	}

}
