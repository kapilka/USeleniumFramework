import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class IdentifyingFrames {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://fantasycricket.dream11.com/IN/");
		int number=gotoframe(driver,By.xpath(".//*[@id='recaptcha-anchor']/div[5]"));
		driver.switchTo().frame(number);
		driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();		
		
	}
	public static int gotoframe(WebDriver driver1,By by)

	{

	driver1.switchTo().defaultContent();

	int i;

	int num = -1;

	int a=driver1.findElements(By.tagName("iframe")).size();

	for(i=0;i<a;i++)

	{

	driver1.switchTo().defaultContent();

	driver1.switchTo().frame(i);

	int b=driver1.findElements(by).size();

	if(b>0)

	{

	num=i;

	break;

	}

	}

	driver1.switchTo().defaultContent();

	return num;

	}}
/*
	public static int findFrameNumber(WebDriver driver,By by)
	{
		int i;
		int framecount=driver.findElements(By.tagName("iframe")).size();
		for(i=0;i<framecount;i++)
		{
			driver.switchTo().frame(i);
		int	count=driver.findElements(by).size();
		if(count>0)
		{
			break;
		}
		else
		{
			System.out.println("continue looping");
		}
		}
		driver.switchTo().defaultContent();
		return i;

	}
	
}
*/