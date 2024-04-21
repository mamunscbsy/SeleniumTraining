/**
 * 
 */
package com.testleaf.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.testleaf.pages.CreateLeadPage;
import com.testleaf.pages.HomePage;
import com.testleaf.pages.LoginPage;
import com.testleaf.pages.MyHomePage;


/**
 * @author Mamun
 *This test case will verify the login functionality of TestLeaf Application.
 */
public class TestCaseExecution {
	
	@Test
	public void verifyValidLogin() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Create object of LoginPage and pass driver		
		LoginPage login = new LoginPage(driver);
		
		login.typeUsername();
		//login.typeUsername("DemoSalesManager"); //for parameterization
		login.typePassword();
		//login.typePassword("crmsfa"); //for parameterization
		login.clickLoginButton();
		
		//using consolidated methods
		/*LoginPagePara login = new LoginPagePara(driver);
		login.loginToTestLeaf("DemoSalesManager", "crmsfa");*/
		
		HomePage homepage = new HomePage(driver);
		//homepage.clickLogoutBtn();
		homepage.clickCRMSFA();
		
		//login.loginToTestLeaf("DemoCSR", "crmsfa");
		
		//For perform other actions don't click on logout button before click on CRMSFA
		//homepage.clickLogoutBtn();
		
		MyHomePage Myhomepage = new MyHomePage(driver);
		Myhomepage.clickCreateLeadLink();
		
		CreateLeadPage createLead = new CreateLeadPage(driver);
		createLead.typeComName();
		createLead.typeFirstNmae();
		createLead.typeLastName();
		createLead.chooseSource();
		createLead.chooseIndustry();
		createLead.clickCreateLeadBtn();
						
		driver.quit();
	}

}
