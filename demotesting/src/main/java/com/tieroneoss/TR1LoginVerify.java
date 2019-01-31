package com.tieroneoss.tnp.inv.LoginValidation;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.tieroneoss.tnp.inv.driver.TR1WebDriver;
import com.tieroneoss.tnp.inv.login.TR1TNPLogin;

public class TR1LoginVerify 
{
	 static int i=0;
	 static WebDriver driver=null;
	 static
		{
			driver = new TR1WebDriver().getDriverInstance();
		}
  @Test
  public void Loginvalidation() 
  {
	  
	  	//WebDriver driver=new FirefoxDriver();
	  	driver.manage().window().maximize();	 	
		//driver.get("http://192.168.221.224:8180/tnp-inventory/login/login.jsp");
		driver.get("http://192.168.221.225:8180/tnp-inventory/");
		takescreenshot();
		 
		System.out.println("The TNP title is:" +driver.getTitle());		
		takescreenshot();
		TR1TNPLogin login=new TR1TNPLogin(driver);		
		login.logintoTNP("admin","admin1001");		
		takescreenshot();   		
	    System.out.println("TNP logged in");
  }

public static void takescreenshot()
{
	 try 
	    {
	    TakesScreenshot ts=(TakesScreenshot)driver;
	     
	    File source=ts.getScreenshotAs(OutputType.FILE);
	     
	    // String test = null;
		FileUtils.copyFile(source, new File("ScreenShots\\Login"+i+".png"));
	     
	    System.out.println("Login"+i+"taken");
	    i++;
	    } 
	    catch (Exception e)
	    {
	     
	    System.out.println("Exception while taking screenshot "+e.getMessage());
	    } 
}
}
