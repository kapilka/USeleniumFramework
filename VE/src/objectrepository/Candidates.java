package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Candidates {

	WebDriver driver;
	//Actions actions=new Actions(driver);

	public Candidates(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	
	@FindBy(xpath=".//*[@id='Candidates_navItem_label']")
	WebElement navigatecandidates;
	
	@FindBy(xpath=".//*[@id='revit_navigation_NavItem_3']")
	WebElement candidateNewSearch;
	
	@FindBy(xpath=".//*[@id='revit_navigation_NavItem_4_label']")
	WebElement candidateSearchResult;
	
	@FindBy(xpath="//*[@id='revit_navigation_NavItem_6_label']")
	WebElement externalCandidate;
	
	
	public WebElement Navigatecandidates()
	{
		return navigatecandidates;
	}
	
	public WebElement CandidateNewSearch()
	{
		return candidateNewSearch;
	}
	
	public WebElement CandidateSearchResult()
	{
		return candidateSearchResult;
	}
	
	public WebElement ExternalCandidate()
	{
		return externalCandidate;
	}
	
	
}
