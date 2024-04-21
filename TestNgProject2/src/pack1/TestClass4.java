package pack1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TestClass4 {
	

	@BeforeMethod
	public void preconDition()
	{
		System.out.println("BeforeMethod Annotation from Testclass4");
	}
	
	
	@Test(priority=0)
	public void TestCase3()
	{
		System.out.println("Test Case 3");
	}
	
	@Test 
	public void TestCase4()
	{
		System.out.println("Test Case 4");
	}
	
	@AfterMethod
	public void postconDition()
	{
		System.out.println("AfterMethod Annotation from Testclass4");
	}

	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("BeforeClass Annotation from Testclass4");
	} 
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("AfterClass Annotation from Testclass4");
	}
	
	
	

}
