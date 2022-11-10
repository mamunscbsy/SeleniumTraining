package exceptionHandling;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandle01 {

	public static void main(String[] args) {

	
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

			WebDriver driver = new ChromeDriver(); 
			//ChromeDriver driver = new ChromeDriver(); 

			driver.get("http://leaftaps.com/opentaps");

			driver.manage().window().maximize();
			
							
			try {
				driver.findElement(By.id("username1")).sendKeys("DemoSalesManager");
				System.out.println("The element enter successfully");
			
			}catch(Exception e) {
		System.err.println("The element not enter successfully");
	
			}
			finally {
			
			System.out.println("Test case is completed");
			
			}
			
			driver.close();
	}

}
