package c_05_LaunchBrowser_FindingElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenChromeBrowser {

	public static void main(String[] args) {

		//Launch Chrome browser

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		//Load Url
		driver.get("http://leaftaps.com/opentaps");

		//Maximize window
		driver.manage().window().maximize();

		//Print Title of the page
		driver.getTitle();
		System.out.println(driver.getTitle());

		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//Enter Username		
		driver.findElementById("username").sendKeys("DemoSalesManager");

		//Enter password
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");

		//Click login btn
		driver.findElementByClassName("decorativeSubmit").click();

		//Click logout button
		driver.findElementByClassName("decorativeSubmit").click();

		//Again click on login btn
		driver.findElementByClassName("decorativeSubmit").click();

		//Click CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();

		//Click Leads link		
		driver.findElementByLinkText("Leads").click();

		//Click Request Catalog
		driver.findElementByPartialLinkText("Request C").click();

		//Close browser
		driver.close();

	}
}