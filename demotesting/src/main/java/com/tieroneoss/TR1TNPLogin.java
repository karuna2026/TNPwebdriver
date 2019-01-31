package com.tieroneoss.tnp.inv.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TR1TNPLogin 
{
  
	  WebDriver driver;
	  
		By username=By.id("j_username");
		By password=By.name("j_password");
		By submitbutton=By.xpath("//input[@value='Login']");
		
		public  TR1TNPLogin(WebDriver driver)
		{
			this.driver=driver;
			
		}
		public void logintoTNP(String uid, String pwd)
		{
			driver.findElement(username).clear();
			driver.findElement(username).sendKeys(uid);
			driver.findElement(password).clear();
			driver.findElement(password).sendKeys(pwd);
			driver.findElement(submitbutton).click();
			
		}
		
		/*public void typUserName(String uid)
		{
			driver.findElement(username).clear();
			driver.findElement(username).sendKeys(uid);
		}
		public void typPassword(String pwd)
		{
			driver.findElement(password).clear();
			driver.findElement(password).sendKeys(pwd);
			
		}
		public void ClickLoginButton()
		{
			driver.findElement(submitbutton).click();
			
		}*/
		
		
		
  
}
