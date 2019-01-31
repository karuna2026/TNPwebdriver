package com.tieroneoss.tnp.inv.Schedules;

import org.testng.annotations.Test;

import com.tieroneoss.tnp.inv.driver.TR1WebDriver;

import org.testng.annotations.BeforeTest;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class TR1Schedules 
{
	static int i=0;
	static WebDriver driver = null;
	static
	{
		driver = new TR1WebDriver().getDriverInstance();
	}
  @Test
  public void Schedules() throws InterruptedException 
  {
	  Schedulesscreen();
	  CreateSchedules();
	  EditSchedules();
	  DeleteSchedules();
	  
  }


private void Schedulesscreen() throws InterruptedException
{
	Thread.sleep(10000);
	System.out.println("To click admin");	
	WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.elementToBeClickable(By.id("gwt-uid-58")));	
	driver.findElement(By.id("gwt-uid-58")).click();
	Thread.sleep(2000);	
    System.out.println("Schedulesscreen");
    driver.findElement(By.id("gwt-uid-64")).click();
    takescreenshot();
    Thread.sleep(4000);
    System.out.println("Admin=>Schedulesscreen");
}


private void CreateSchedules() throws InterruptedException 
{
	System.out.println("Schedules  create started");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//button[@type='button'])[12]")).click();					 
	Thread.sleep(5000);
	takescreenshot();
    driver.findElement(By.xpath("(//input[@type='text'])[14]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[14]")).sendKeys("TNPSchedules");
    new Select(driver.findElement(By.xpath("//tr[2]/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td/select"))).selectByVisibleText("Yes");
    Thread.sleep(3000);
    takescreenshot();
    new Select(driver.findElement(By.xpath("//tr[2]/td[2]/table/tbody/tr/td/select"))).selectByVisibleText("NE Upload and Reconciliation");
    Thread.sleep(3000);
    takescreenshot();
    new Select(driver.findElement(By.xpath("//tr[3]/td[2]/table/tbody/tr/td/select"))).selectByVisibleText("HPETV2");
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//input[@type='text'])[22]")).click();
    Thread.sleep(3000);
    takescreenshot();     
    Thread.sleep(3000);
    
    Thread.sleep(3000);
    driver.findElement(By.xpath("/html/body/div[4]/div/table")).click();
    Thread.sleep(3000);
    new Select(driver.findElement(By.xpath("//td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/select"))).selectByVisibleText("ONETIME");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//td[3]/div/div")).click();
    Thread.sleep(3000);  
    takescreenshot();
    driver.findElement(By.xpath("(//button[@type='button'])[18]")).click();
    Thread.sleep(3000); 
    driver.findElement(By.xpath("(//input[@type='text'])[28]")).clear();
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//input[@type='text'])[28]")).sendKeys("k.");
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//input[@value='Search'])[3]")).click();
    Thread.sleep(3000);
    takescreenshot();
    driver.findElement(By.linkText("k.ON15454S.copy.4")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//td[4]/div/div")).click();
    Thread.sleep(3000);
    takescreenshot();
    driver.findElement(By.linkText("Upload Mode")).click();
    Thread.sleep(3000);
    takescreenshot();
    driver.findElement(By.linkText("UPDATE")).click();
    Thread.sleep(3000);
    
    
    /*driver.findElement(By.xpath("")).click();
    driver.findElement(By.xpath("")).click();  
    
    driver.findElement(By.xpath("")).click();
    
     driver.findElement(By.cssSelector("")).click();
    
    
    */
    driver.findElement(By.cssSelector("i.fa.fa-save")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("i.fa.fa-refresh")).click();
    Thread.sleep(2000);
    takescreenshot();
    driver.findElement(By.cssSelector("i.fa.fa-close")).click();
    Thread.sleep(5000);
   
    
    if(driver.getPageSource().contains("TNPSchedules"))
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
    takescreenshot();
}

private void EditSchedules() throws InterruptedException 
{
	 	driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("TNP");    
	    driver.findElement(By.xpath("(//input[@value='Search'])[2]")).click();
	    Thread.sleep(5000);	
	    takescreenshot();
	    driver.findElement(By.xpath("//img[@onclick='new eXcell_ch(this.parentNode).changeState(true); (arguments[0]||event).cancelBubble=true; ']")).click();
	    Thread.sleep(2000);	  
	    takescreenshot();
	    driver.findElement(By.xpath("(//button[@type='button'])[13]")).click();	  
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//td[4]/div/div")).click();
	    Thread.sleep(3000);
	    takescreenshot();
	    driver.findElement(By.linkText("Upload Mode")).click();
	    Thread.sleep(3000);
	    takescreenshot();
	    driver.findElement(By.linkText("REPORT")).click();
	    Thread.sleep(3000);    
	    
	    driver.findElement(By.cssSelector("i.fa.fa-save")).click();
	    Thread.sleep(2000);
	    takescreenshot();
	    driver.findElement(By.cssSelector("i.fa.fa-refresh")).click();
	    Thread.sleep(2000);
	    takescreenshot();
	    driver.findElement(By.cssSelector("i.fa.fa-close")).click();
	    Thread.sleep(5000);
	   
	    
	
}

private void DeleteSchedules() throws InterruptedException
{
	driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("TNP");    
    driver.findElement(By.xpath("(//input[@value='Search'])[2]")).click();
    Thread.sleep(5000);	
    takescreenshot();
    driver.findElement(By.xpath("//img[@onclick='new eXcell_ch(this.parentNode).changeState(true); (arguments[0]||event).cancelBubble=true; ']")).click();
    Thread.sleep(2000);	    
    takescreenshot();
    driver.findElement(By.xpath("(//button[@type='button'])[14]")).click();
    takescreenshot();  
    Thread.sleep(2000);	
    driver.findElement(By.cssSelector("table.viking-GetConfirmationPopup-buttonPanel > tbody > tr > td > button.gwt-Button")).click();
    takescreenshot();
    Thread.sleep(5000);	
    //driver.switchTo().frame("/html/body/div[4]");
    
    //driver.switchTo().frame("/html/body/div[4]");
    Thread.sleep(5000);
    
    driver.findElement(By.xpath("(//button[@type='button'])[15]")).click();
    takescreenshot();
    Thread.sleep(2000);	
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("TNP");    
    driver.findElement(By.xpath("(//input[@value='Search'])[2]")).click();
    takescreenshot();   
	
}
@BeforeTest
  public void beforeTest() 
  {
	  
  }

  @AfterTest
  public void afterTest() 
  {
	  
  }
  
  
  public static void takescreenshot()
	 {
		 try 
		    {
		    TakesScreenshot ts=(TakesScreenshot)driver;
		    File source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("ScreenShots\\Schedules"+i+".png"));
		    System.out.println("Schedules"+i+"taken");
		    i++;
		    } 
		    catch (Exception e)
		    {
		     
		    System.out.println("Exception while taking screenshot "+e.getMessage());
		    } 
	 }
}


