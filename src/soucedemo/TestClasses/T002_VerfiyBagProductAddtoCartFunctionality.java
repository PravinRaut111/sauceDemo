package soucedemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import soucedemo.POMClasses.A2_Homepage_POM;
import soucedemo.POMClasses.A1_Login_page_POM;
import soucedemo.UtilityClasses.TakeScreenshot;

public class T002_VerfiyBagProductAddtoCartFunctionality extends TestBaseClass
   {
	@Test
	public  void main() throws IOException, InterruptedException 
	{
		
//		A1_Login_page_POM lp =new A1_Login_page_POM(driver);
//		lp.username();
//		lp.password();
//		lp.login();
//		
//		TakeScreenshot.Screenshot(driver);

//***********************************************************************************
		
		A2_Homepage_POM hp = new A2_Homepage_POM(driver);
	    hp.addtocart();
	    
	    Thread.sleep(3000);
	    String actaulCount =  hp.cartlogo();
	    
	    System.out.println(actaulCount+"Count");
	    
		   String expectedCount = "6";
		   
		   if(expectedCount.equals(actaulCount))
		   {
			   System.out.println("TC is passed");
		   }
		   else
		   {
			   System.out.println("TC is failed");
		   }

	    
	    TakeScreenshot.Screenshot(driver);
	   
//************************************************************************************
	    
	    
	} }
