package com.ebay.mavenproject;

import java.time.Clock;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search {
	
	public String getNthProduct(int itemNumber,WebDriver driver){
	String productXpathName = String.format("//*[@id=\"srp-river-results\"]/ul/li[%d]", itemNumber);
	
String nthProduct = driver.findElement(By.xpath(productXpathName)).getText();
	
	System.out.println("Nth Product :: "+ nthProduct);
	return nthProduct;
}
	
	public static void SearchResultPage(WebDriver driver) {
	
		String productXpath = String.format("//*[@id=\"srp-river-results\"]/ul/li[%d]/div/div[1]/div/a", 1);
		
		driver.findElement(By.xpath(productXpath)).click();

	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
public static String AddtoCart(WebDriver driver) throws InterruptedException {
	
	
	ArrayList<String> newTab= new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(newTab.get(1));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String price=driver.findElement(By.xpath("//*[@id=\"prcIsum\"]")).getText();
	System.out.println("price Of Product is " +price);
	driver.findElement(By.id("isCartBtn_btn")).click();

	Thread.sleep(3000);
		
		return price;
	}
}
