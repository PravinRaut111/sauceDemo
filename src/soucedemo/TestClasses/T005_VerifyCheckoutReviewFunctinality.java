package soucedemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import soucedemo.POMClasses.A3_Cart_POM;
import soucedemo.POMClasses.A4_Checkout_POM;
import soucedemo.POMClasses.A5_Checkout_overview;
import soucedemo.POMClasses.A2_Homepage_POM;
import soucedemo.POMClasses.A1_Login_page_POM;
import soucedemo.UtilityClasses.TakeScreenshot;

 public class T005_VerifyCheckoutReviewFunctinality extends TestBaseClass
 {
       public  void CheckoutReview() throws IOException {
		
				
		A1_Login_page_POM lp =new A1_Login_page_POM(driver);
		lp.username();
		lp.password();
		lp.login();
		
		TakeScreenshot.Screenshot(driver);

//***********************************************************************************
		
		A2_Homepage_POM IT = new A2_Homepage_POM(driver);
	    IT.addtocart();
	    TakeScreenshot.Screenshot(driver);
	    IT.cartlogo();
	      
	    String ExpectedURL ="https://www.saucedemo.com/cart.html";
	    String ActualURL   = driver.getCurrentUrl();
	    if(ExpectedURL.equals(ActualURL))
	    {
	    	System.out.println("Successfully navigate Homepage to cart page");
	    }
	    else
	    {
	    	System.out.println("not navigate Homepage to cart page ");
	    }
	    
//************************************************************************************
	    

		
		A3_Cart_POM ct = new A3_Cart_POM(driver);
		ct.remove();
		TakeScreenshot.Screenshot(driver);
		
		ct.checkoutbutton();
		
		TakeScreenshot.Screenshot(driver);
		
//***************************************************************************
		A4_Checkout_POM co = new A4_Checkout_POM(driver);
		co.firstname();
		TakeScreenshot.Screenshot(driver);
		co.lastname();
		TakeScreenshot.Screenshot(driver);
		co.pincode();
		TakeScreenshot.Screenshot(driver);
		co.submitinfo();
		
		String checkoutExpURL = "https://www.saucedemo.com/checkout-step-two.html";
		String checkoutActURL = driver.getCurrentUrl();
		
		if(checkoutExpURL.equals(checkoutActURL))
		{
			System.out.println("Successfully navigate to checkout final step");
		}
		else
		{
			System.out.println("not Successfully navigate to checkout page");
		}
		
		
//*******************************************************************************
		
		A5_Checkout_overview cov = new A5_Checkout_overview(driver);
		
		cov.finshbutton();
		TakeScreenshot.Screenshot(driver);
		
		String b2hExpected = "https://www.saucedemo.com/inventory.html";
		String b2hActual   = driver.getCurrentUrl();
		
		if(b2hExpected.equals(b2hActual))
		{
			System.out.println("b2h test successfully pass");
		}
		else
		{
			System.out.println("b2h test failed");
		}
//********************************************************************************
		
		
		
		
		
		
		
		
		
		
	
}
	
	
	
	
	
	
 }
