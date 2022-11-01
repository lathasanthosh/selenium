package tutorialsninja_PageObjectsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tutorialsninja_Base.tutorialsninja_BaseClass;

public class tutorialsninja_AddToCatPage extends tutorialsninja_BaseClass{
public WebDriver driver;
	
	public tutorialsninja_AddToCatPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath= "//span[normalize-space()='Add to Cart']")
	public WebElement AddToCart;

	@FindBy(xpath= "//a[normalize-space()='shopping cart']")
	public WebElement ShoppingCart;
	
	@FindBy(xpath= "//input[@name='quantity")
	public WebElement ProducQuantity;
	
	@FindBy(xpath= "//a[@class='btn btn-primary']")
	public WebElement CheckOut;
	
	@FindBy(xpath= "//span[normalize-space()='Shopping Cart']")
	public WebElement ShopingCort;
	
	@FindBy(xpath= "//a[contains(text(),'Shopping Cart')]")
	public WebElement ShopingCortext;
	
	public WebElement AddtoCortButton() 
	{
		return AddToCart;
		
	}
	
	// Success: You have added iPhone to your shopping cart!

	public WebElement ShoppingCart() 
	{
		return ShoppingCart;
	}
	
	public WebElement VerifyProducAddtoCart() 
	{
		return ShopingCort;
	}
	public void ProducQuantity(String PQ) 
	{
		ProducQuantity.sendKeys(PQ);
	}
}
