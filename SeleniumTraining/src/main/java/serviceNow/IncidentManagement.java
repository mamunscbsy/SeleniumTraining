package serviceNow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class IncidentManagement {

	@Test
	public void incidentManagement() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize
		driver.manage().window().maximize();
		
		// Launch Url
		driver.get("https://dev97164.service-now.com/");
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//driver.switchTo().frame("-");
		driver.switchTo().frame("gsft_main");
		
		//enter user Name
		driver.findElementByXPath("//input[@id='user_name']").sendKeys("admin");
		
		
		//enter Password
		driver.findElementByXPath("//input[@type='password']").sendKeys("Test@123");
		
		//click on login
		driver.findElementByXPath("//button[text()='Login']").click();
		
		//for switch back to main HTML page from frame
		//driver.switchTo().defaultContent();
		
		//Enter 'Incident' in filter navigator and press enter
		//driver.findElementByXPath("//input[@id='filter']").sendKeys("Incident",Keys.ENTER);
		driver.findElementByXPath("//input[@id='filter']").sendKeys("Incident",Keys.ENTER);
		Thread.sleep(2000);
		
			
		//Click on Create new option 
		driver.findElementByXPath("(//div[text()='Create New'])[1]").click();
		
		//driver.switchTo().frame("form-control");
		driver.switchTo().frame("gsft_main");
							
		driver.findElementByXPath("//textarea[@id='incident.description']").click();
		
		//and fill the mandatory fields(click search button)
		//driver.findElementByXPath("(//span[@class='input-group-btn'])[1]");
		
		
		//driver.findElementByXPath("(//span[@class='input-group-btn'])[1]").click();
		
		//enter caller
		//driver.findElementByXPath("//input[@id='incident.short_description']").sendKeys("Gopi");
	}
}