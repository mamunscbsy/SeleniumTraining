package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyHomePage {

WebDriver driver; 
	
	By CreateLeadLink = By.linkText("Create Lead");

	public MyHomePage (WebDriver driver) {
		this.driver = driver;
	}
	public void clickCreateLeadLink() {
		driver.findElement(CreateLeadLink).click();
		}
}
