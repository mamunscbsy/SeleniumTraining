package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver; 
	
	By logoutButton = By.className("decorativeSubmit");
	By CRMSFAlink = By.linkText("CRM/SFA");
	
	public HomePage (WebDriver driver) {
		this.driver = driver;
	}
	public void clickLogoutBtn() {
		driver.findElement(logoutButton).click();
	}
	
	public void clickCRMSFA(){
		driver.findElement(CRMSFAlink).click();
	}
}
