package tutorialsninja_TestCase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tutorialsninja_Base.tutorialsninja_BaseClass;
import tutorialsninja_PageObjectsClass.tutorials_MyAccountPage;
import tutorialsninja_PageObjectsClass.tutorialsninja_LandingPage;
import tutorialsninja_PageObjectsClass.tutorialsninja_RegistrationPage;
import tutorialsninja_PageObjectsClass.tutorialsninja_loginPage;


public class tutorialsninja_RegisterTestCase extends tutorialsninja_BaseClass  {
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
	public void RegisterTest() throws InterruptedException {
		tutorialsninja_LandingPage landingpage=new tutorialsninja_LandingPage(driver);
		tutorialsninja_RegistrationPage Registerpage=new tutorialsninja_RegistrationPage(driver);
		tutorials_MyAccountPage MyAccountPge=new tutorials_MyAccountPage(driver);
		
		landingpage.MyAccountDropDown().click();
		Thread.sleep(5000);
		landingpage.RegisterText().click();
		Assert.assertTrue(Registerpage.validteRegisterpage().isDisplayed());
		Thread.sleep(5000);
		Registerpage.RegisterPageData("Hithaswi","santhosh","Hithaswi@gmail.com","7353893489","Hithaswi@123","Hithaswi@123");
		Thread.sleep(5000);
		Registerpage.PrivacyPolice().click();
		Thread.sleep(5000);
		Registerpage.clickRegister().click();
		Thread.sleep(5000);
		Assert.assertTrue(Registerpage.VerifyRegisterSucces().isDisplayed());
		Thread.sleep(5000);
		Registerpage.clickRegisterAfter().click();
		Thread.sleep(5000);
	}
	

}
