package miscellaneousConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DateAndTimePicker {
	@Test
	public void dateTimePicker() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//Locate the element by Xpath and store it in a variable
		WebElement dateBox = driver.findElement(By.xpath("//input[@name='bdaytime']"));
		//Pass the Date mm/dd/yyyy format
		dateBox.sendKeys("10182021");
		//use tab key for go to next field 
		dateBox.sendKeys(Keys.TAB);
		//Enter Time as hh:mm AM/PM format
		dateBox.sendKeys("1130AM");
		//Click on Submit button
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.close();
		Thread.sleep(3000);

	}

}
