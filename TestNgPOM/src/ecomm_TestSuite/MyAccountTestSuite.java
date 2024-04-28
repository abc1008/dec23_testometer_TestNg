package ecomm_TestSuite;

import org.testng.Assert;
import org.testng.annotations.Test;

import ecomm_Base.BaseTest;
import ecomm_TestScripts.MyAccountTestScripts;

public class MyAccountTestSuite extends BaseTest
{

	@Test
	public void tc_4567_EditAccountTest()
	{
		MyAccountTestScripts myAccountTestScripts =  new MyAccountTestScripts();
		Assert.assertTrue(myAccountTestScripts.editAccTestScript());
	}
	
	@Test
	public void tc_4568_EditAddrTest()
	{
		MyAccountTestScripts myAccountTestScripts =  new MyAccountTestScripts();
		Assert.assertTrue(myAccountTestScripts.editAddrTestScript());
	}
	
}
