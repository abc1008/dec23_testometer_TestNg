package ecomm_TestScripts;

import java.io.IOException;

import ecommAppPack.EcommerceApp;
import ecomm_Base.BaseTest;
import utilities.ConfigReader;

public class LoginTestAccountScripts extends BaseTest {
	
	public void loginTestScript() throws InterruptedException, IOException
	{
		EcommerceApp.accountLoginPage().performLogin(ConfigReader.readData("userID"), ConfigReader.readData("password"));
	}
	
	public void logoutTestScript() throws InterruptedException
	{
		EcommerceApp.accountLoginPage().performLogout();
	}
	
	public void forgotPassTestScript()
	{
		EcommerceApp.accountLoginPage().forgotPassword();
	}
	
	
	
	

}
