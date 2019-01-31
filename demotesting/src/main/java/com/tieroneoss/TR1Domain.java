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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class TR1Domain 
{
	 static int i=0;
	 static WebDriver driver = null;
		static
		{
			driver = new TR1WebDriver().getDriverInstance();
		}
  @Test
  public void Domaintest() throws InterruptedException 
  {
	  System.out.println("Web Driver loading...");
		
		// Maximize the browser
		driver.manage().window().maximize();
		domainscreen();
		domaincreate();
		
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }
  
  

	private static void domaincreate() throws InterruptedException 
	{
		Thread.sleep(10000);
		
	    takescreenshot();	  	
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("(//button[@type='button'])[12]")).click();
		Thread.sleep(9000);
		System.out.println("domain create  started");
		takescreenshot();
		
		driver.findElement(By.xpath("(//input[@type='text'])[12]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[12]")).sendKeys("TNPdomain");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[4]/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr/td/div/i")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(//input[@value='Search'])[3]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.linkText("System")).click();  
	    Thread.sleep(5000);
	  /*  driver.findElement(By.xpath("//tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td[4]/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr/td/div/i")).click();
	    takescreenshot();
	    Thread.sleep(7000);
	    driver.findElement(By.xpath("(//input[@value='Search'])[3]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.linkText("CUSTINV")).click();  	    
	    Thread.sleep(5000);*/
	    driver.findElement(By.xpath("(//input[@type='text'])[14]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[14]")).sendKeys("remarks");	    
	    driver.findElement(By.cssSelector("i.fa.fa-save")).click();
	    Thread.sleep(5000);
	    takescreenshot();
	    Thread.sleep(5000);
	    driver.findElement(By.cssSelector("table.viking-DisplayTable > tbody > tr > td > button.gwt-Button")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(//input[@value='Search'])[3]")).click();
	    Thread.sleep(5000);	   
	    driver.findElement(By.linkText("NETPortal Administrators")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.cssSelector("i.fa.fa-save")).click();
	    Thread.sleep(5000);
	    takescreenshot();
	    driver.findElement(By.xpath("//td/div/table/tbody/tr/td/table/tbody/tr[2]/td/table")).click();
	    driver.findElement(By.cssSelector("i.fa.fa-close")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(//input[@value='Search'])[2]")).click();
	    Thread.sleep(5000);
	    takescreenshot();
	    driver.findElement(By.linkText("TNPdomain")).click();
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("(//input[@type='text'])[14]")).sendKeys("      remarks updated in edit mode");
	    Thread.sleep(5000);
	    driver.findElement(By.cssSelector("i.fa.fa-save")).click();
	    Thread.sleep(5000);
	    takescreenshot();
	    driver.findElement(By.xpath("//td[5]/div/div")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//button[@type='button'])[21]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//input[@type='text'])[23]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[23]")).sendKeys("k.");
	    driver.findElement(By.xpath("(//input[@value='Search'])[3]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(//img[@onclick='new eXcell_ch(this.parentNode).changeState(true); (arguments[0]||event).cancelBubble=true; '])[13]")).click();
	    driver.findElement(By.xpath("(//img[@onclick='new eXcell_ch(this.parentNode).changeState(true); (arguments[0]||event).cancelBubble=true; '])[14]")).click();
	    driver.findElement(By.xpath("(//button[@type='button'])[28]")).click();
	    driver.findElement(By.cssSelector("i.fa.fa-save")).click();
	    Thread.sleep(3000);
	    takescreenshot();
	    driver.findElement(By.cssSelector("i.fa.fa-refresh")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("i.fa.fa-close")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("TNP");
	    driver.findElement(By.xpath("(//input[@value='Search'])[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//img[@onclick='new eXcell_ch(this.parentNode).changeState(true); (arguments[0]||event).cancelBubble=true; ']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//button[@type='button'])[14]")).click();
	    Thread.sleep(3000);	    
	    driver.findElement(By.cssSelector("table.viking-GetConfirmationPopup-buttonPanel > tbody > tr > td > button.gwt-Button")).click();
	    driver.findElement(By.xpath("(//input[@value='Search'])[2]")).click();
	    Thread.sleep(3000);
	    takescreenshot();
	    System.out.println("Domain operations success");
	    
		
		    
		
	}

	
	public static void domainscreen() throws InterruptedException 
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
	    driver.findElement(By.id("gwt-uid-62")).click();
	    takescreenshot();
	    Thread.sleep(4000);
	    System.out.println("Admin=>Security=>Domain screen");
	}
		
	
	public static void takescreenshot()
	 {
		 try 
		    {
		    TakesScreenshot ts=(TakesScreenshot)driver;
		     
		    File source=ts.getScreenshotAs(OutputType.FILE);
		     
		    // String test = null;
			FileUtils.copyFile(source, new File("ScreenShots\\Domain"+i+".png"));
		     
		    System.out.println("domainscreen"+i+"taken");
		    i++;
		    } 
		    catch (Exception e)
		    {
		     
		    System.out.println("Exception while taking screenshot "+e.getMessage());
		    } 
	 }


}
