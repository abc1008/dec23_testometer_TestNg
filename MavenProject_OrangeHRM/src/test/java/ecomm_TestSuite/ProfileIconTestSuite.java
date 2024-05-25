package ecomm_TestSuite;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ecomm_Base.BaseTest;
import ecomm_TestScripts.ProfileIconTestScripts;

@Listeners(ecomm_Base.ListenerClass.class)
public class ProfileIconTestSuite extends BaseTest
{
	@Test(priority = 1)
	public void tc_4568_EditPasswordTest()
	{
		Assert.assertTrue( new ProfileIconTestScripts().editPasswordTestScript());
	}
	
	@Test(priority = 2)
	public void tc_4569_EditSupportClickTest()
	{
		Assert.assertTrue( new ProfileIconTestScripts().ProfileSupportClickTestScripts());
	}
	
	
	
	
	
	
}
