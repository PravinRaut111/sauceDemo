package soucedemo.TestClasses;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import soucedemo.POMClasses.A1_Login_page_POM;
import soucedemo.POMClasses.A2_Homepage_POM;
import soucedemo.UtilityClasses.TakeScreenshot;

public class TestBaseClass 
{
	WebDriver driver;

	
	@BeforeClass
	  public void SystemSetup()
	  {
	System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");

	  driver = new ChromeDriver(options);

	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");

	System.out.println("URL is opened");
	  }
	
	   @BeforeMethod // Annotation
	    public void setUP() throws IOException, InterruptedException
	   {
		
		TakeScreenshot.Screenshot(driver);
		
		A1_Login_page_POM lp =new A1_Login_page_POM(driver);
		lp.username();
		Thread.sleep(5000);
		lp.password();
		Thread.sleep(5000);
		lp.login();
		Thread.sleep(5000);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@AfterMethod // Annotation
	public void tearDown() {
		// logOut

		A2_Homepage_POM hp = new A2_Homepage_POM(driver);
		 
		 hp.options();
		 hp.logout();
		
	}
	
	@AfterClass
	 public void closebrowser()
	 {
		driver.close();
		System.out.println("browser is closed");
	 }

}
