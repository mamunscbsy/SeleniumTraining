package com.testleaf.testcasePara;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.testleaf.pages.CreateLeadPage;
import com.testleaf.pages.HomePage;
import com.testleaf.pages.LoginPage;
import com.testleaf.pages.MyHomePage;
import com.testleaf.pagesPara.HomePagePara;
import com.testleaf.pagesPara.LoginPagePara;

public class TCexecutionPara {

	@Test
	public void verifyLogout() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Create object of LoginPage
		
		LoginPagePara login = new LoginPagePara(driver);
		
		//For Parameterization
		login.loginToTestLeaf("DemoCSR", "crmsfa");
		/*login.typeUsername("DemoCSR");
		login.typePassword("crmsfa");
		login.clickLoginButton();*/
		//using consolidated methods
		//LoginPagePara login = new LoginPagePara(driver);
		//login.loginToTestLeaf("DemoSalesManager", "crmsfa");
		
		HomePagePara homepage = new HomePagePara(driver);
		homepage.clickCRMSFA();
		//login.loginToTestLeaf("DemoSalesManager", "crmsfa");
		//homepage.clickLogoutBtn();
		
		MyHomePage myHomePage = new MyHomePage (driver);
		myHomePage.clickCreateLeadLink();
		
		CreateLeadPage createLeadPage = new CreateLeadPage (driver);
		createLeadPage.typeComName();
		createLeadPage.typeFirstNmae();
		createLeadPage.typeLastName();
		createLeadPage.clickCreateLeadBtn();
		
		driver.quit();
	}
}
