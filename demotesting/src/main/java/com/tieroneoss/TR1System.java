package com.tieroneoss.tnp.inv.System;

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

public class TR1System 
{
	static int i = 0;
	static WebDriver driver = null;
	static 
	{
		driver = new TR1WebDriver().getDriverInstance();
	}
  @Test(enabled=true)
  public void SystemTest() throws InterruptedException 
  {
	  driver.manage().window().maximize(); // Maximize the browser
		systemscreen();
		systemoperations();
	  
  }
  
private void systemscreen() throws InterruptedException 
{
	Thread.sleep(7000);
	System.out.println("To click admin");

	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(By.id("gwt-uid-58")));

	driver.findElement(By.id("gwt-uid-58")).click();
	Thread.sleep(2000);
	System.out.println("Admin Clicked");
	driver.findElement(By.id("gwt-uid-66")).click();
	takescreenshot();
	Thread.sleep(4000);
	System.out.println("Admin=>System");
	
}

private void systemoperations() throws InterruptedException 
{
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("div.gwt-TabBarItem.gwt-TabBarItem-selected > div.gwt-Label")).click();
    Thread.sleep(3000);
    takescreenshot();
    driver.findElement(By.xpath("//td[3]/div/div")).click();
    Thread.sleep(3000);
    takescreenshot();
    driver.findElement(By.xpath("//td[4]/div/div")).click();
    Thread.sleep(4000);
    takescreenshot();
    driver.findElement(By.xpath("//td[5]/div/div")).click();
    takescreenshot();
    driver.findElement(By.xpath("//td[6]/div/div")).click();
    Thread.sleep(3000);
    takescreenshot();
    driver.findElement(By.xpath("//td[7]/div/div")).click();
    Thread.sleep(3000);
    takescreenshot();   
    driver.findElement(By.xpath("//td[8]/div/div")).click();
    Thread.sleep(3000);
    takescreenshot();
    driver.findElement(By.xpath("//td[9]/div/div")).click();
    Thread.sleep(3000);
    takescreenshot();
    driver.findElement(By.xpath("//td[10]/div/div")).click();
    Thread.sleep(3000);
    takescreenshot();
    driver.findElement(By.xpath("//td[11]/div/div")).click();
    Thread.sleep(3000);
    takescreenshot();
    driver.findElement(By.xpath("//td[12]/div/div")).click();
    Thread.sleep(3000);
    takescreenshot();
    driver.findElement(By.xpath("//td[13]/div/div")).click();
    Thread.sleep(3000);
    takescreenshot();
    driver.findElement(By.xpath("//td[14]/div/div")).click();
    Thread.sleep(3000);
    takescreenshot();    
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("i.fa.fa-save")).click();
    Thread.sleep(3000);   
    driver.findElement(By.cssSelector("i.fa.fa-refresh")).click();
    Thread.sleep(2000);
    System.out.println("System process done successfully");
	
}

public static void takescreenshot() 
	{
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("ScreenShots\\System" + i + ".png"));
			System.out.println("System" + i + "taken");
			i++;
		} catch (Exception e) {

			System.out.println("Exception while taking screenshot " + e.getMessage());
		}
	}
}
