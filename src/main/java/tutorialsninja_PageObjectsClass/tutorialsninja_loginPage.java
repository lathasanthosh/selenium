package tutorialsninja_PageObjectsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tutorialsninja_Base.tutorialsninja_BaseClass;

public class tutorialsninja_loginPage extends tutorialsninja_BaseClass{
	
    public WebDriver driver;
	
	public tutorialsninja_loginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= " //input[@id='input-email']")
	public WebElement E_Mail;
	
    @FindBy(xpath=" //input[@id='input-password']")
	public WebElement Password;
    
    @FindBy(xpath=" //input[@value='Login']")
    public WebElement loginButton;
    
    public void EmailAddress(String Uname)
	{
    	E_Mail.sendKeys(Uname);
	}
	public void setPassWord(String Pword)
	{
		Password.sendKeys(Pword);
	}
	public void ClickLogin()
	{
		loginButton.click();
		
	}

}
