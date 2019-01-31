package com.tieroneoss.tnp.inv.Customization;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.tieroneoss.tnp.inv.driver.TR1WebDriver;

public class TR1Packages 
{
	static int i = 0;
	static WebDriver driver = null;
	static 
	{
		driver = new TR1WebDriver().getDriverInstance();
	}
  @Test
  public void Packages() throws InterruptedException 
  {
	  PackageScreen();
	  PackageInstall();	  
	  PackageExport();
	  PackageUninstall();
	  PackageDelete();
  }
  
private void PackageScreen() throws InterruptedException 
{
	 	Thread.sleep(7000);
		System.out.println("To click admin");
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gwt-uid-58")));
		
		driver.findElement(By.id("gwt-uid-58")).click();
		Thread.sleep(2000);
		System.out.println("Admin Clicked");
	    driver.findElement(By.id("gwt-uid-67")).click();
	    Thread.sleep(2000);
	    System.out.println("Customization");
	    driver.findElement(By.id("gwt-uid-71")).click();
	    takescreenshot();
	    Thread.sleep(4000);
	    System.out.println("Admin=>Customization=>Packages screen");
	
}

private void PackageInstall() 
{
	// TODO Auto-generated method stub
	
}

private void PackageExport() 
{
	// TODO Auto-generated method stub
	
}

private void PackageUninstall() 
{
	// TODO Auto-generated method stub
	
}

private void PackageDelete() 
{
	// TODO Auto-generated method stub
	
}

public static void takescreenshot() 
	{
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("ScreenShots\\Packages" + i + ".png"));
			System.out.println("Packages" + i + "taken");
			i++;
		} catch (Exception e) {

			System.out.println("Exception while taking screenshot " + e.getMessage());
		}
	}
  
  
}
