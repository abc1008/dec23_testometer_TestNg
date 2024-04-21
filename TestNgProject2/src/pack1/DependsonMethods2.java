package pack1;

import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;

public class DependsonMethods2 {


	@Test(priority=1, dependsOnMethods = {"pack1.DependsonMethods.m4","m6"})
	public void m5()
	{
		System.out.println("Test of m5");
	}
	
	@Test(priority=2)
	public void m6()
	{
		System.out.println("Test of m6");
	}

	@Test(priority=3)
	public void m7()
	{
		System.out.println("Test of m7  TestClass1");
	}

	@Test(priority=4)
	public void m8()
	{
		System.out.println("Test of m8  TestClass1");
	}
	
	
	
	
	
	
	
	
	
	
	

}
