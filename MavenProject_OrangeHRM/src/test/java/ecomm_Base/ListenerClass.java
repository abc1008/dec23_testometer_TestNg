package ecomm_Base;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import ecomm_TestScripts.LoginTestAccountScripts;
import utilities.ExtentReportHelper;

public class ListenerClass implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result)
	{
		ExtentReportHelper.startTest(result.getName());
		
		try
		{
			new LoginTestAccountScripts().loginTestScript();
		}
		catch 
		(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{

	}

	@Override
	public void onTestFailure(ITestResult result)
	{

	}

	@Override
	public void onTestSkipped(ITestResult result)
	{

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result)
	{

	}

	@Override
	public void onStart(ITestContext context)
	{

	}

	@Override
	public void onFinish(ITestContext context)
	{

	}
	
	
	
	
	

}
