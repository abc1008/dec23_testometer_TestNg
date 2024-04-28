package ecomm_TestSuite;

import org.testng.annotations.Test;

import ecomm_Base.BaseTest;
import ecomm_TestScripts.LoginTestAccountScripts;

public class AccountLoginTestSuite extends BaseTest
{

//	@Test(priority = 1)
//	public void tc_1234_LoginTest() throws InterruptedException
//	{
//		LoginTestAccountScripts lps = new LoginTestAccountScripts();
//		lps.loginTestScript();
//	}
//
//	@Test(priority = 2)
//	public void tc_1236_LogoutTest() throws InterruptedException
//	{
//		LoginTestAccountScripts lps = new LoginTestAccountScripts();
//		lps.logoutTestScript();
//	}

	@Test(priority = 3)
	public void tc_1235_ForgotPassword()
	{
		LoginTestAccountScripts lps = new LoginTestAccountScripts();
		lps.forgotPassTestScript();
	}

}
