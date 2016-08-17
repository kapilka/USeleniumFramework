import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AutoSugDropDown {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://fantasycricket.dream11.com/IN/");
		
		WebDriverWait wt=new WebDriverWait(driver,5);
		driver.findElement(By.xpath(".//*[@id='m_rtxtEmail1']")).sendKeys("as");
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='m_frmRegister']/div[1]/ul")));
		driver.findElement(By.xpath(".//*[@id='m_frmRegister']/div[1]/ul/li[3]/p")).click();
		
		
	}

}
