package exceptionHandling;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleExceptions {

	public static void main(String[] args)    {
		
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");

		// className obj = new className();
		ChromeDriver driver = new ChromeDriver(); // For Chrome

		driver.get("http://leaftaps.com/opentaps");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						
		try {
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			System.out.println("The element Username entered");
		
		}catch(Exception e) {
			System.err.println("The element Username not entered");
					
			//Thread.sleep(2000);
			
			//Create RunTime exception
			throw new RuntimeException();
		}

		finally { 
			System.out.println("The element found");
				}
	
		System.out.println("Test case is completed");
		
		// Enter Password
		driver.findElementById("password").sendKeys("crmsfa");

		// Click Login Button 
		try {
			driver.findElementByClassName("decorativeSubmit1").click();
			System.out.println("Click on login btn successfully");
		} catch (Exception e) {
			System.err.println("Not click on login btn");
		}
		driver.close();
	}
		// click crm.sfa link
		/*try {
		driver.findElementByLinkText("CRM/SFA").click();
		}
		catch (NoSuchElementException e ) {
			System.out.println("The element not found");
			
			Thread.sleep(2000);
			
			throw new RuntimeException();
		}
		finally { 
			System.out.println("The element found");
			}
		
		System.out.println("TestCase Completed");*/

	

}

