package ecomm_TestScripts;

import java.util.Base64;

import ecommAppPack.EcommerceApp;
import ecomm_Base.BaseTest;

public class MyAccountTestScripts extends BaseTest
{
	public boolean editAccTestScript()
	{
			boolean testResult = false;
			try 
			{
				if(EcommerceApp.myAccountPage().performEditAccount())
				{
					 testResult = true;
				}
				else
				{
					testResult = false;
				}
			}
			catch(Exception ex)
			{
				System.out.println("Exception in MyAccountTestScripts : " + ex.getMessage() );
			}
			return testResult;
	}
	
	public boolean editAddrTestScript()
	{
		boolean testResult = false;
		
		try
		{
			 if(EcommerceApp.myAccountPage().performEditAddress())
			 {
				 testResult = true;
			 }
			 else
			 {
				 testResult = false;
			 }
		}
		catch(Exception ex)
		{
			System.out.println("Exception in editAddrTestScript : " + ex.getMessage() );
		}
		
		return testResult;
	}
	
	
	
}
