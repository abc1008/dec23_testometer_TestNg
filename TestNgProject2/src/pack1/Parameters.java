package pack1;

import org.testng.annotations.Test;

public class Parameters {


	@Test(priority=1)
	@org.testng.annotations.Parameters({"browser", "version"})
	public void m1(String browserName, String versionNum)
	{
		System.out.println("Browser Name : "+browserName);
		System.out.println("Version Name : "+versionNum);

		
		
		
	}
	
//	@Test(priority=2)
//	public void m2()
//	{
//		System.out.println("Test of m2");
//	}
//	
//	@Test (priority=3)
//	public void m3()
//	{
//		System.out.println("Test of m3  TestClass1");
//	}

	
	
	
	
	
	
	
	
	
	
	
	

}
