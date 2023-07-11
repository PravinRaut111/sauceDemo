package soucedemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	
	
	//Hard Assert
	@Test
	public void pravin()
	{
		String expectdTitle1 = "Pankhudi";		
		String actualTitle1 = "Pankhudi";
		
		//Assert.assertEquals(actualTitle, expectdTitle);

	Assert.assertEquals(actualTitle1, expectdTitle1);
	}
	@Test
	public void raut()
	{
		String expectdTitle2 = "Pankhudi";		
		String actualTitle2 = "Pankhudi";
		
        SoftAssert soft = new SoftAssert();
		
        soft.assertEquals(actualTitle2, expectdTitle2);
		soft.assertAll();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	

}
