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

public class TR1Privileges 
{
	static int i=0;
	static WebDriver driver = null;
	static
	{
		driver = new TR1WebDriver().getDriverInstance();
	}
  @Test
  public void PrivilegesTest() throws InterruptedException 
  {
	  System.out.println("Web Driver loading...");
		
		// Maximize the browser
		driver.manage().window().maximize();	
			
		privileges();
  }
  @BeforeTest
  public void beforeTest() 
  {
	  
  }

  @AfterTest
  public void afterTest() 
  {
  }


	private static void privileges() throws InterruptedException
	{
		Thread.sleep(10000);
		System.out.println("To click admin");
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gwt-uid-58")));
		
		driver.findElement(By.id("gwt-uid-58")).click();
		Thread.sleep(2000);
		System.out.println("Admin Clicked");
	    driver.findElement(By.id("gwt-uid-59")).click();
	    Thread.sleep(2000);
	    System.out.println("Security");
	    driver.findElement(By.id("gwt-uid-63")).click();
	    takescreenshot();
	    Thread.sleep(4000);
	    System.out.println("Admin=>Security=>Privileges screen screen");
	    Thread.sleep(3000);
	    
	    driver.findElement(By.cssSelector("div.gwt-TabBarItem > div.gwt-Label")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@id='grid_10']/div/table/tbody/tr[2]/td[2]/div/img")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//td[3]/div/div")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//div[@id='grid_11']/div/table/tbody/tr[2]/td[2]/div")).click();
	    takescreenshot();
	    driver.findElement(By.xpath("//td[4]/div/div")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@id='grid_12']/div/table/tbody/tr[2]/td[2]/div/img")).click();
	    Thread.sleep(3000);
	    takescreenshot();
	   
	    driver.findElement(By.xpath("//td[5]/div/div")).click();
	    driver.findElement(By.xpath("//div[@id='grid_13']/div/table/tbody/tr[2]/td[2]/div/img")).click();
	    takescreenshot();
	    driver.findElement(By.xpath("//td[6]/div/div")).click();
	    driver.findElement(By.xpath("//div[@id='grid_14']/div/table/tbody/tr[2]/td[2]/div/img")).click();
	    takescreenshot();
	    driver.findElement(By.xpath("//td[7]/div/div")).click();
	    driver.findElement(By.xpath("//div[@id='grid_15']/div/table/tbody/tr[2]/td[2]/div")).click();
	    takescreenshot();
	    driver.findElement(By.xpath("//td[8]/div/div")).click();
	    driver.findElement(By.xpath("//div[@id='grid_17']/div/table/tbody/tr[2]/td[2]/div/img")).click();
	    takescreenshot();
	    driver.findElement(By.xpath("//td/table/tbody/tr/td[9]/div")).click();
	    driver.findElement(By.xpath("//div[@id='grid_18']/div/table/tbody/tr[2]/td[2]/div/img")).click();
	    takescreenshot();
	    driver.findElement(By.xpath("//td[10]/div/div")).click();
	    driver.findElement(By.xpath("//div[@id='grid_19']/div/table/tbody/tr[2]/td[2]/div/img")).click();
	    takescreenshot();
	    
	    driver.findElement(By.cssSelector("i.fa.fa-save")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("i.fa.fa-refresh")).click();
	    Thread.sleep(2000);
	    
	}

		
	public static void takescreenshot()
	 {
		 try 
		    {
		    TakesScreenshot ts=(TakesScreenshot)driver;
		     
		    File source=ts.getScreenshotAs(OutputType.FILE);
		    		   
			FileUtils.copyFile(source, new File("ScreenShots\\Privileges"+i+".png"));
		     
		    System.out.println("privileges"+i+"taken");
		    i++;
		    } 
		    catch (Exception e)
		    {
		     
		    System.out.println("Exception while taking screenshot "+e.getMessage());
		    } 
	 }
}
