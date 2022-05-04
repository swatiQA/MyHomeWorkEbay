package com.ebay.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	public static Search NavigateToSearch(WebDriver driver, String product, String category) {
		
	
		driver.findElement(By.id("gh-ac")).sendKeys(product);;
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		Select selectCategory = new Select(dropdown);
		selectCategory.selectByVisibleText(category);
		driver.findElement(By.id("gh-btn")).click();
		
		return new Search();
	}
	
	
}
