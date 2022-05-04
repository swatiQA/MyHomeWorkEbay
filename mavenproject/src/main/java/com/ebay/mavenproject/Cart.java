package com.ebay.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart {
	
	public String cartPage (WebDriver driver) {
		System.out.println("In Cart");
		String priceInCart = driver.findElement(By.xpath("//*[@class='item-price']")).getText();
		System.out.println(priceInCart);
		return priceInCart;
		
	}
	

}
