package soucedemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A3_Cart_POM
 {

    private WebDriver driver;
	
	@FindBy(xpath="/html/body/div/div/div/div[1]/div[1]/div[3]/a") private WebElement cart;
	
	@FindBy(xpath="/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/button") private WebElement removeButton;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div[2]/button[2]") private WebElement checkoutButton;
	
	public void clickoncart()
	{
		cart.click();
		System.out.println("go to the cart");
	}
	
	public void remove()
	{
		removeButton.click();
		
		System.out.println("remove cart item");
	}
	
	
	public void checkoutbutton ()
	{
		checkoutButton.click();
		System.out.println("click on chekout button");
	}
	
	
	public A3_Cart_POM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 }
