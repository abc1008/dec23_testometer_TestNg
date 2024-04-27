package pom;

import org.testng.annotations.Test;

public class AccountLoginTest extends BaseTest{
	
	
	@Test
	public void tc_1234_LoginTest()
	{
		LoginTestAccountScripts lps = new LoginTestAccountScripts();
		lps.loginTestScript();
	}
	
	@Test
	public void tc_1235_LoginTest()
	{
		LoginTestAccountScripts lps = new LoginTestAccountScripts();
		lps.forgotPassTestScript();
	}
	
	
	
	

}
