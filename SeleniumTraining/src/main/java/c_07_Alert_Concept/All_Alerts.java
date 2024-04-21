package c_07_Alert_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Alerts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		// maximize
		driver.manage().window().maximize();

		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// load URL
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		//Click on 'Click for JS Alert'
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		//1. Simple Alert
		//switch control to Alert from HTML page and get the Alert text & store it in a variable
		String simpleAlert = driver.switchTo().alert().getText();
		System.out.println(simpleAlert);

		//wait 3 seconds 
		Thread.sleep(3000);

		//Click on ok button [to accept the alert]
		driver.switchTo().alert().accept();

		//Click on 'Click for JS Confirm'
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		//2. Confirmation Alert
		//switch control to Alert from HTML page and get the Alert text & store it in a variable
		String confirmAlert = driver.switchTo().alert().getText();
		System.out.println(confirmAlert);

		//wait 3 seconds 
		Thread.sleep(3000);

		//Click on Cancel button
		driver.switchTo().alert().dismiss();

		//Click on 'Click for JS Prompt'
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		//3. Prompt Alert
		//switch control to Alert from HTML page and get the Alert text & store it in a variable
		/*String promptAlert = driver.switchTo().alert().getText();
		System.out.println(promptAlert);*/

		//By using Alert class
		//Alert PromptAlert = driver.switchTo().alert();
		Alert PromptAlert = driver.switchTo().alert();
		PromptAlert.getText();
		System.out.println(PromptAlert.getText());

		//wait 2 seconds		
		Thread.sleep(2000);
		PromptAlert.sendKeys("I am a Robot");

		//wait 1 seconds 
		Thread.sleep(1000);

		//Click on Cancel button
		driver.switchTo().alert().accept();

		//way-1- get result
		driver.findElement(By.id("result")).getText();
		System.out.println(driver.findElement(By.id("result")).getText());
		
		//way-2- get result
		/*String text = driver.findElement(By.id("result")).getText();
		 System.out.println(text);*/
		
		//Get current Url
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		//Get current title
		driver.getTitle();
		System.out.println(driver.getTitle());

		//Close the browser
		driver.close();
	}

}
