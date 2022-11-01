package tutorialsninja_TestCase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nopcom.login.logingExcle;

import tutorialsninja_Base.tutorialsninja_BaseClass;
import tutorialsninja_PageObjectsClass.tutorials_MyAccountPage;
import tutorialsninja_PageObjectsClass.tutorialsninja_LandingPage;
import tutorialsninja_PageObjectsClass.tutorialsninja_loginPage;
import tutorialsninja_Utilities.loginData;

public class tutorialsninja_loginTest extends tutorialsninja_BaseClass  {
	public  WebDriver driver;
	tutorialsninja_LandingPage landingpage=new tutorialsninja_LandingPage(driver);
	tutorialsninja_loginPage loginPage= new tutorialsninja_loginPage(driver);
	//loginData LoginData=new loginData();
	
	@BeforeMethod
	public void setup() {
		driver=launchApp();
	}
	@AfterMethod
		public void tearDown() {
			driver.quit();
		}
	//dataProviderClass=loginData.class,dataProvider="LoginData"
		@Test()
		public void loginData() throws InterruptedException
		
		{
			
			tutorialsninja_LandingPage landingpage=new tutorialsninja_LandingPage(driver);
			tutorialsninja_loginPage loginPage= new tutorialsninja_loginPage(driver);
			tutorials_MyAccountPage MyAccountPge=new tutorials_MyAccountPage(driver);
			landingpage.MyAccountDropDown().click();
			log.debug("Clicked on My Account dropdown");
			Thread.sleep(5000);
			log.debug("Clicked on login option");
			landingpage.login().click();
			Thread.sleep(5000);
			loginPage.EmailAddress("Hithaswi@gmail.com");
			log.debug("Email addressed got entered");
			Thread.sleep(5000);
			loginPage.setPassWord("hithaswi");
			log.debug("Password got entered");
			Thread.sleep(5000);
			loginPage.ClickLogin();
			log.debug("Clicked on Login Button");
			Thread.sleep(4000);
			String Result1;
			Assert.assertTrue(MyAccountPge.VerifyLogin().isDisplayed());
			log.debug("User got logged in");
			
		}
		/*@Test()
		public void validateTile() {
			
			
		}*/

}
