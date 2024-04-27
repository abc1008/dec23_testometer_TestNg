package pack1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(pack1.ListenersClass.class)   // to apply listener class  
public class ListenerTestClass {
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("BeforeSuite");
	
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("AfterSuite");
	
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("AfterClass");
		
	}
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("BeforeClass");
	
	}
	
	@BeforeMethod
	public void Beforemethod()
	{
		System.out.println("Beforemethod");
	
	}
	
	@AfterMethod
	public void Aftermethod()
	{
		System.out.println("Aftermethod");
	
	}
	
	@org.testng.annotations.BeforeTest
	public void BeforeTest()
	{
		System.out.println("BeforeTest");
	
	}
	
	@org.testng.annotations.AfterTest
	public void AfterTest()
	{
		System.out.println("AfterTest");
	
	}
	
	@Test
	public void TestCase1()
	{
		System.out.println("TestCase1");
		
		Assert.fail();
	}
	
	@Test
	public void TestCase2()
	{
		System.out.println("TestCase2");

	}
	
	
	
	
	

}
