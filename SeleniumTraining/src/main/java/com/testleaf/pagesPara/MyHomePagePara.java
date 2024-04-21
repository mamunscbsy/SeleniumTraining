package com.testleaf.pagesPara;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyHomePagePara {

WebDriver driver; 
	
	By CreateLeadLink = By.linkText("Create Lead");

	public MyHomePagePara (WebDriver driver) {
		this.driver = driver;
	}
	public void CreateLeadLink() {
		driver.findElement(CreateLeadLink).click();
	}
}
