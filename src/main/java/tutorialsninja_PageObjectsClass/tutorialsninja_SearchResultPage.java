package tutorialsninja_PageObjectsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tutorialsninja_Base.tutorialsninja_BaseClass;

public class tutorialsninja_SearchResultPage extends tutorialsninja_BaseClass {
	 public WebDriver driver;
		
		public tutorialsninja_SearchResultPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
	
	@FindBy(xpath=" //input[@placeholder='Search']")
	public WebElement Searchtext;
	
	@FindBy(xpath=" //i[@class='fa fa-search']")
	public WebElement SearchButton;
	
	@FindBy(linkText="Search")
	public WebElement SearchResultPage;
	
	public void VerifySearchparoductPage(String ProductName)
	{
		Searchtext.sendKeys(ProductName);
	}
	
	public WebElement ClickSearchButton()
	{
		return SearchButton;
	}
	public WebElement SearchResultPage()
	{
		return SearchResultPage;
	}
}
