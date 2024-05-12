package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import ecomm_Base.BaseTest;

public class ExtentReportHelper extends BaseTest
{
	static ExtentReports extent;
	ExtentSparkReporter extentSparkReporter;
	String reportFolderPath;
	String reportPath;
	static ExtentTest extentTest;

	public ExtentReportHelper()
	{
		extent = new ExtentReports(); // main class
		reportFolderPath = System.getProperty("user.dir") + "\\TestResults";
		reportPath = reportFolderPath + "\\testReport" + dateTimeStamp +".html";
		extentSparkReporter = new ExtentSparkReporter(reportPath);
		extent.attachReporter(extentSparkReporter);
	}
	
	public static void startTest(String testCaseName)
	{
		extentTest = extent.createTest(testCaseName);
	}
	
	public static void endTest()
	{
		extent.flush();  // test case end
	}
	
	public static void LogPass(String message)
	{
		extentTest.log(Status.PASS, message);
	}
	
	public static void LogFail(String message)
	{
		extentTest.log(Status.FAIL, message);
	}
	
	public static void LogInfo(String message)
	{
		extentTest.log(Status.INFO, message);
	}

}
