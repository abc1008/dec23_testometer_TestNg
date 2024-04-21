package pack1;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(pack1.ListenersClass.class)   // to apply listener class  
public class ListenerTestClass {
	
	
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
