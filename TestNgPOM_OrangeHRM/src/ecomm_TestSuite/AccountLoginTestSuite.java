package ecomm_TestSuite;

import java.io.IOException;

import org.testng.annotations.Test;
import ecomm_Base.BaseTest;
import ecomm_TestScripts.LoginTestAccountScripts;

public class AccountLoginTestSuite extends BaseTest
{
	@Test(priority = 1)
	public void tc_1235_ForgotPassword() throws IOException
	{
			new LoginTestAccountScripts().forgotPassTestScript();
	}

}
