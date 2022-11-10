package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;


public class OpenChromeBrowser {
	
		public static void main(String[] args) throws InterruptedException   {
			
			//launch Chrome browser
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\git\\repository\\SeleniumTraining\\drivers\\chromedriver.exe");
			
			//Object of ChromeDriver class 
			ChromeDriver driver = new ChromeDriver();
			
			//Explicitly wait
			Thread.sleep(3000);
			
			//Maximize window
			driver.manage().window().maximize();
			
			// load url
			driver.get("http://leaftaps.com/opentaps");
							
			//Print Title of the page
			driver.getTitle();
			System.out.println(driver.getTitle());
			
			 
			 //Implicitly wait
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			 //enter username
			driver.findElementById("username").sendKeys("DemoSalesManager");
			//driver.findElementById("username").sendKeys("DemoSalesManager");
			 
			//enter password
			 driver.findElementById("password").sendKeys("crmsfa");
			//driver.findElementByName("PASSWORD").sendKeys("crmsfa");
			 
			 //click login btn
			 driver.findElementByClassName("decorativeSubmit").click();
			// driver.findElementByClassName("decorativeSubmit").click();
			 
			 //click CRM/SFA
			 driver.findElementByLinkText("CRM/SFA").click();
			 //driver.findElementByLinkText("CRM/SFA").click();
			 
			 //Click Leads link
			 driver.findElementByLinkText("Leads").click();
			
			 Thread.sleep(3000); 			 
			 //close browser
			driver.close();		
			
		}
}