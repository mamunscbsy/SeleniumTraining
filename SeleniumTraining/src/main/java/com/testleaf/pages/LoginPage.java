package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Mamun
 *This class will store/contains all the web element with locator and methods of LoginPage of TestLeaf Application.
 */

public class LoginPage {
	
	//Create a reference variable of WebDriver
	WebDriver driver; 
	
	By username = By.id("username");
	By password = By.id("password");
	By loginButton = By.className("decorativeSubmit");
	
	//Create constructor in the class name
	public LoginPage (WebDriver driver) {
		this.driver = driver;
	}
	
	//Create methods of the all required actions of the page
	public void typeUsername() {
		driver.findElement(username).sendKeys("DemoCSR");
	}
	
	public void typePassword(){
		driver.findElement(password).sendKeys("crmsfa");
	}
	
	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}

}
