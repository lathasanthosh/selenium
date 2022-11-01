package tutorialsninja_TestCase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tutorialsninja_Base.tutorialsninja_BaseClass;
import tutorialsninja_PageObjectsClass.tutorialsninja_AddToCatPage;
import tutorialsninja_PageObjectsClass.tutorialsninja_SearchResultPage;

public class tutorialsninja_AddToCortTest extends tutorialsninja_BaseClass
{
	public  WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver=launchApp();
	}
	/*@AfterMethod
		public void tearDown() {
			driver.quit();
		}*/
	@Test
	public void verifyAddtoCart() throws InterruptedException {
		
		tutorialsninja_AddToCatPage AddtoCortPag =new tutorialsninja_AddToCatPage(driver);
		tutorialsninja_SearchResultPage searchPage=new tutorialsninja_SearchResultPage(driver);
		
		searchPage.VerifySearchparoductPage("MacBook");
		Thread.sleep(4000);
		searchPage.ClickSearchButton().click();
		Thread.sleep(4000);
		//AddtoCortPag.ProducQuantity("2"); 
		//Thread.sleep(4000);
		AddtoCortPag.AddtoCortButton().click() ;
		Thread.sleep(4000);
		//AddtoCortPag.ShoppingCart().click();
		//Assert.assertTrue(AddtoCortPag.VerifyProducAddtoCart().isDisplayed());
		AddtoCortPag.ShoppingCart().click();
		//AddtoCortPag.ProducQuantity("2"); 
		Assert.assertTrue(AddtoCortPag.VerifyProducAddtoCart().isDisplayed());
	}

}
