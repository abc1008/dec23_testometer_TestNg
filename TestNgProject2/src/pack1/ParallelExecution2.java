package pack1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelExecution2 {


	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("BeforeTest ParallelExecution");
	}
	
	@Test(priority=1)
	public void m1()
	{
		System.out.println("Test of m1 ParallelExecution2");
	}
	
	@Test(priority=2)
	public void m2()
	{
		System.out.println("Test of m2 ParallelExecution2");
	}
	
	@Test (priority=3)
	public void m3()
	{
		System.out.println("Test of m3  ParallelExecution2");
	}

	@Test (priority=4)
	public void m4()
	{
		System.out.println("Test of m4  ParallelExecution2");
	}
	
	
	@Test (priority=5)
	public void m5()
	{
		System.out.println("Test of m5 ParallelExecution2");
	}
	
//	@Test (priority=6)
//	public void m6()
//	{
//		System.out.println("Test of m6 ParallelExecution");
//	}
//	
//	@Test (priority=7)
//	public void m7()
//	{
//		System.out.println("Test of m7 ParallelExecution");
//	}
	
	
//	@Test (priority=8)
//	public void m8()
//	{
//		System.out.println("Test of m8 ParallelExecution");
//	}
//	
//	@Test (priority=9)
//	public void m9()
//	{
//		System.out.println("Test of m9 ParallelExecution");
//	}
//	
//	@Test (priority=10)
//	public void m10()
//	{
//		System.out.println("Test of m10 ParallelExecution");
//	}
//	
//	@Test (priority=11)
//	public void m11()
//	{
//		System.out.println("Test of m11 ParallelExecution");
//	}
}
