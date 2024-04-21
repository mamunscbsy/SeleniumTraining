package browsersTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenChromeBrowser {
	
		public static void main(String[] args) {
			
			//launch Chrome browser
			
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			
			//Load url
			driver.get("http://leaftaps.com/opentaps");
			
			//Maximize window
			driver.manage().window().maximize();
			
			//Print Title of the page
			driver.getTitle();
			System.out.println(driver.getTitle());
			 
			 //Implicitly wait
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 
			 //enter username
		
			driver.findElementById("username").sendKeys("DemoSalesManager");
			 
			 //enter password
			driver.findElementByName("PASSWORD").sendKeys("crmsfa");
			
			 //click login btn
			 driver.findElementByClassName("decorativeSubmit").click();
			
			 //click CRM/SFA
			 driver.findElementByLinkText("CRM/SFA").click();
			 
			 //Click Create Lead link		
			 driver.findElementByLinkText("Create Lead").click();
			
			 //close browser
			 driver.close();
			
		}
}