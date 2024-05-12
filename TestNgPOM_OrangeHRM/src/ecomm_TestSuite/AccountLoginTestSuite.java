package ecomm_TestSuite;

import org.testng.annotations.Test;
import ecomm_Base.BaseTest;
import ecomm_TestScripts.LoginTestAccountScripts;

public class AccountLoginTestSuite extends BaseTest
{
	@Test(priority = 1)
	public void tc_1235_ForgotPassword()
	{
			new LoginTestAccountScripts().forgotPassTestScript();
	}

}
