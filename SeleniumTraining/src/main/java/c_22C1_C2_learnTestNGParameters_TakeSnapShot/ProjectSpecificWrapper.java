package c_22C1_C2_learnTestNGParameters_TakeSnapShot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class ProjectSpecificWrapper {
	
	public ChromeDriver driver;
	
	@Parameters ({"url","uname","pwd"}) 
	
	
	@BeforeMethod
	public void login(String url, String uname, String pwd) {  

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();

		//maximize
		driver.manage().window().maximize();

		//load URL
		//driver.get("http://leaftaps.com/opentaps");
		driver.get(url);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Enter Username - (Element level)
		//driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("username").sendKeys(uname);

		//Enter Password - (Element level)
		//driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementById("password").sendKeys(pwd);

		// Click Login Button - (Element level)
		driver.findElementByClassName("decorativeSubmit").click();

		// click crm.sfa link
		driver.findElementByLinkText("CRM/SFA").click();

	}

	@AfterMethod
	public void closeBrowser() { 
		driver.close();
	}

}
