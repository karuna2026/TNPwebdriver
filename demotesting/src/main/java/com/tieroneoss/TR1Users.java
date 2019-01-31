package com.tieroneoss.tnp.inv.Security;

import com.tieroneoss.tnp.inv.LoginValidation.*;
import com.tieroneoss.tnp.inv.driver.TR1WebDriver;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TR1Users 
{
	TR1LoginVerify LoginVerify=new TR1LoginVerify();
	static int i=0;
	static WebDriver driver = null;
	static
	{
		driver = new TR1WebDriver().getDriverInstance();
	}
  @Test(enabled=false)
  public void useroperations() throws InterruptedException 
  {
	 	driver.manage().window().maximize();	// Maximize the browser	
		userscreen();
		usercreate();
		usercopy();
		usersearch();		
		useredit();
		userdelete();	
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException
  {
	 // userscreen();
  }

  @AfterTest
  public void afterTest() throws InterruptedException 
  {
	  usersearch();
  }

	public static void userscreen() throws InterruptedException 
	{
		Thread.sleep(7000);
		System.out.println("To click admin");
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gwt-uid-58")));
		
		driver.findElement(By.id("gwt-uid-58")).click();
		Thread.sleep(2000);
		System.out.println("Admin Clicked");
	    driver.findElement(By.id("gwt-uid-59")).click();
	    Thread.sleep(2000);
	    System.out.println("Security");
	    driver.findElement(By.id("gwt-uid-60")).click();
	    takescreenshot();
	    Thread.sleep(4000);
	    System.out.println("Admin=>Security=>Users screen");
	}
		
	private static void usercreate() throws InterruptedException 
	{
		System.out.println("User create started");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='button'])[13]")).click();					 
		Thread.sleep(5000);
	    driver.findElement(By.xpath("(//input[@type='text'])[13]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys("TNPselenium");
	    driver.findElement(By.xpath("(//input[@type='text'])[15]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[15]")).sendKeys("TNPselenium");
	    driver.findElement(By.xpath("(//input[@type='text'])[16]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[16]")).sendKeys("Test1");
	    driver.findElement(By.xpath("(//input[@type='text'])[17]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[17]")).sendKeys("sele21@t1.com");
	    driver.findElement(By.cssSelector("textarea.gwt-TextArea")).clear();
	    driver.findElement(By.cssSelector("textarea.gwt-TextArea")).sendKeys("user created for automation testing");
	    new Select(driver.findElement(By.xpath("//tr[2]/td/table/tbody/tr/td/table/tbody/tr[5]/td[4]/table/tbody/tr/td/select"))).selectByVisibleText("Yes");
	    
	    //new Select(driver.findElement(By.cssSelector("select.gwt-ListBox"))).selectByVisibleText("Yes");
	    driver.findElement(By.cssSelector("i.fa.fa-save")).click();
	    Thread.sleep(3000);
	    //usergroupcreate();
	    new Select(driver.findElement(By.xpath("//tr[7]/td[2]/table/tbody/tr/td/select"))).selectByVisibleText("default");
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("input.gwt-PasswordTextBox")).clear();
	    driver.findElement(By.cssSelector("input.gwt-PasswordTextBox")).sendKeys("selenium1");
	    driver.findElement(By.xpath("(//input[@type='password'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("selenium1");
	    Thread.sleep(2000);    
	    driver.findElement(By.cssSelector("div > table.viking-DisplayTable > tbody > tr > td > table > tbody > tr > td > table.viking-DisplayTable > tbody > tr > td > button.gwt-Button")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//input[@value='Search'])[3]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("NETPortal Administrators")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("i.fa.fa-save")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//tr[7]/td[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("i.fa.fa-save")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("i.fa.fa-refresh")).click();
	    Thread.sleep(2000);
	    takescreenshot();
	    driver.findElement(By.cssSelector("i.fa.fa-close")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("TNPselenium");
	    driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td/div/div/div/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr/td[1]/input")).click();
	    Thread.sleep(5000);
	    
	    if(driver.getPageSource().contains("TNPselenium"))
	    {
	    	System.out.println("Text is present");
	    	Thread.sleep(5000);
	    	JavascriptExecutor js =(JavascriptExecutor)driver;
	        js.executeScript("alert('Text is present--TNP!');");
	 
	        //Thread.sleep(5000);
	        
	    	
	    }
	    else
	    {
	    	System.out.println("alert(Text is absent)!");
	    	JavascriptExecutor js1 =(JavascriptExecutor)driver;
	        js1.executeScript("alert('Text is Absent--TNP');");
	        
	    }
	    Thread.sleep(5000);
	    
	    driver.switchTo().alert().accept();
	    
	}

	public static void usersearch() throws InterruptedException
	{
	 	    
		try{
		    Thread.sleep(7000);
		    driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
		    driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("TNPselenium");
		    driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td/div/div/div/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr/td[1]/input")).click();
		    takescreenshot();
		    if(driver.getPageSource().contains("TNPselenium"))
		    {
		    	System.out.println("Text is present");
		    }
		    else
		    {
		    	System.out.println("Text is absent");
		    	
		    }
		    Thread.sleep(4000);
		    System.out.println("Users=>Search");		  
		    System.out.println("User selected");
		    driver.findElement(By.linkText("TNPselenium")).click();
		   
		   System.out.println("Open button clicked");
		    Thread.sleep(2000);
		   
		}	 
		catch (Exception us)
		{
			System.out.println("Exception while taking screenshot "+us.getMessage());
		} 
		
	 }

	private static void usercopy() throws InterruptedException
	{
		Thread.sleep(7000);
		System.out.println("User copy operation started");
		driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("TNPselenium");
	    takescreenshot();
	    Thread.sleep(4000);
	    System.out.println("User=>Search=>Copy");		  
	    driver.findElement(By.xpath("(//input[@value='Search'])[2]")).click();
	    Thread.sleep(7000);
	    driver.findElement(By.xpath("(//img[@onclick='new eXcell_ch(this.parentNode).changeState(true); (arguments[0]||event).cancelBubble=true; '])[1]")).click();
	    takescreenshot();
	    driver.findElement(By.xpath("(//button[@type='button'])[16]")).click();
	    Thread.sleep(7000);
	    driver.findElement(By.xpath("(//input[@type='text'])[13]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys("TNPselenium_copy");
	    
	    driver.findElement(By.xpath("(//input[@type='text'])[15]")).sendKeys("TNPselenium2_copy");
	    takescreenshot();
	    driver.findElement(By.xpath("(//input[@type='text'])[16]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[16]")).sendKeys("copy");
	    driver.findElement(By.xpath("(//input[@type='text'])[17]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[17]")).sendKeys("sele212@t1.com");
	    driver.findElement(By.cssSelector("textarea.gwt-TextArea")).clear();
	    driver.findElement(By.cssSelector("textarea.gwt-TextArea")).sendKeys("user created for automation testing copy updated");
	    new Select(driver.findElement(By.xpath("//tr[2]/td/table/tbody/tr/td/table/tbody/tr[5]/td[4]/table/tbody/tr/td/select"))).selectByVisibleText("Yes");
	    takescreenshot();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("input.gwt-PasswordTextBox")).clear();
	    driver.findElement(By.cssSelector("input.gwt-PasswordTextBox")).sendKeys("selenium1");
	    driver.findElement(By.xpath("(//input[@type='password'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("selenium1");
	    Thread.sleep(2000);    
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("i.fa.fa-save")).click();
	    Thread.sleep(3000);
	   
	    driver.findElement(By.cssSelector("i.fa.fa-refresh")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//button[@type='button'])[20]")).click();
	    takescreenshot();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("i.fa.fa-close")).click();
	    Thread.sleep(3000);    
	    takescreenshot();
	   
		
	}
	public static void useredit() throws InterruptedException 
		{
			
		
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("textarea.gwt-TextArea")));
			
			Thread.sleep(4000);
		    driver.findElement(By.cssSelector("textarea.gwt-TextArea")).sendKeys("      user details modified");
		    System.out.println("   Remarks updated");
		    driver.findElement(By.cssSelector("i.fa.fa-save")).click();
		    System.out.println("Details updated for edit ");
		    takescreenshot();  
		    driver.findElement(By.cssSelector("i.fa.fa-save")).click();
		    driver.findElement(By.cssSelector("i.fa.fa-refresh")).click();
		    driver.findElement(By.cssSelector("i.fa.fa-close")).click();
		    Thread.sleep(5000);
		    System.out.println("User edit Details closed");		    
		    System.out.println("Closed the record and return to user list grid");
		    takescreenshot();
		    		    
	}
	public static void userdelete() throws InterruptedException
	 {
		
			Thread.sleep(6000);			
		    takescreenshot();		   
			System.out.println("Selected the to deleting file");
			Thread.sleep(3000);
			takescreenshot();			
			driver.findElement(By.cssSelector("i.fa.fa-trash")).click();
		    driver.findElement(By.cssSelector("table.viking-GetConfirmationPopup-buttonPanel > tbody > tr > td > button.gwt-Button")).click();
		    takescreenshot();
		    System.out.println("Test script executed successfully.");
		   		 
	 }
	public static void takescreenshot()
	 {
		 try 
		    {
		    TakesScreenshot ts=(TakesScreenshot)driver;
		    File source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("ScreenShots\\Users"+i+".png"));
		    System.out.println("UsercreateScreenshot"+i+"taken");
		    i++;
		    } 
		    catch (Exception e)
		    {
		     
		    System.out.println("Exception while taking screenshot "+e.getMessage());
		    } 
	 }
}
