package ecomm_TestScripts;

import java.io.IOException;

import ecommAppPack.OrangeHRMObjets;
import ecomm_Base.BaseTest;
import utilities.ConfigReader;

public class LoginTestAccountScripts extends BaseTest {
	
	public void loginTestScript() throws InterruptedException, IOException
	{
		OrangeHRMObjets.accountLoginPage().performLogin(ConfigReader.readData("userID"), ConfigReader.readData("password"));
	}
	
	public void logoutTestScript() throws InterruptedException
	{
		OrangeHRMObjets.accountLoginPage().performLogout();
	}
	
	public void forgotPassTestScript()
	{
		OrangeHRMObjets.accountLoginPage().forgotPassword();
	}
	
	
	
	

}
