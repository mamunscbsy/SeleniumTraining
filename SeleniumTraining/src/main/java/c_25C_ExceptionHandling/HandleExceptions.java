package c_25C_ExceptionHandling;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleExceptions {

	public static void main(String[] args) throws InterruptedException    {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		// className obj = new className();
		ChromeDriver driver = new ChromeDriver(); // For Chrome

		driver.get("http://leaftaps.com/opentaps");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		//enter username
		/*try {
		driver.findElement(By.id("username1")).sendKeys("DemoSalesManager");
		System.out.println("The Username entered successfully");
		
		}
		catch(Exception e) {
			System.err.println("The element Username not entered");
		}*/
		//Enter username
		try {
			driver.findElement(By.id("username1")).sendKeys("DemoSalesManager");
			System.out.println("The element Username entered");
		
		}
		catch(Exception e) {	
			System.err.println("The element Username not entered");
			
					
			Thread.sleep(2000);
			
			//Create RunTime Exception
			throw new RuntimeException();
		
			
		}
		finally { 			
			System.out.println("The element found");
				}
	
		System.out.println("Test case is completed");
		
		// Enter Password
		try {
			driver.findElementById("password").sendKeys("crmsfa");
			System.out.println("Password entered");
		}
		catch (Exception e) {
			System.err.println("Password not entered");
		}
				
		Thread.sleep(2000);
		
		// Click Login Button 
		try {
			driver.findElementByClassName("decorativeSubmit").click();
			System.out.println("Click on login btn successfully");
		} catch (Exception e) {
			System.err.println("Not click on login btn");
		}
	try {	
		driver.findElementByLinkText("CRM/SFA").click();
		System.out.println("Able to click on CRM/SFA link");
	
	}catch(Exception e) {
		System.err.println("Unable to click on CRM/SFA link");
	}	
		driver.close();
	}
		

}

