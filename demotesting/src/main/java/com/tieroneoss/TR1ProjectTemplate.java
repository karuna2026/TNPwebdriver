package com.tieroneoss.tnp.inv.ProjectTemplate;

import org.testng.annotations.Test;

import com.tieroneoss.tnp.inv.driver.TR1WebDriver;

import org.testng.annotations.BeforeTest;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class TR1ProjectTemplate {
	static int i = 0;
	static WebDriver driver = null;
	static {
		driver = new TR1WebDriver().getDriverInstance();
	}

	@Test
	public void ProjectTemplateTest() throws InterruptedException {
		driver.manage().window().maximize(); // Maximize the browser
		ProjectTemplatescreen();
		ProjectTemplatecreate();
		ProjectTemplateedit();
		ProjectTemplatedelete();

	}

	private void ProjectTemplatescreen() throws InterruptedException 
	{
		Thread.sleep(10000);
		System.out.println("To click admin");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gwt-uid-58")));

		driver.findElement(By.id("gwt-uid-58")).click();
		Thread.sleep(2000);
		System.out.println("Admin Clicked");
		driver.findElement(By.id("gwt-uid-65")).click();
		takescreenshot();
		Thread.sleep(4000);
		System.out.println("Admin=>ProjectTemplate");

	}

	private void ProjectTemplatecreate() throws InterruptedException {
		System.out.println("ProjectTemplate create started");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='button'])[12]")).click();
		Thread.sleep(5000);
		takescreenshot();
		driver.findElement(By.linkText("ELAN")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[9]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("TNPProjectTemplate");
		driver.findElement(By.cssSelector("textarea.gwt-TextArea")).click();
		Thread.sleep(2000);
		takescreenshot();
		driver.findElement(By.cssSelector("textarea.gwt-TextArea")).sendKeys("TNPProjectTemplate");
		driver.findElement(By.cssSelector("i.fa.fa-save")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[3]/div/div")).click();
		Thread.sleep(3000);
		takescreenshot();
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td/div/div/div/div[3]/div/table/tbody/tr[2]/td/table/tbody/tr[5]/td/table/tbody/tr[2]/td/div/div[2]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr/td[1]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("td > table > tbody > tr > td > table.viking-DisplayTable > tbody > tr > td > table.gwt-TabPanel > tbody > tr > td > table.gwt-TabBar > tbody > tr > td.gwt-TabBarItem-wrapper > div.gwt-TabBarItem > div.gwt-Label")).click();
		driver.findElement(By.xpath("//td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr/td/textarea")).sendKeys("ProjectTemplate updated");
		takescreenshot();
		driver.findElement(By.xpath("(//button[@type='button'])[20]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[4]/div/div")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//textarea[@class='gwt-TextArea']")).sendKeys("Job AID updated");
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td/div/div/div/div[3]/div/table/tbody/tr[2]/td/table/tbody/tr[5]/td/table/tbody/tr[2]/td/div/div[3]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr/td[1]/textarea")).sendKeys("TNPProjectTemplate");
		Thread.sleep(2000);
		takescreenshot();
		driver.findElement(By.cssSelector("i.fa.fa-save")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("i.fa.fa-refresh")).click();
		Thread.sleep(2000);
		takescreenshot();
		driver.findElement(By.cssSelector("i.fa.fa-close")).click();
		Thread.sleep(5000);

	}

	private void ProjectTemplateedit() throws InterruptedException 
	{
		 driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
		 driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("TNPProjectTemplate");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//input[@value='Search'])[2]")).click();
		 Thread.sleep(2000);
		 takescreenshot();
		 driver.findElement(By.linkText("TNPProjectTemplate")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//td[3]/div/div")).click();
		 Thread.sleep(3000);
		 takescreenshot();
		 
		 driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td/div/div/div/div[3]/div/table/tbody/tr[2]/td/table/tbody/tr[5]/td/table/tbody/tr[2]/td/div/div[2]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr/td[1]/button")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.cssSelector("td > table > tbody > tr > td > table.viking-DisplayTable > tbody > tr > td > table.gwt-TabPanel > tbody > tr > td > table.gwt-TabBar > tbody > tr > td.gwt-TabBarItem-wrapper > div.gwt-TabBarItem > div.gwt-Label")).click();
		 driver.findElement(By.xpath("//td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr/td/textarea")).sendKeys("ProjectTemplate updated2");
		 takescreenshot();
		 driver.findElement(By.xpath("(//button[@type='button'])[20]")).click();
		 
		 /*Thread.sleep(2000); 		 
		 driver.findElement(By.xpath("(//img[@onclick='new eXcell_ch(this.parentNode).changeState(true); (arguments[0]||event).cancelBubble=true; '])[7]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//button[@type='button'])[18]")).click(); 
		 Thread.sleep(3000);
		 takescreenshot();
		 driver.findElement(By.cssSelector("td > table > tbody > tr > td > table.viking-DisplayTable > tbody > tr > td > table.gwt-TabPanel > tbody > tr > td > table.gwt-TabBar > tbody > tr > td.gwt-TabBarItem-wrapper > div.gwt-TabBarItem > div.gwt-Label")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr/td/textarea")).click();
		 takescreenshot();
		 driver.findElement(By.xpath("(//button[@type='button'])[20]")).click();*/
		 
		 
		 /*Thread.sleep(3000);
		 driver.findElement(By.xpath("(//img[@onclick='new eXcell_ch(this.parentNode).changeState(true); (arguments[0]||event).cancelBubble=true; '])[7]")).click();
		 Thread.sleep(3000);
		 takescreenshot();
		 driver.findElement(By.xpath("(//button[@type='button'])[18]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//input[@type='text'])[14]")).sendKeys("1");
		 Thread.sleep(3000);	
		 takescreenshot();
		 driver.findElement(By.xpath("(//button[@type='button'])[20]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//img[@onclick='new eXcell_ch(this.parentNode).changeState(true); (arguments[0]||event).cancelBubble=true; '])[6]")).click(); 
		 Thread.sleep(3000);
		 takescreenshot();
		 driver.findElement(By.xpath("(//button[@type='button'])[19]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//input[@type='text'])[15]")).sendKeys("2");
		 takescreenshot();
		 driver.findElement(By.xpath("(//button[@type='button'])[20]")).click();
		 Thread.sleep(3000);*/
		 		 	
		 driver.findElement(By.cssSelector("i.fa.fa-save")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("i.fa.fa-refresh")).click();
		 Thread.sleep(2000);
		 takescreenshot();
		 driver.findElement(By.cssSelector("i.fa.fa-close")).click();
		 Thread.sleep(5000);
		 
		 

	}

	private void ProjectTemplatedelete() throws InterruptedException 
	{
		
		 driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
		 driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("TNPProjectTemplate");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//input[@value='Search'])[2]")).click();
		 Thread.sleep(2000);
		 takescreenshot();
		 driver.findElement(By.linkText("TNPProjectTemplate")).click(); 		 
		 Thread.sleep(6000);			
		 takescreenshot();		   
		 System.out.println("Selected the to deleting file");
		 Thread.sleep(3000);
		 takescreenshot();			
		 driver.findElement(By.cssSelector("i.fa.fa-trash")).click();
		 driver.findElement(By.cssSelector("table.viking-GetConfirmationPopup-buttonPanel > tbody > tr > td > button.gwt-Button")).click();
		 takescreenshot();
		 driver.findElement(By.cssSelector("i.fa.fa-close")).click();
		 Thread.sleep(5000);

	}

	@BeforeTest
	public void beforeTest() {

	}

	@AfterTest
	public void afterTest() throws InterruptedException 
	{
		 driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
		 driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("TNPProjectTemplate");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//input[@value='Search'])[2]")).click();
		 Thread.sleep(2000);
		 takescreenshot();

	}

	public static void takescreenshot() 
	{
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("ScreenShots\\ProjectTemplate" + i + ".png"));
			System.out.println("ProjectTemplate" + i + "taken");
			i++;
		} catch (Exception e) {

			System.out.println("Exception while taking screenshot " + e.getMessage());
		}
	}
}
