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

public class TR1ProvisioningEnumerations 
{
	static int i = 0;
	static WebDriver driver = null;
	static 
	{
		driver = new TR1WebDriver().getDriverInstance();
	}
  @Test
  public void ProvisioningEnumerations() throws InterruptedException 
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
	    driver.findElement(By.id("gwt-uid-70")).click();
	    takescreenshot();
	    Thread.sleep(4000);
	    System.out.println("Admin=>Customization=>Provisioning Enumerations screen");
	    Thread.sleep(4000);
	    takescreenshot();
	    System.out.println("Provisioning Enumerations process started");
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Going-In")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input[@type='text'])[10]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("Going-In");
	    driver.findElement(By.xpath("(//button[@type='button'])[10]")).click(); 
	    takescreenshot();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Going-In Incomplete")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input[@type='text'])[10]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("Going-In Incomplete");
	    driver.findElement(By.xpath("(//button[@type='button'])[10]")).click(); 
	    takescreenshot();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Going-Out")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input[@type='text'])[10]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("Going-Out");
	    driver.findElement(By.xpath("(//button[@type='button'])[10]")).click(); 
	    takescreenshot();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Going-Out Incomplete")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input[@type='text'])[10]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("Going-Out Incomplete");
	    driver.findElement(By.xpath("(//button[@type='button'])[10]")).click(); 
	    takescreenshot();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Going-Out Incomplete")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input[@type='text'])[10]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("Going-Out Incomplete");
	    driver.findElement(By.xpath("(//button[@type='button'])[10]")).click(); 
	    takescreenshot();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("In Service")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input[@type='text'])[10]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("In Service");
	    driver.findElement(By.xpath("(//button[@type='button'])[10]")).click(); 
	    takescreenshot();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Out of Service")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input[@type='text'])[10]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("Out of Service");
	    driver.findElement(By.xpath("(//button[@type='button'])[10]")).click(); 
	    Thread.sleep(2000);
	    takescreenshot();
	  
  }
  public static void takescreenshot() 
	{
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("ScreenShots\\ProvisioningEnumerations" + i + ".png"));
			System.out.println("ProvisioningEnumerations" + i + "taken");
			i++;
		} catch (Exception e) {

			System.out.println("Exception while taking screenshot " + e.getMessage());
		}
	}
}
