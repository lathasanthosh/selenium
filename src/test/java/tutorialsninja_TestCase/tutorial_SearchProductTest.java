package tutorialsninja_TestCase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tutorialsninja_Base.tutorialsninja_BaseClass;
import tutorialsninja_PageObjectsClass.tutorialsninja_SearchResultPage;

public class tutorial_SearchProductTest extends tutorialsninja_BaseClass  {
	public  WebDriver driver;

	@BeforeMethod
	public void setup()
	      {
		driver=launchApp();
	      }
	/*@AfterMethod
		public void tearDown()
	          {
			driver.quit();
	           }*/
	@Test
	public void SearchProductTest() throws InterruptedException
	{
		tutorialsninja_SearchResultPage SerchPage=new tutorialsninja_SearchResultPage(driver);
		SerchPage.VerifySearchparoductPage("iphone");
		Thread.sleep(4000);
		SerchPage.ClickSearchButton().click();
		Thread.sleep(4000);
		Assert.assertTrue(SerchPage.SearchResultPage().isDisplayed());		
	}

}
