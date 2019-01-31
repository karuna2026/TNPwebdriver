package com.tieroneoss.tnp.inv.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TR1WebDriver 
{
	private static WebDriver driver=null;
	
	public TR1WebDriver()
	{
		
	}
	public WebDriver getDriverInstance()
	{
		if(driver==null)
		{
			driver = new ChromeDriver();
			return driver;
			
		}
		return driver;
	}
}
