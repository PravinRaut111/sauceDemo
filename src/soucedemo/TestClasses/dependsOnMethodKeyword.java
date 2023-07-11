package soucedemo.TestClasses;

import org.testng.annotations.Test;

public class dependsOnMethodKeyword 
{

	@Test(dependsOnMethods= {"Atest"})
	public void Dtest()
	{
		System.out.println("Test D");
	}
	
	@Test( dependsOnMethods= {"Dtest"})
	public void Ctest()
	{
		System.out.println("Test C");
	}
//		
//	@Test(priority=10)
//	public void Atest()
//	{
//		System.out.println("Test A");
//	}
//	
//	@Test(priority=1)
//	public void Btest()
//	{
//		System.out.println("Test B");
//	}
//	
	
}
