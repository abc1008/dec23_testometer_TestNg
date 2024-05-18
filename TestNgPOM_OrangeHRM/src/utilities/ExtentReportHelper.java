package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

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
		reportPath = reportFolderPath + "\\testReport" + dateTimeStamp + ".html";
		extentSparkReporter = new ExtentSparkReporter(reportPath);
		extent.attachReporter(extentSparkReporter);
	}

	public static void startTest(String testCaseName)
	{
		extentTest = extent.createTest(testCaseName);
	}

	public static void endTest()
	{
		extent.flush(); // test case end
	}

	public static void LogPass(String message)
	{
		extentTest.log(Status.PASS, message);
	}

	public static void LogFail(String message) throws IOException
	{
		extentTest.log(Status.FAIL, message, CaptureSreen(driver, "TestScreenshot"));
	}

	public static void LogInfo(String message)
	{
		extentTest.log(Status.INFO, message);
	}

	public static Media CaptureSreen(WebDriver driver, String fileName) throws IOException
	{
		TakesScreenshot screen = (TakesScreenshot) driver;
		String screenShot = screen.getScreenshotAs(OutputType.BASE64);
		 Media screenShotImage = MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot).build();
		
		return screenShotImage;
	}

}
