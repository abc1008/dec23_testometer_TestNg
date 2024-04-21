package pack1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Groups {

	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Test of BeforeMethod");
	}
	
	@Test(priority=1, groups = "Sanity")
	public void m1()
	{
		System.out.println("Test of m1 Groups");
	}
	
	@Test(priority=0, groups = "Regression")
	public void m2()
	{
		System.out.println("Test of m2 Groups");
	}
	
	@Test (groups = "Sanity")
	public void m3()
	{
		System.out.println("Test of m3 Groups");
	}

	@Test(groups = "Regression")
	public void m4()
	{
		System.out.println("Test of m4");
	}
	
	@Test()
	public void m5()
	{
		System.out.println("Test of m5");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("Test of AfterMethod");
	}
	
	
	
	
	

}
