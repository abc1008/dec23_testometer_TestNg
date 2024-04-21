package pack1;

import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;

public class DependsonMethods {


	@Test(priority=1)
	public void m1()
	{
		System.out.println("Test of m1");
		org.testng.Assert.fail();
	}
	
	@Test(priority=2)
	public void m2()
	{
		System.out.println("Test of m2");
	}

	@Test(priority=3, dependsOnMethods = {"m1", "m2"})
	public void m3()
	{
		System.out.println("Test of m3  TestClass1");
	}

	@Test
	public void m4()
	{
		System.out.println("Test of m4  TestClass1");
		org.testng.Assert.fail();
	}
	
	
	
	
	
	
	
	
	
	
	

}
