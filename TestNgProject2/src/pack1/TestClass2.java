package pack1;

import static org.testng.Assert.assertFalse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass2 {

	
	@Test(priority = 50,invocationCount = 2)
	public void TestCase1()
	{
//		System.out.println("Test1");
		Reporter.log("TestCase1", true);
	}
	
	@Test(priority = 100, invocationCount = 3)
	public void TestCase2()
	{
//		System.out.println("Test2");
		Reporter.log("TestCase2", true);
	}
	
	@Test(priority = 0, enabled = false)
	public void TestCase3()
	{
		Reporter.log("Test3", true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
