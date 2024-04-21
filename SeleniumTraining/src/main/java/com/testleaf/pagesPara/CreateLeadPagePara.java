package com.testleaf.pagesPara;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateLeadPagePara {
	
public WebDriver driver; 
	
	By CompanyName = By.id("createLeadForm_companyName");
	By FirstName = By.id("createLeadForm_firstName");
	By LastName = By.id("createLeadForm_lastName");
	By ClickCreateLeadBtn = By.xpath("//input[@value='Create Lead']");
	
	public CreateLeadPagePara (WebDriver driver) {
		this.driver = driver;
	}
	/*public void createLead(String cName, String fName, String lName) {
		driver.findElement(CompanyName).sendKeys(cName);
		driver.findElement(FirstName).sendKeys(fName);
		driver.findElement(LastName).sendKeys(lName);
		driver.findElement(ClickLoginBtn).click();
	}*/
	//Create methods of the all required actions of the page
	public void typeComName(String cName) {
		driver.findElement(CompanyName).sendKeys(cName);
	}
	
	public void typeFirstNmae(String fName){
		driver.findElement(FirstName).sendKeys(fName);
	}
	
	public void typeLastName(String lName) {
		driver.findElement(LastName).sendKeys(lName);
	}

	public void clickcreateleadBtn() {
		driver.findElement(ClickCreateLeadBtn).click();
	}
	
}
