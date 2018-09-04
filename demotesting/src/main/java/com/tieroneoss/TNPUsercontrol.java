package com.tieroneoss;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class TNPUsercontrol 
{
	// System.setProperty("webdriver.chrome.driver","D:\\EW\\JARs_Browser
	// driver\\chromedriver_win32\\chromedriver.exe");
	private static int i=0;

	private static WebDriver driver;
	

	@Test
	public void TNPSecurity() throws InterruptedException, IOException 
	{
		// driver.manage().window().maximize();

		tnplogin();
		userscreen();
		usercreate();
		usercopy();
		usersearch();
		useredit();
		userdelete();

	}

	private static void takescreenshot()
	{
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;

			File source = ts.getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(source, new File("E:\\Automation NETPortal\\screenshots\\TNPUSER" + i + ".png"));

			System.out.println("Screenshot" + i + "taken");
			i++;
		} catch (Exception e) {

			System.out.println("Exception while taking screenshot " + e.getMessage());
		}

	}

	@BeforeTest
	public void beforeTest()
	{
		// driver = new HtmlUnitDriver();
		//driver = new ChromeDriver();
		  ChromeOptions options = new ChromeOptions();  
          options.addArguments("test-type");
          options.addArguments("--disable-extensions");


          driver = new ChromeDriver(options);
	}

	private void usercopy() throws InterruptedException {
		Thread.sleep(7000);
		System.out.println("User copy operation started");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("karunaselenium");

		Thread.sleep(4000);
		System.out.println("User=>Search=>Copy");

		driver.findElement(By.id("gwt-debug-Button-Search")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id='grid_9']/div[2]/table/tbody/tr[2]/td[2]/img")).click();
		Thread.sleep(7000);
		driver.findElement(By.id("gwt-debug-ButtonMenu-user.copy")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("karunaselenium_copy");

		driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("karunaselenium2_copy");
		driver.findElement(By.xpath("(//input[@type='text'])[10]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("copy");
		driver.findElement(By.xpath("(//input[@type='text'])[11]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys("sele212@t1.com");
		driver.findElement(By.cssSelector("textarea.gwt-TextArea")).clear();
		driver.findElement(By.cssSelector("textarea.gwt-TextArea"))
				.sendKeys("user created for automation testing copy updated");
		driver.findElement(By.cssSelector("i.fa.fa-save")).click();
		Thread.sleep(3000);
		WebElement enableuser = driver
				.findElement(By.xpath("(//table[@id='gwt-debug-Field-systemUser.enabled']/tbody/tr/td/select)[2]"));
		Select enable = new Select(enableuser);
		enable.selectByVisibleText("Yes");

		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.gwt-PasswordTextBox")).clear();
		driver.findElement(By.cssSelector("input.gwt-PasswordTextBox")).sendKeys("selenium1");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("selenium1");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("i.fa.fa-save")).click();
		Thread.sleep(3000);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("i.fa.fa-refresh")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("(//button[@type='button'])[20]")).click();
		// takescreenshot();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("i.fa.fa-close")).click();
		Thread.sleep(3000);

	}

	public void tnplogin() throws InterruptedException {
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("http://192.168.221.228:8180/tnp/login/login.jsp");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
		Thread.sleep(5000);
		System.out.println("The TNP title is:" + driver.getTitle());
		Thread.sleep(10000);
		//driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin");
		//driver.findElement(By.name("j_password")).clear();
		driver.findElement(By.name("j_password")).sendKeys("admin1001");
		Thread.sleep(3000);
		takescreenshot();
		driver.findElement(By.cssSelector("input.gwt-Button")).click();
		Thread.sleep(5000);
		System.out.println("TNP logged in");
		Thread.sleep(5000);
		takescreenshot();
		// userscreen();

	}

	public void userscreen() throws InterruptedException 
	{
		// Thread.sleep(7000);
		System.out.println("To click admin");
		Thread.sleep(7000);

		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gwt-debug-MenuItem-admin")));

		driver.findElement(By.id("gwt-debug-MenuItem-admin")).click();
		Thread.sleep(2000);
		takescreenshot();
		System.out.println("Admin Clicked");
		driver.findElement(By.id("gwt-debug-MenuItem-security")).click();
		Thread.sleep(2000);
		takescreenshot();
		System.out.println("Security");
		driver.findElement(By.id("gwt-debug-MenuItem-userconfig")).click();
		// takescreenshot();
		Thread.sleep(4000);
		takescreenshot();
		System.out.println("Admin=>Security=>Users screen");
	}

	private void usercreate() throws InterruptedException
	{
		System.out.println("User create started");
		Thread.sleep(3000);

		driver.findElement(By.id("gwt-debug-ButtonMenu-user.add")).click();
		takescreenshot();
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("karunaselenium");

		driver.findElement(By.xpath("(//input[@type='text'])[9]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("karunaselenium");

		driver.findElement(By.xpath("(//input[@type='text'])[10]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("Test1");
		driver.findElement(By.xpath("(//input[@type='text'])[11]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys("sele21@t1.com");
		takescreenshot();
		driver.findElement(By.cssSelector("textarea.gwt-TextArea")).clear();
		driver.findElement(By.cssSelector("textarea.gwt-TextArea")).sendKeys("user created for automation testing");

		WebElement enableuser = driver
				.findElement(By.xpath("(//table[@id='gwt-debug-Field-systemUser.enabled']/tbody/tr/td/select)[2]"));
		Select enable = new Select(enableuser);
		enable.selectByVisibleText("Yes");
		takescreenshot();
		Thread.sleep(3000);

		new Select(driver.findElement(
				By.xpath("(//table[@id='gwt-debug-Field-systemUser.ldapNameEnumeration']/tbody/tr/td/select)[2]")))
						.selectByVisibleText("default");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.gwt-PasswordTextBox")).clear();
		driver.findElement(By.cssSelector("input.gwt-PasswordTextBox")).sendKeys("selenium1");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("selenium1");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("i.fa.fa-save")).click();
		takescreenshot();
		Thread.sleep(3000);
		driver.findElement(By.id("gwt-debug-Button-user.addUserGroups")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='gwt-debug-Button-Search'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("NETPortal Administrators")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("i.fa.fa-save")).click();
		takescreenshot();
		Thread.sleep(3000);
		System.out.println("User created Successfully");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("i.fa.fa-save")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("i.fa.fa-refresh")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("i.fa.fa-close")).click();
		Thread.sleep(5000);
		// driver.findElement(By.cssSelector("i.fa.fa-chevron-down")).click();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath(".//*[@id='gwt-debug-Field-systemUser.externalId']/tbody/tr/td[1]/table/tbody/tr/td/input"))
				.clear();
		driver.findElement(
				By.xpath(".//*[@id='gwt-debug-Field-systemUser.externalId']/tbody/tr/td[1]/table/tbody/tr/td/input"))
				.sendKeys("karunaselenium");
		driver.findElement(By.id("gwt-debug-Button-Search")).click();
		Thread.sleep(5000);

		if (driver.getPageSource().contains("karunaselenium")) 
		{
			System.out.println("Text is present--karuna!");
			takescreenshot();
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("alert('Text is present--karuna!');");
		} 
		else 
		{
			System.out.println("alert(Text is absent)--karuna!");
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			takescreenshot();
			js1.executeScript("alert('Text is not present--karuna');");

		}
		Thread.sleep(5000);

		driver.switchTo().alert().accept();

	}

	public void usersearch() throws InterruptedException {

		try {
			Thread.sleep(7000);
			driver.findElement(By
					.xpath(".//*[@id='gwt-debug-Field-systemUser.externalId']/tbody/tr/td[1]/table/tbody/tr/td/input"))
					.clear();
			driver.findElement(By
					.xpath(".//*[@id='gwt-debug-Field-systemUser.externalId']/tbody/tr/td[1]/table/tbody/tr/td/input"))
					.sendKeys("karunaselenium");
			driver.findElement(By.id("gwt-debug-Button-Search")).click();

			if (driver.getPageSource().contains("karunaselenium")) {
				System.out.println("Text is present");
				/*
				 * JavascriptExecutor js =(JavascriptExecutor)driver;
				 * js.executeScript("Text is present");
				 * driver.switchTo().alert().accept();
				 */

			} else {
				System.out.println("Text is absent");
				/*
				 * JavascriptExecutor js =(JavascriptExecutor)driver;
				 * js.executeScript("Text is absent");
				 */
			}
			Thread.sleep(4000);
			System.out.println("Users=>Search");
			System.out.println("User selected");
			// String tname="karunaselenium";

			driver.findElement(By.linkText("karunaselenium")).click();

			System.out.println("Open button clicked");
			Thread.sleep(2000);

		} catch (Exception us) {
			System.out.println("Exception while taking screenshot " + us.getMessage());
		} /*
			 * finally { usercreate(); }
			 */

	}

	public void useredit() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("textarea.gwt-TextArea")));

		Thread.sleep(4000);
		driver.findElement(By.cssSelector("textarea.gwt-TextArea")).sendKeys("      user details modified");
		System.out.println("   Remarks updated");
		driver.findElement(By.cssSelector("i.fa.fa-save")).click();
		takescreenshot();
		System.out.println("Details updated for edit ");

		Thread.sleep(4000);
		driver.findElement(By.cssSelector("i.fa.fa-close")).click();
		Thread.sleep(5000);
		takescreenshot();
		System.out.println("User edit Details closed");
		System.out.println("Closed the record and return to user list grid");

	}

	public void userdelete() throws InterruptedException {
		// userscreen();
		Thread.sleep(6000);

		driver.findElement(
				By.xpath(".//*[@id='gwt-debug-Field-systemUser.externalId']/tbody/tr/td[1]/table/tbody/tr/td/input"))
				.clear();
		driver.findElement(
				By.xpath(".//*[@id='gwt-debug-Field-systemUser.externalId']/tbody/tr/td[1]/table/tbody/tr/td/input"))
				.sendKeys("karunaselenium");
		driver.findElement(By.id("gwt-debug-Button-Search")).click();
		Thread.sleep(5000);
		takescreenshot();
		System.out.println("Selected the to deleting file");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='grid_9']/div[2]/table/tbody/tr[2]/td[2]/img")).click();

		driver.findElement(By.id("gwt-debug-ButtonMenu-user.deleteFromSelector")).click();

		// driver.findElement(By.cssSelector("i.fa.fa-trash")).click();
		driver.findElement(
				By.cssSelector("table.viking-GetConfirmationPopup-buttonPanel > tbody > tr > td > button.gwt-Button"))
				.click();
		takescreenshot();
		System.out.println("Test script executed successfully.");

	}

	@AfterTest
	public void afterTest() {
		// driver.quit();

	}

}
