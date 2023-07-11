package soucedemo.UtilityClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot 
{

	
	public static void Screenshot(WebDriver driver)throws IOException
	{
		String date=getdatetime();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File Destination=new File("C:\\Users\\Mayur Ambekar\\eclipse-workspace\\Pravin_Selenium\\Screenshot123/Image-"+date+".png");
		FileHandler.copy(Source, Destination);
		

	}

	public static String getdatetime()
	{
		Date currentdate = new Date();
	    DateFormat d1 = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		String date = d1.format(currentdate);
		return date;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
