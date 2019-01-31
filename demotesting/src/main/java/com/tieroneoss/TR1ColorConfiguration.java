package com.tieroneoss.tnp.inv.Customization;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.tieroneoss.tnp.inv.driver.TR1WebDriver;

public class TR1ColorConfiguration 
{
	static int i = 0;
	static WebDriver driver = null;
	static 
	{
		driver = new TR1WebDriver().getDriverInstance();
	}
  @Test
  public void ColorConfiguration() throws InterruptedException
  {
	  ColorConfigurationscreen();
	  General();
	  Circuits();
	  Links();
	  Services();
	  RackSpace();
	  
	  
	 
	  
  }
  private void ColorConfigurationscreen() throws InterruptedException 
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
	    takescreenshot();
	    System.out.println("Customization clicked ");
	    driver.findElement(By.id("gwt-uid-68")).click();
	    takescreenshot();
	    Thread.sleep(4000);
	    System.out.println("Admin=>Customization =>ColorConfiguration screen");
		
}
private void General() throws InterruptedException 
{
	takescreenshot();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//td[2]/div/table/tbody/tr/td")).click();
	Thread.sleep(2000);	
	//new Select(driver.findElement(By.xpath("//div[3]/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/select"))).selectByVisibleText("White");
	Thread.sleep(2000);	
	//new Select(driver.findElement(By.xpath("//tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td[4]/table/tbody/tr/td/select"))).selectByVisibleText("purple");
	Thread.sleep(2000);
	new Select(driver.findElement(By.xpath("//tr[5]/td[2]/table/tbody/tr/td/select"))).selectByVisibleText("Silver");
	Thread.sleep(2000);
	new Select(driver.findElement(By.xpath("//tr[5]/td[4]/table/tbody/tr/td/select"))).selectByVisibleText("Gray");
	Thread.sleep(2000);
	new Select(driver.findElement(By.xpath("//tr[8]/td[2]/table/tbody/tr/td/select"))).selectByVisibleText("Black");
	Thread.sleep(2000);
	new Select(driver.findElement(By.xpath("//tr[8]/td[4]/table/tbody/tr/td/select"))).selectByVisibleText("Red");
	Thread.sleep(2000);
	new Select(driver.findElement(By.xpath("//tr[11]/td[2]/table/tbody/tr/td/select"))).selectByVisibleText("Maroon");
	Thread.sleep(2000);
	new Select(driver.findElement(By.xpath("//tr[11]/td[4]/table/tbody/tr/td/select"))).selectByVisibleText("Orange");
	Thread.sleep(2000);
	new Select(driver.findElement(By.xpath("//tr[14]/td[2]/table/tbody/tr/td/select"))).selectByVisibleText("Lime");
	takescreenshot();
	driver.findElement(By.cssSelector("i.fa.fa-save")).click();
    
}
private void Circuits() throws InterruptedException 
{
	driver.findElement(By.xpath("//td[3]/div/div")).click();
	Thread.sleep(2000);
	takescreenshot();
	new Select(driver.findElement(By.xpath("//div[2]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/select"))).selectByVisibleText("Orange");
	Thread.sleep(2000);
	new Select(driver.findElement(By.xpath("//tr[4]/td[2]/table/tbody/tr/td/select"))).selectByVisibleText("Teal");
	Thread.sleep(2000);
	takescreenshot();
	driver.findElement(By.cssSelector("i.fa.fa-save")).click();
   
	
}
private void Links() throws InterruptedException 
{
	Thread.sleep(3000);
	driver.findElement(By.xpath("//td[4]/div/div")).click();
	Thread.sleep(2000);
	takescreenshot();
	new Select(driver.findElement(By.xpath("//div[3]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/select"))).selectByVisibleText("Orange");
	Thread.sleep(2000);
	new Select(driver.findElement(By.xpath("//div[3]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[4]/table/tbody/tr/td/select"))).selectByVisibleText("Thin");
	Thread.sleep(2000);
	new Select(driver.findElement(By.xpath("//div[3]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[5]/td[2]/table/tbody/tr/td/select"))).selectByVisibleText("Silver");
	Thread.sleep(2000);
	new Select(driver.findElement(By.xpath("//div[3]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[5]/td[4]/table/tbody/tr/td/select"))).selectByVisibleText("Medium");
	Thread.sleep(2000);
	new Select(driver.findElement(By.xpath("//tr[9]/td[2]/table/tbody/tr/td/select"))).selectByVisibleText("Black");
	Thread.sleep(2000);
	new Select(driver.findElement(By.xpath("//tr[9]/td[4]/table/tbody/tr/td/select"))).selectByVisibleText("Thick");
	Thread.sleep(2000);	
	takescreenshot();
	driver.findElement(By.cssSelector("i.fa.fa-save")).click();
    
	
}
private void Services() throws InterruptedException 
{
	Thread.sleep(3000);
	driver.findElement(By.xpath("//td[5]/div/div")).click();
	
	takescreenshot();
	new Select(driver.findElement(By.xpath("//div[4]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/select"))).selectByVisibleText("Teal");
	
	new Select(driver.findElement(By.xpath("//div[4]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[4]/table/tbody/tr/td/select"))).selectByVisibleText("Thin");
	
	new Select(driver.findElement(By.xpath("//tr[6]/td[2]/table/tbody/tr/td/select"))).selectByVisibleText("Silver");
	
	new Select(driver.findElement(By.xpath("//tr[6]/td[4]/table/tbody/tr/td/select"))).selectByVisibleText("Medium");
	
	new Select(driver.findElement(By.xpath("//tr[10]/td[2]/table/tbody/tr/td/select"))).selectByVisibleText("Black");
	
	new Select(driver.findElement(By.xpath("//tr[10]/td[4]/table/tbody/tr/td/select"))).selectByVisibleText("Thick");
		
	takescreenshot();
	driver.findElement(By.cssSelector("i.fa.fa-save")).click();
  
	
}
private void RackSpace() throws InterruptedException 
{
	Thread.sleep(3000);
	driver.findElement(By.xpath("//td[6]/div/div")).click();	
	takescreenshot();
	new Select(driver.findElement(By.xpath("//div[5]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/select"))).selectByVisibleText("Silver");
	Thread.sleep(2000);
	new Select(driver.findElement(By.xpath("//div[5]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td[4]/table/tbody/tr/td/select"))).selectByVisibleText("Black");
	takescreenshot();
	driver.findElement(By.cssSelector("i.fa.fa-save")).click();
    
	
}
public static void takescreenshot() 
 	{
 		try {
 			TakesScreenshot ts = (TakesScreenshot) driver;
 			File source = ts.getScreenshotAs(OutputType.FILE);
 			FileUtils.copyFile(source, new File("ScreenShots\\ColorConfiguration" + i + ".png"));
 			System.out.println("ColorConfiguration" + i + "taken");
 			i++;
 		} catch (Exception e) {

 			System.out.println("Exception while taking screenshot " + e.getMessage());
 		}
 	}
}
