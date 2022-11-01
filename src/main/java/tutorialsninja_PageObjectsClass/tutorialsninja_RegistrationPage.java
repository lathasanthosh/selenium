package tutorialsninja_PageObjectsClass;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tutorialsninja_Base.tutorialsninja_BaseClass;

public class tutorialsninja_RegistrationPage extends tutorialsninja_BaseClass  {
	  public WebDriver driver;
		
		public tutorialsninja_RegistrationPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//h1[normalize-space()='Register Account']")
	public WebElement Register_Account_Text;
	
	@FindBy(xpath="//legend[normalize-space()='Your Personal Details']")
	public WebElement PersonalDetails;
	
	@FindBy(name="firstname")
	public WebElement FirstNameOfRegister;
	
	@FindBy(name="lastname")
	public WebElement lastNameOfRegister;
	
	@FindBy(name="email")
	public WebElement emailRegister;
	
	@FindBy(name="telephone")
	public WebElement telephoneRegister;
	
	@FindBy(xpath="//legend[normalize-space()='Your Password']")
	public WebElement YourPassword;
	
	@FindBy(name="password")
	public WebElement passwordRegister;
	
	@FindBy(name="confirm")
	public WebElement ConfirmPasswordRegister;
	
	@FindBy(xpath="//label[normalize-space()='Yes']")
	public WebElement newsletterYes;
	
	@FindBy(xpath="n//input[@value='0']")
	public WebElement newsletterNo;
	
	@FindBy(xpath="//input[@name='agree']")
	public WebElement PrivacyPolice;
	
	@FindBy(xpath="//input[@value='Continue']")
	public WebElement continueButton;
	
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	public WebElement YourAccountHasBeenCreated;
	
	@FindBy(xpath=" //a[normalize-space()='Continue']")
	public WebElement ContinueAfterRegister;
	
	
	
public WebElement validteRegisterpage() {
	
		return Register_Account_Text;
	}
	public void RegisterPageData(String fname,String lname,String Email,String telephoneno,String password,String conformpassword)
	{
		
		FirstNameOfRegister.sendKeys(fname);
		lastNameOfRegister.sendKeys(lname);
		emailRegister.sendKeys(Email);
		telephoneRegister.sendKeys(telephoneno);
		passwordRegister.sendKeys(password);
		ConfirmPasswordRegister.sendKeys(conformpassword);	
	}
	public WebElement PrivacyPolice()
	{
		return PrivacyPolice;
	}
	
	public WebElement clickRegister()
	{
		return continueButton;
	}
	
	public WebElement VerifyRegisterSucces() 
	{
		return  YourAccountHasBeenCreated;
	}
	
	public WebElement clickRegisterAfter()
	{
		return  ContinueAfterRegister;
	}
	

}
