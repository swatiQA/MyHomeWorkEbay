package com.ebay.mavenproject;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class App 
{
	
	
	public HomePage invokeBrowser(WebDriver driver){
		
		
		driver.get("http://www.ebay.com");
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		return new HomePage();
		
		
		
	}
    
}

