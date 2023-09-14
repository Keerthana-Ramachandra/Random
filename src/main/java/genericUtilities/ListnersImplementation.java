package genericUtilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 * This class will give implementation to ITestlistners interface
 * @author Keerthi
 *
 */
public class ListnersImplementation implements ITestListener
{
	ExtentReports report;
	ExtentTest test;

	public void onTestStart(ITestResult result)
	{
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName +"stsrted execution");
		test=report.createTest(methodName);

	}

	public void onTestSuccess(ITestResult result)
	{
		String methodNmae = result.getMethod().getMethodName();
		System.out.println(methodNmae+ "is passed");
	}

	public void onTestFailure(ITestResult result)
	{
		String methodName = result.getMethod().getMethodName();
		JavaUtility jutil= new JavaUtility();
		String screenshotName = methodName+jutil.getSystemdate();
		test.log(Status.FAIL, methodName+ "is failed");
		test.log(Status.INFO, result.getThrowable());
		WebDriverUtility wutil= new WebDriverUtility();
		try
		{
			wutil.captureScreenshot(BaseClass.sdriver, screenshotName);
		}
		catch (IOException e)
		{
	
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) 
	{
		String methodName = result.getMethod().getMethodName();
		test.log(Status.SKIP, methodName +"is skipped");
		test.log(Status.SKIP, result.getThrowable());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
	}

	public void onTestFailedWithTimeout(ITestResult result) 
	{
		
	}

	public void onStart(ITestContext context)
	{
		System.out.println("Suite execution started");
		ExtentSparkReporter htmlReport= new ExtentSparkReporter(".\\Extent Reports\\Report-"+new JavaUtility().getSystemdate()+".html");
		htmlReport.config().setDocumentTitle("Extent report");
		htmlReport.config().setTheme(Theme.DARK);
		htmlReport.config().setReportName("Automation report");
		report= new ExtentReports();
		report.attachReporter(htmlReport);
		report.setSystemInfo("Opreatingsystem", "Windows");
		report.setSystemInfo("Browser", "Firefox");
		report.setSystemInfo("Base url", "https://profile.oracle.com/myprofile/account/create-account.jspx");
		report.setSystemInfo("Base Environmemt", "Testing");
		report.setSystemInfo("Reporter", "Keerthana");
	}

	public void onFinish(ITestContext context) 
	{
		System.out.println("Suite execution finished");
		report.flush();
	}

}
