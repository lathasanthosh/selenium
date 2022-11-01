package tutorialsninja_Utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import tutorialsninja_Base.tutorialsninja_BaseClass;

public class ListenerceClass extends tutorialsninja_BaseClass  implements ITestListener {
	ExtentReports extentReport = ExtendReportsClass.getExtentReport();
	ExtentTest extentTest;

	public void onTestStart(ITestResult result) {
           String testname=result.getName();
		extentTest = extentReport.createTest(testname+" execution started");
		
	}

	public void onTestSuccess(ITestResult result) {
		extentTest.log(Status.PASS,"Test Passed");
		
	}

	public void onTestFailure(ITestResult result) {
         WebDriver driver = null;
         
         extentTest.fail(result.getThrowable());
         
		 String testMethodName = result.getName();
		
		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			takeScreenshot(testMethodName,driver);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		extentReport.flush();
		
	}

}
