package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Class2 {
	
	
	
//	@Test
//	public void TestCase1()
//	{
//		System.out.println("Before SoftAssert");
//		
//		SoftAssert sa = new SoftAssert();
//		sa.fail();
//		
//		System.out.println("After SoftAssert");
//	
//		sa.assertAll();
//		
//		System.out.println("After assertAll");
//
//	}
	
	@Test 
	public void TestCase2()
	{
		
		boolean result =true;
		
		System.out.println("Before assertion");

		
		String output = "abcdd";
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(output, "abc", "TestCase2 failed.");
	
		sa.assertAll();
	
	
	}
	
	
	
	
	
	
	

}
