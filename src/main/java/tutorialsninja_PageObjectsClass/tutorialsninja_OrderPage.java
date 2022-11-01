package tutorialsninja_PageObjectsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tutorialsninja_Base.tutorialsninja_BaseClass;

public class tutorialsninja_OrderPage extends tutorialsninja_BaseClass {
	
	public WebDriver driver;
	public tutorialsninja_OrderPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(xpath=" //a[@class='btn btn-primary']")
	 public WebElement CkeckoutButton;
	 
	 @FindBy(name="quantity[108271]")
	 public WebElement VeryfieQuanty;
	 
	 @FindBy(xpath="//a[normalize-space()='Step 1: Checkout Options']")
	 public WebElement CheckOutOption;
	 
	 @FindBy(xpath="//input[@id='input-email']")
	 public WebElement Email;
	 
	 @FindBy(xpath=" //input[@id='input-password']")
	 public WebElement Password;
	 
	 @FindBy(xpath=" //input[@id='button-login']")
	 public WebElement Login;
	 
	 @FindBy(xpath="  //a[normalize-space()='Step 2: Billing Details']")
	 public WebElement BillingDetails;
	 
	 @FindBy(xpath="//input[@id='input-payment-address-1']")
	 public WebElement Address1;
	 
	 @FindBy(xpath=" //input[@id='input-payment-address-2']")
	 public WebElement Address2;
	 
	 @FindBy(xpath=" //input[@id='input-payment-city']")
	 public WebElement CityName;
	 
	 @FindBy(xpath=" //input[@id='input-payment-postcode']")
	 public WebElement PostCode;
	 
	 @FindBy(xpath=" //select[@id='input-payment-country']")
	 public WebElement Country;
	 
	 @FindBy(xpath=" //select[@id='input-payment-zone']")
	 public WebElement StateName;
	 
	 @FindBy(xpath="//input[@id='button-payment-address']")
	 public WebElement BillingDetailButton;
	 
	 @FindBy(xpath="//textarea[@name='comment']")
	 public WebElement COmmentOrder;
	 
	 @FindBy(xpath="//input[@name='agree']")
	 public WebElement Terma_Condition;
	 
	 @FindBy(xpath="//input[@id='button-payment-method']")
	 public WebElement ButtonPayMentMethod;
	
	
	
	
	
	

}
