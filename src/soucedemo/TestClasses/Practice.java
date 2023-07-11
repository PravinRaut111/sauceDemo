package soucedemo.TestClasses;


import org.testng.annotations.Test;

public class Practice

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
		
	@Test(priority=10)
	public void Atest()
	{
		System.out.println("Test A");
	}
	
	@Test(priority=1)
	public void Btest()
	{
		System.out.println("Test B");
	}
	
		@Test(priority=-10,invocationCount=3)
		public void testA()
		{
			System.out.println("Priority 1");//skip
		}
		
		@Test(priority=1)
		public void testB()
		{
			System.out.println("priority 2");
		}
		
		@Test(invocationCount=5,enabled=false)
		public void testC()
		{
			System.out.println("priority 3");//skip
		}
		
		@Test 
		public void testD()
		{
			System.out.println("Priority 4");//skip
		}
		
		@Test(dependsOnMethods={"testD"})
		public void testE()
		{
			System.out.println("priority 5");//failed
		}
		
			
	    @Test(timeOut=2000)
	    public void testF() throws InterruptedException
	    {
	    	Thread.sleep(10000);
	    	System.out.println("priority 6");//failed
	    }
	
	    
	    @Test
		public void loginTest()
		{
			System.out.println("LoginTest");
			//Assert.assertTrue(true);   //code-TC-fail
		}
		
		//run productTest only when the loginTest is passed
		
		@Test(dependsOnMethods={"loginTest"})
		public void productAddToCart()
		{
			System.out.println("Product -add to cart -test");
		}

	
//		@Test
//		public void Dtest()
//		{
//			System.out.println("Test D");
//		}
//		
//		@Test( dependsOnMethods= {"Dtest"})
//		public void Ctest()
//		{
//			System.out.println("Test C");
//		}
//	
	
}



