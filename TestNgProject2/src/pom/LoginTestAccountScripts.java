package pom;

public class LoginTestAccountScripts extends BaseTest {
	
	
	public void loginTestScript()
	{
		lp.performLogin("ag89111@gmail.com", "Login@123");
	}
	
	
	public void forgotPassTestScript()
	{
		lp.forgotPassword();
	}
	
	
	
	

}
