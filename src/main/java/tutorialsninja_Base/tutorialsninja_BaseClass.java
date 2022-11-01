package tutorialsninja_Base;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tutorialsninja_BaseClass {
	
	public static Properties prop;	
	public static WebDriver driver;
	public Logger log = (Logger) LogManager.getLogger(tutorialsninja_BaseClass.class.getName());
	
	@BeforeTest
	public void loadConfig() {
	
		DOMConfigurator.configure("C:\\Users\\91735\\eclipse-workspace\\java_framework\\tutorialsninja_ComFrameWork\\src\\test\\resources\\log4j.xml");
		
        try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\91735\\eclipse-workspace\\java_framework\\tutorialsninja_ComFrameWork\\src\\test\\resources\\tutorialsninja_Data\\tutorialsninja_ConfigFile");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public WebDriver launchApp() {	
		
		
		String browserName = prop.getProperty("Browser");
		log.debug("Browser got launched");
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		} 
		else if (browserName.equalsIgnoreCase("FireFox")) {
			WebDriverManager.chromedriver().setup();
			driver=new FirefoxDriver();
		} 
		else if (browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.chromedriver().setup();
			driver=new InternetExplorerDriver();
		}
		log.debug("Navigated to application URL");
		driver.get(prop.getProperty("TestUrl"));
		log.debug("Maximize the screen");                
		driver.manage().window().maximize();
		log.debug("Delete all the cookies");
		driver.manage().deleteAllCookies();
		return driver;
         
}
public void takeScreenshot(String testName,WebDriver driver) throws IOException {
		
		File SourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destinationFilePath = System.getProperty("user.dir")+"\\screenshots\\"+testName+".png";
		FileUtils.copyFile(SourceFile,new File(destinationFilePath));
	
	}
	

}
