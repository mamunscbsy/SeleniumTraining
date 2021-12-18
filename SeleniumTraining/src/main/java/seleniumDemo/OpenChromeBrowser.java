package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {
	
		public static void main(String[] args) {
			
			//launch chrome browser
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			
			// load url
			driver.get("http://leaftaps.com/opentaps");
			
			//Maximize window
			driver.manage().window().maximize();
			
			//Print Title of the page
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
			 		 			 
			 //close browser
			driver.close();		
			
		}
}