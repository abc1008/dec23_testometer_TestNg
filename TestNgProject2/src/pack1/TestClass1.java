package pack1;

import org.testng.annotations.Test;

public class TestClass1 {


	@Test(priority=1, groups = "group3")
	public void m1()
	{
		System.out.println("Test of m1");
	}
	
	@Test(priority=0,groups = "group3")
	public void m2()
	{
		System.out.println("Test of m2");
	}
	
	@Test (groups = "Sanity")
	public void m3()
	{
		System.out.println("Test of m3  TestClass1");
	}

	
	
	
	
	
	
	
	
	
	
	
	

}
