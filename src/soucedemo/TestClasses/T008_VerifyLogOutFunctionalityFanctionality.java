package soucedemo.TestClasses;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import soucedemo.POMClasses.A2_Homepage_POM;

public class T008_VerifyLogOutFunctionalityFanctionality extends TestBaseClass
{	
 @Test
 public void logOutFunctionality()
 {
	 A2_Homepage_POM hp = new A2_Homepage_POM(driver);
	 
	 hp.options();
	 hp.logout();
	
	 
	 
	 
	 
 }
	
	
}
