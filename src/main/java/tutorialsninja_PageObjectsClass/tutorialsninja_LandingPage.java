package tutorialsninja_PageObjectsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tutorialsninja_Base.tutorialsninja_BaseClass;

public class tutorialsninja_LandingPage extends tutorialsninja_BaseClass {
       public WebDriver driver;
	
	public tutorialsninja_LandingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[normalize-space()='My Account']")
	public WebElement MyAccountDropDown;
	
    @FindBy(linkText="Login")
	public WebElement login;
    
    @FindBy(xpath="//a[normalize-space()='Register']")
    public WebElement Register;
	
	public WebElement MyAccountDropDown() {
		
		return MyAccountDropDown;
	}
    public WebElement login() {
		
		return login;
	}
    
    public WebElement RegisterText() {
		
		return Register;
	}
	

}
