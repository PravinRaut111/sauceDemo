package soucedemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A5_Checkout_overview
 {
    
	
	private WebDriver driver ;
	
	@FindBy(xpath ="//button [@id='finish']")private WebElement finish;
	
	
	
	public void finshbutton()
	{
		finish.click();
		System.out.println("click on finsh button");
	}
	
	
	public A5_Checkout_overview(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	
   }
	
	
	
	
	
	
	
	
	
	
	
	
 }
