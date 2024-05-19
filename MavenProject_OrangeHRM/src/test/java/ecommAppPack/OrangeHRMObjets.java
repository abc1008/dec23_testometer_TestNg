package ecommAppPack;

import ecomm_Base.BaseTest;
import ecomm_pages.AccountLoginPage;
import ecomm_pages.ProfileIconPage;

public class OrangeHRMObjets extends BaseTest
{
	
	private static ProfileIconPage _profileIconPage;   // private variable
	
	public static ProfileIconPage profileIconPage()
	{
		_profileIconPage = new ProfileIconPage(driver);  // providing value to the object ref veariable via public method
		return _profileIconPage;
	}
	
	private static AccountLoginPage _accountLoginPage;
	
	public static AccountLoginPage accountLoginPage()
	{
		_accountLoginPage = new AccountLoginPage(driver);
		return _accountLoginPage;
	}
	
	
}
