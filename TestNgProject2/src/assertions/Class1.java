package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class1 
{

//	@Test
//	public void TestCase1()
//	{
//		System.out.println("Before Assert.fail");
//
//		Assert.fail();
//		
//		System.out.println("After Assert.fail");
//		
//		
//	}

	@Test 
	public void TestCase2()
	{
		
		boolean result =true;
		
		System.out.println("Before assertion");

		
		String output = "abcdd";
		
		
		 Assert.assertEquals(result,false); 
		Assert.assertEquals(output, "abc", "TestCase2 verification failed.");
	}

	@Test
	public void TestCase3() 
	{

		boolean result = false;
		String output = "abcdd";

		System.out.println("Before assertion");

//		Assert.assertFalse(result);
		
		Assert.assertNotEquals(result, false, "test case failed : ");
		

	}
}
