package soucedemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class A2_Homepage_POM 
 {

    private WebDriver  driver;
	
	@FindBy(xpath= "//button[text()='Add to cart']") private List<WebElement> cart;
	
	
	public void addtocart()
	{
		for(WebElement i : cart)
	         i.click();
		
		System.out.println("all item add in cart");
		
	}
	
	
	
//*******************************************************************************
	
	@FindBy(xpath="//a [@class='shopping_cart_link']")private WebElement clicktocart;
	
	public String cartlogo()
	{
		String Totalcount = clicktocart.getText();
		clicktocart.click();
		System.out.println("click on the cart button");
		 return Totalcount;
		
	
	
	}
	
//***********************************************************************************************
	
	
	@FindBy(xpath="/html/body/div/div/div/div[1]/div[2]/div/span/select") private WebElement filter;
	
	public void dropdown()
	 {
		 filter.click();
		 Select s = new Select (filter);
			s.selectByValue("lohi");	 
			System.out.println("select low to high price");
	 }
//*************************************************************************************************	
    @FindBy(xpath ="//button[@id='react-burger-menu-btn']") private WebElement option;
	
	@FindBy(xpath ="//a[@id='logout_sidebar_link']") private WebElement logout;
	
	 public void options()
	   {
		  option.click();
		  System.out.println("go to the option");
	   }
	   
	   public void logout()
	   {
		   logout.click();
		  System.out.println("click on the logout button");
	   }
	   
//************************************************************************************************

	
	public A2_Homepage_POM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
 }
