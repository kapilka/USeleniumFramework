package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VirtualEdgeLoginPage {

	WebDriver driver;
	//Actions actions=new Actions(driver);

	public VirtualEdgeLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(xpath="html/body/div[1]/ul[1]/li[1]")
	WebElement selectEnvironment;
	
	@FindBy(xpath=".//*[@id='administrator']")
	WebElement administratorLogin;
	
	@FindBy(id="USER")
	WebElement UserID;
	
	@FindBy(xpath=".//*[@id='registrationForm']/div[3]/div[2]")
	WebElement submit;
	
	@FindBy(xpath=".//*[@id='activationCodeForm']/table/tbody/tr[1]/td")
	WebElement activationCodeTxt;
	
	@FindBy(id="acCode")
	WebElement activationCode;
	
	
	//Challenge Question and Answer 1
	@FindBy(id="question1")
	WebElement question1;
	

	@FindBy(id="answer1")
	WebElement answer1;
	
	//Challenge Question and Answer 2
	@FindBy(id="question2")
	WebElement question2;
		

	@FindBy(id="answer2")
	WebElement answer2;

	//Challenge Question and Answer 3
	@FindBy(id="question3")
	WebElement question3;
				

	@FindBy(id="answer3")
	WebElement answer3;
	
	@FindBy(xpath=".//*[@id='revit_form_Button_3']")
	WebElement next;
	
	@FindBy(id="password")
	WebElement password;

	@FindBy(xpath=".//*[@id='revit_form_Button_4']")
	WebElement done;

	@FindBy(id="passwordForm:password")
	WebElement passwordFormpassword;
	
	//@FindBy(name="selCustomerOOId")
	//WebElement selCustomerOOId;
	
	@FindBy(xpath="html/body/form/table[1]/tbody/tr[3]/td[2]/select")
	WebElement selCustomerOOId;
	
	
	 @FindBy(xpath="html/body/form/table[2]/tbody/tr/td/input")
	 WebElement customersubmitbutton;
			

	
	public WebElement SelCustomerOOId()
	{
			return selCustomerOOId;
	}
	
	public WebElement Customersubmitbutton()
	{
			return customersubmitbutton;
	}

	
	
	
	public WebElement PasswordFormpassword()
	{
			return passwordFormpassword;
	}


	public WebElement Password()
		{
				return password;
		}


	public WebElement Nextbutton()
		{
				return next;
		}

	public WebElement donebutton()
	{
			return done;
	}

	

	public WebElement Question1()
			{
				return question1;
			}
		
	public WebElement Answer1()
			{
			return answer1;
			}
			
	public WebElement Question2()
			{
				return question2;
			}
		
	public WebElement Answer2()
			{
			return answer2;
			}
		
			
 public WebElement Question3()
			{
				return question3;
			}
		
	public WebElement Answer3()
			{
			return answer3;
			}
		
			
		
		public WebElement ActivationCode()
		{
	//	System.out.println(getactivationcode);
		return activationCode;
	}
		
		public WebElement ActivationCodeText()
		{
	//	System.out.println(getactivationcode);
		return activationCodeTxt;
	}
	
	public WebElement SelectEnvironment()
	{
		return selectEnvironment;
	}

	public WebElement AdministratorLogin() {
		// TODO Auto-generated method stub
		return administratorLogin;
	}
	
	public WebElement user()
	{
		
		return UserID;
	}
	
	public WebElement Submit()
	{
		
		return submit;
	}
	
					
}
