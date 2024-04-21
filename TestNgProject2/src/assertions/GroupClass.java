package assertions;

import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;

public class GroupClass {
	
	
	
	@Test (groups = "Sanity")
	public void m3()
	{
		System.out.println("Test of m3  GroupClass");
		org.testng.Assert.fail();
	}
	
	
	
	
	
	
	

}
