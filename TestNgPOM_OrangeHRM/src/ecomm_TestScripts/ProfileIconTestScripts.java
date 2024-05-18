package ecomm_TestScripts;

import java.util.Base64;

import ecommAppPack.OrangeHRMObjets;
import ecomm_Base.BaseTest;

public class ProfileIconTestScripts extends BaseTest
{
	public boolean editPasswordTestScript()
	{
		boolean testResult = false;
		
		try
		{
			 if(OrangeHRMObjets.profileIconPage().performChangePassword())
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
	

		public boolean ProfileSupportClickTestScripts()
		{
			boolean testResult = false;
			
			try
			{
				 if(OrangeHRMObjets.profileIconPage().performClickOnSupport())
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
				System.out.println("Exception in performClickOnSupport : " + ex.getMessage() );
			}
			return testResult;
		}
	
	
	
}
