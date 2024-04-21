package com.testleaf.pagesPara;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Mamun
 *This class will store all the locator and methods of LoginPage of TestLeaf Application.
 */

public class LoginPagePara {
	
	//Create a reference variable of WebDriver
	WebDriver driver; 
	
	By username = By.id("username");
	By password = By.id("password");
	By loginButton = By.className("decorativeSubmit");
	
	public LoginPagePara (WebDriver driver) {
		this.driver = driver;
	}
	
	//Create methods of the all required actions of the page
	
	//For Parameterize, pass arguments in the Java methods
	/*public void typeUsername(String uName) {
		driver.findElement(username).sendKeys(uName);
	}
	
	public void typePassword(String pwd){
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}*/
	
	//Or another way we can do that, we can create one consolidated method, and write 
	//all steps inside this method, for example- public void loginToTestLeaf()
	
	public void loginToTestLeaf(String uName, String pwd) {
		driver.findElement(username).sendKeys(uName);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginButton).click();
	}
}
