package pack1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class TestClass3 {
	

	@BeforeMethod
	public void preconDition()
	{
		System.out.println("BeforeMethod Annotation");
	}
	
	@Test(priority=0)
	public void TestCase1()
	{
		System.out.println("Test Case 1");
	}
	
	@AfterMethod
	public void postconDition()
	{
		System.out.println("AfterMethod Annotation");
	}
	
	@Test 
	public void TestCase2()
	{
		System.out.println("Test Case 2 ");
	}
	

	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("BeforeClass Annotation");
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("AfterClass Annotation");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Beforetest Annotation");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("AfterTest Annotation");
	}
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("BeforeSuite Annotation");
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("AfterSuite Annotation");
	}

}
