package pack1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import selenium_testng.EditAcc;
import utilities.CommonOps;

public class ListenersClass extends EditAcc implements ITestListener  {

//	WebDriver driver = new ChromeDriver();

	public void onTestStart(ITestResult result) {
	
		System.out.println("onTestStart " +result.getName());
		
	}


	public void onTestSuccess(ITestResult result) {
		
		System.out.println("onTestSuccess "+result.getName());
		
	}


	public void onTestFailure(ITestResult result) {
		
		System.out.println("onTestFailure "+result.getName());
		
//		try 
//		{
//			CommonOps.CaptureSreen(driver, result.getName());
//			
//		} 
//		catch (IOException e) 
//		{
//			e.printStackTrace();
//		}
		
		
		

	}


	public void onTestSkipped(ITestResult result) {
		
		System.out.println("onTestSkipped "+result.getName());

	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("onTestFailedButWithinSuccessPercentage");

	}


	public void onTestFailedWithTimeout(ITestResult result) {
		
		System.out.println("onTestFailedWithTimeout");

	}


	public void onStart(ITestContext context) {
		
		System.out.println("onStart");

	}


	public void onFinish(ITestContext context) {
		
		System.out.println("onFinish");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
