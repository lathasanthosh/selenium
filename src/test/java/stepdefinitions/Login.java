package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tutorialsninja_Base.tutorialsninja_BaseClass;
import tutorialsninja_PageObjectsClass.tutorials_MyAccountPage;
import tutorialsninja_PageObjectsClass.tutorialsninja_LandingPage;
import tutorialsninja_PageObjectsClass.tutorialsninja_loginPage;

public class Login extends tutorialsninja_BaseClass {
	public  WebDriver driver;
	
	
	
	
	
	 @Given("^Open any Browser$")
	    public void open_any_browser()  {
		 
		 driver=launchApp();
	        
	    }
	 @And("^Navigate to Login page$")
	    public void navigate_to_login_page() throws InterruptedException  {
	    	
		 tutorialsninja_LandingPage landingpage=new tutorialsninja_LandingPage(driver);
			landingpage.MyAccountDropDown().click();
			Thread.sleep(5000);
			landingpage.login().click();
			Thread.sleep(5000);
	    }

	    @When("^User enters username as \"([^\"]*)\" and password as \"([^\"]*)\" into the fields$")
	    public void user_enters_username_as_something_and_password_as_something_into_the_fields(String Email, String Password) throws InterruptedException  {
	    	tutorialsninja_loginPage loginPage= new tutorialsninja_loginPage(driver);
	    	loginPage.EmailAddress(Email);
	    	Thread.sleep(5000);
	    	loginPage.setPassWord(Password);
	    	Thread.sleep(5000);
	        
	    }
	    @And("^User clicks on Login button$")
	    public void user_clicks_on_login_button() throws InterruptedException  {
	    	tutorialsninja_loginPage loginPage= new tutorialsninja_loginPage(driver);
	    	loginPage.ClickLogin();
			Thread.sleep(4000);
	 
	    }
	    @Then("^Verify user is able to successfully login$")
	    public void verify_user_is_able_to_successfully_login() {
	    	tutorials_MyAccountPage MyAccountPge=new tutorials_MyAccountPage(driver);
	    	Assert.assertTrue(MyAccountPge.VerifyLogin().isDisplayed());
	        
	    }

	    
}
