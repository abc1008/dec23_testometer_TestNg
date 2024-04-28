package ecomm_TestScripts;

import ecomm_Base.BaseTest;

public class LoginTestAccountScripts extends BaseTest {
	
	
	public void loginTestScript() throws InterruptedException
	{
		accountLoginPage.performLogin("ag89111@gmail.com", "Login@123");
	}
	
	
	public void logoutTestScript() throws InterruptedException
	{
		accountLoginPage.performLogout();
	}
	
	public void forgotPassTestScript()
	{
		accountLoginPage.forgotPassword();
	}
	
	
	
	

}
