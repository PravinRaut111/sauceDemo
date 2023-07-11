package soucedemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A4_Checkout_POM 
  {


	private WebDriver driver ;
	
	@FindBy(xpath = "//input [@id='first-name']") private WebElement first;
	
	@FindBy(xpath ="//input [@id='last-name']") private WebElement last;
	
	@FindBy(xpath ="//input [@id='postal-code']") private WebElement postelcode;
	
	@FindBy(xpath ="/html/body/div/div/div/div[2]/div/form/div[2]/input")private WebElement submit;
	
	
	
	public void firstname()
	{
		first.sendKeys("abcd");
		System.out.println("first name enterd successfully");
	}
	
	public void lastname()
	{
		last.sendKeys("xyz");
		System.out.println("last name enterd successfully");
	}
	
	public void pincode()
	{
		postelcode.sendKeys("123456");
		System.out.println("pincode enterd successfully");
	}
	
	public void submitinfo()
	{
		submit.click();
		System.out.println("click on submit button successfully");
	}
	
	
	
	public A4_Checkout_POM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	
   }
	
	
	
	
  }
