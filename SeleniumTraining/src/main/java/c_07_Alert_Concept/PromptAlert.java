package c_07_Alert_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {

		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//Create object of ChromeDriver Class		
		WebDriver driver = new ChromeDriver();*/
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
			
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//System.out.println(driver.getTitle());
						
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Click on 'Click for JS Prompt'
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
				
		//By using Alert class
	//Alert PromptAlert = driver.switchTo().alert();
		Alert PromptAlert = driver.switchTo().alert();
		PromptAlert.getText();
		System.out.println(PromptAlert.getText());
		//wait 3 seconds		
		Thread.sleep(3000);
		PromptAlert.sendKeys("I am a Robot");
		
		
		//Explicitly wait
		Thread.sleep(3000);
		//accept alert
		PromptAlert.accept(); 
		
		//way-1- get result
		driver.findElement(By.id("result")).getText();
		System.out.println(driver.findElement(By.id("result")).getText());
		
		
		//Or way-2- get result
		/*String text = driver.findElement(By.id("result")).getText();
		 System.out.println(text);*/
		
		//Get current Url
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		//Get current title
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		driver.close();	
				
		/*driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(2000);
		alert.getText();
		//alert.sendKeys("I am Atiqul Huda");
		alert.sendKeys("I am Atia Sultana an Automation Engineer");
		alert.accept();
		//print the message
		System.out.println(driver.findElement(By.id("demo")).getText());*/
	
		
	}

}
