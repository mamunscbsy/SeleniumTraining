package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadPage {

	public WebDriver driver; 

	By CompanyName = By.id("createLeadForm_companyName");
	By FirstName = By.id("createLeadForm_firstName");
	By LastName = By.id("createLeadForm_lastName");
	By source = By.id("createLeadForm_dataSourceId");
	By industry = By.id("createLeadForm_industryEnumId");
	By ClickCreateLeadBtn = By.xpath("//input[@value='Create Lead']");

	public CreateLeadPage (WebDriver driver) {
		this.driver = driver;
	}

	//Create methods of the all required actions of the page
	public void typeComName() {
		driver.findElement(CompanyName).sendKeys("ABC");
	}

	public void typeFirstNmae(){
		driver.findElement(FirstName).sendKeys("Hema");
	}

	public void typeLastName() {
		driver.findElement(LastName).sendKeys("Mali");
	}

	public void chooseSource () {
		WebElement src = driver.findElement(source);
		Select dd = new Select(src);
		dd.selectByVisibleText("Website");
	}
	public void chooseIndustry () { 
		WebElement ind = driver.findElement(industry);
		Select dd = new Select(ind);
		dd.selectByVisibleText("Health Care");
	}
	public void clickCreateLeadBtn() {
		driver.findElement(ClickCreateLeadBtn).click();
	}
}
