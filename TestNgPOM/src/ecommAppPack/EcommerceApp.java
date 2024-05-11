package ecommAppPack;

import ecomm_Base.BaseTest;
import ecomm_pages.AccountLoginPage;
import ecomm_pages.MyAccountPage;

public class EcommerceApp extends BaseTest
{
	
	private static MyAccountPage _myAccountPage;   // private variable
	
	public static MyAccountPage myAccountPage()
	{
		_myAccountPage = new MyAccountPage(driver);  // providing value to the object ref veariable via public method
		return _myAccountPage;
	}
	
	private static AccountLoginPage _accountLoginPage;
	
	public static AccountLoginPage accountLoginPage()
	{
		_accountLoginPage = new AccountLoginPage(driver);
		return _accountLoginPage;
	}
	
	
}
