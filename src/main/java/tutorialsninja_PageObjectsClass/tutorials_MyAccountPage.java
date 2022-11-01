package tutorialsninja_PageObjectsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tutorials_MyAccountPage {
public WebDriver driver;
	
	public  tutorials_MyAccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(linkText="Edit your account information")
	public WebElement Edityouraccountinformation;
    
    public WebElement VerifyLogin()
    {
    	return Edityouraccountinformation;
    }

}
