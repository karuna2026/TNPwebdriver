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

public class TR1Enumerations 
{
	static int i = 0;
	static WebDriver driver = null;
	static 
	{
		driver = new TR1WebDriver().getDriverInstance();
	}
  @Test
  public void Enumerations() throws InterruptedException 
  {
	  EnumScreen();
	  EnumCreate();
	  EnumUpdate();
	  EnumDelete();
	  
	  
  }
  private void EnumScreen() throws InterruptedException 
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
	    driver.findElement(By.id("gwt-uid-69")).click();
	    takescreenshot();
	    Thread.sleep(4000);
	    System.out.println("Admin=>Customization=>Enumerations screen");
	
}
private void EnumCreate() throws InterruptedException 
{
	System.out.println("Enumerations create started");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//button[@type='button'])[12]")).click();					 
	Thread.sleep(5000);
	takescreenshot();
    driver.findElement(By.xpath("(//input[@type='text'])[12]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[12]")).sendKeys("TNPenum");
    driver.findElement(By.xpath("(//input[@type='text'])[13]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys("TNPenumdescription");
    Thread.sleep(5000);
    driver.findElement(By.cssSelector("i.fa.fa-save")).click();
    Thread.sleep(5000);
    takescreenshot();
    driver.findElement(By.cssSelector("i.fa.fa-close")).click();
    Thread.sleep(5000);
    takescreenshot();
}
private void EnumUpdate() throws InterruptedException 
{
	driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("TNPenum");
	driver.findElement(By.xpath("(//input[@value='Search'])[2]")).click();					 
	Thread.sleep(5000);
	takescreenshot();
    driver.findElement(By.xpath("//img[@onclick='new eXcell_ch(this.parentNode).changeState(true); (arguments[0]||event).cancelBubble=true; ']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//button[@type='button'])[13]")).click();
    Thread.sleep(5000);
    /*driver.findElement(By.cssSelector("table.viking-Selector-component-noBorder > tbody > tr > td > table > tbody > tr > td > table > tbody > tr > td > table > tbody > tr > td > button.gwt-Button")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//input[@type='text'])[17]")).sendKeys("1");
    driver.findElement(By.xpath("(//input[@type='text'])[18]")).sendKeys("Enum1");
    Thread.sleep(5000);    
    takescreenshot();    
    driver.findElement(By.cssSelector("table.viking-DisplayTable > tbody > tr > td > button.gwt-Button")).click();
    Thread.sleep(5000);
    driver.findElement(By.cssSelector("i.fa.fa-save")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("(//img[@onclick='new eXcell_ch(this.parentNode).changeState(true); (arguments[0]||event).cancelBubble=true; '])[23]")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[17]")).click();  
    Thread.sleep(2000);
    takescreenshot();
    driver.findElement(By.cssSelector("table.viking-DisplayTable > tbody > tr > td > button.gwt-Button")).click();*/
    driver.findElement(By.cssSelector("i.fa.fa-save")).click();
    Thread.sleep(5000);
    driver.findElement(By.cssSelector("i.fa.fa-close")).click();
    Thread.sleep(5000);
    takescreenshot();
}

private void EnumDelete() throws InterruptedException 
{
	driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("TNPenum");
	driver.findElement(By.xpath("(//input[@value='Search'])[2]")).click();					 
	Thread.sleep(5000);
	takescreenshot();
	driver.findElement(By.xpath("//img[@onclick='new eXcell_ch(this.parentNode).changeState(true); (arguments[0]||event).cancelBubble=true; ']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='text'])[14]")).click();
    Thread.sleep(5000);
    driver.findElement(By.cssSelector("table.viking-DisplayTable > tbody > tr > td > button.gwt-Button")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).click(); 
    driver.findElement(By.cssSelector("i.fa.fa-save")).click();
    Thread.sleep(5000);
    driver.findElement(By.cssSelector("i.fa.fa-close")).click();
}
public static void takescreenshot() 
	{
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("ScreenShots\\Enumerations" + i + ".png"));
			System.out.println("Enumerations" + i + "taken");
			i++;
		} catch (Exception e) {

			System.out.println("Exception while taking screenshot " + e.getMessage());
		}
	}
  
  
}
