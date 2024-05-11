package ecomm_TestSuite;

import org.testng.Assert;
import org.testng.annotations.Test;

import ecomm_Base.BaseTest;
import ecomm_TestScripts.MyAccountTestScripts;

public class MyAccountTestSuite extends BaseTest
{

	@Test(priority = 1)
	public void tc_4567_EditAccountTest()
	{
		Assert.assertTrue(new MyAccountTestScripts().editAccTestScript());
	}
	
	@Test(priority = 2)
	public void tc_4568_EditAddrTest()
	{
		Assert.assertTrue( new MyAccountTestScripts().editAddrTestScript());
	}
	
}
