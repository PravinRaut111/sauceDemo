package soucedemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import soucedemo.POMClasses.A1_Login_page_POM;
import soucedemo.UtilityClasses.TakeScreenshot;

public class T001_VerifyLoginFunctionality extends TestBaseClass
  {
	@Test 
	public void loginfunction() throws IOException
	{
				
	TakeScreenshot.Screenshot(driver);	
	
	//verify login functionality
	
	
	TakeScreenshot.Screenshot(driver);

	String expectedTitle  = "Swag Labs";
	
	String actualTitle  = driver.getTitle();
	
	if(expectedTitle.equals(actualTitle)) //validation
	{
		System.out.println("we have successfully logined to saucedmo ");
		System.out.println("test case is pass");
	}
	else
	{
		System.out.println("test case is failed");
	}
	
	TakeScreenshot.Screenshot(driver);
	
	}
	}
