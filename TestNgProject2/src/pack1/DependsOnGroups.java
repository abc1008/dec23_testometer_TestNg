package pack1;

import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;

public class DependsOnGroups {


	@Test(priority=1, groups = "Sanity")
	public void m1()
	{
		System.out.println("Test of m1");
	}
	
	@Test(priority=2, groups = "Sanity")
	public void m2()
	{
		System.out.println("Test of m2");
	}

	@Test(priority=3, dependsOnGroups = {"Sanity"} )
	public void m3()
	{
		System.out.println("Test of m3  TestClass1");
	}

	@Test
	public void m4()
	{
		System.out.println("Test of m4  TestClass1");
	}
	
	
	
	
	
	
	
	
	
	
	

}
