package soucedemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import soucedemo.POMClasses.A3_Cart_POM;
import soucedemo.POMClasses.A2_Homepage_POM;
import soucedemo.POMClasses.A1_Login_page_POM;
import soucedemo.UtilityClasses.TakeScreenshot;

public class T003_VerifyWhetherAddToCartFunctinality extends TestBaseClass
 {
  
	@Test
	public  void AddToCart() throws IOException {
		
		
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
 }
