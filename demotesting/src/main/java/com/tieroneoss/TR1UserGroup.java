package com.tieroneoss.tnp.inv.Security;
import org.testng.annotations.Test;
import com.tieroneoss.tnp.inv.driver.TR1WebDriver;
import org.testng.annotations.BeforeTest;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class TR1UserGroup 
{
	static int i=0;
	static WebDriver driver = null;
	static
	{
		driver = new TR1WebDriver().getDriverInstance();
	}
  @Test
  public void UserGroupTest() throws InterruptedException 
  {
		driver.manage().window().maximize();// Maximize the browser
		usergroupscreen();
		usergroupcreate();		
		usergroupcopy();  
		//usergroupsearch();
		usergroupedit();	
		usergroupdelete();
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  public static void usergroupscreen() throws InterruptedException 
  {
  	Thread.sleep(10000);
  	System.out.println("To click admin");	
  	WebDriverWait wait = new WebDriverWait(driver,10);
  	wait.until(ExpectedConditions.elementToBeClickable(By.id("gwt-uid-58")));	
  	driver.findElement(By.id("gwt-uid-58")).click();
  	Thread.sleep(2000);
  	System.out.println("Admin Clicked");
      driver.findElement(By.id("gwt-uid-59")).click();
      Thread.sleep(2000);
      System.out.println("Security");
      driver.findElement(By.id("gwt-uid-61")).click();
      takescreenshot();
      Thread.sleep(4000);
      System.out.println("Admin=>Security=>User group screen Reached");
  }

private static void usergroupcreate() throws InterruptedException 
{
	System.out.println("Click create button");
	
    Thread.sleep(6000);
   
    driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td/div/div/div/div[2]/div/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[1]/button")).click();
	Thread.sleep(9000);
	System.out.println("Usergroup create  started");
	takescreenshot();
	driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td/div/div/div/div[3]/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td[1]/table/tbody/tr/td/input")).sendKeys("TNPusergroup");
	driver.findElement(By.cssSelector("textarea.gwt-TextArea")).clear();
    driver.findElement(By.cssSelector("textarea.gwt-TextArea")).sendKeys("user group created for automation testing");
    System.out.println("Remarks updated");	
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("i.fa.fa-save")).click();
    Thread.sleep(2000);
        
    /*driver.findElement(By.cssSelector("div > table.viking-DisplayTable > tbody > tr > td > table > tbody > tr > td > table.viking-DisplayTable > tbody > tr > td > button.gwt-Button")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//input[@value='Search'])[3]")).click();
    Thread.sleep(3000);
    driver.findElement(By.linkText("TNP")).click();*/
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("i.fa.fa-save")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("i.fa.fa-refresh")).click();
    Thread.sleep(2000);
    takescreenshot();
    driver.findElement(By.cssSelector("i.fa.fa-close")).click();
    Thread.sleep(3000);    
	
}

private static void usergroupcopy() throws InterruptedException
{
		
	Thread.sleep(7000);
	System.out.println("Usergroup copy operation started");
	driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
	driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("TNPusergroup");
	takescreenshot();
	driver.findElement(By.xpath("(//input[@value='Search'])[2]")).click();
    takescreenshot();
    Thread.sleep(4000);
    System.out.println("Usergroup=>Search");		  
    driver.findElement(By.xpath(".//*[@id='grid_8']/div[2]/table/tbody/tr[2]/td[2]/img")).click();    
    driver.findElement(By.xpath("(//button[@type='button'])[15]")).click();
    Thread.sleep(7000);
    takescreenshot();
    driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td/div/div/div/div[3]/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td[1]/table/tbody/tr/td/input")).sendKeys("TNPUsergroupcopy");
    driver.findElement(By.cssSelector("i.fa.fa-save")).click();
    Thread.sleep(4000);
    driver.findElement(By.cssSelector("i.fa.fa-refresh")).click();
    Thread.sleep(2000);
    takescreenshot();
    driver.findElement(By.cssSelector("i.fa.fa-close")).click();
    Thread.sleep(3000);
   ;
	
}




public static void usergroupsearch() throws InterruptedException
{
	
	try{
	    Thread.sleep(7000);
	    takescreenshot();
	    driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("TNPusergroup");	    
	    driver.findElement(By.xpath("(//input[@value='Search'])[2]")).click();
	    takescreenshot();
	    Thread.sleep(4000);
	    System.out.println("Usergroup=>Search");		  
	    System.out.println("User group selected");
	    
	}	 
	catch (Exception us)
	{
		System.out.println("Exception while taking screenshot "+us.getMessage());
	} 
	    
 }
public static void usergroupedit() throws InterruptedException 
	{
		
		driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("TNP");
	    driver.findElement(By.xpath("(//input[@value='Search'])[2]")).click();
		Thread.sleep(4000);
		takescreenshot();
		driver.findElement(By.linkText("TNPusergroup")).click();	
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("textarea.gwt-TextArea")));	
		Thread.sleep(4000);
		takescreenshot();
	    driver.findElement(By.cssSelector("textarea.gwt-TextArea")).sendKeys("      updated");
	    System.out.println("   Remarks updated");
	    driver.findElement(By.cssSelector("i.fa.fa-save")).click();
	    System.out.println("Details updated");
	    takescreenshot();	
		driver.findElement(By.cssSelector("i.fa.fa-save")).click();
	    driver.findElement(By.cssSelector("i.fa.fa-refresh")).click();
	    Thread.sleep(4000);
	    takescreenshot();
	    driver.findElement(By.cssSelector("i.fa.fa-close")).click();
	    Thread.sleep(4000);
	    System.out.println("User edit Details closed");
	   
	    		    
}
public static void usergroupdelete() throws InterruptedException
 {
	
		
		Thread.sleep(6000);
		System.out.println("Delete function started ");	
		System.out.println("Selected the record to deleting..");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("TNP");    
	    driver.findElement(By.linkText("TNPUsergroupcopy")).click();
	    takescreenshot();
	    Thread.sleep(4000);
	    System.out.println("Usergroup=>Search");		  
	    System.out.println("User group selected");
		takescreenshot();
		driver.findElement(By.cssSelector("i.fa.fa-trash")).click();
	    driver.findElement(By.cssSelector("table.viking-GetConfirmationPopup-buttonPanel > tbody > tr > td > button.gwt-Button")).click();
	    takescreenshot();
	    Thread.sleep(4000);
	    usergroupsearch();
	   
	 
 }
public static void takescreenshot()
 {
	 try 
	    {
	    TakesScreenshot ts=(TakesScreenshot)driver;	     
	    File source=ts.getScreenshotAs(OutputType.FILE);   
		FileUtils.copyFile(source, new File("ScreenShots\\UserGroup"+i+".png"));
	    System.out.println("Usergroupscreen"+i+"taken");
	    i++;
	    } 
	    catch (Exception e)
	    {
	     
	    System.out.println("Exception while taking screenshot "+e.getMessage());
	    } 
 }

}
