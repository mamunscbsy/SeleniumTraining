package webDriverManagerWithMultiBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class MultiBrowser {
	
	//@Test
	//public void test1() throws InterruptedException {
		public static void main(String[] args) throws InterruptedException {
			
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
			
		//Execute Selenium script on IE browser
		//WebDriverManager.iedriver().setup();
		//WebDriver driver = new InternetExplorerDriver();
		
		//FireFox
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		
		//WebDriverManager.edgedriver().setup();
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();
	
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//Enter 'facebook login' in Google search box
		driver.findElement(By.name("q")).sendKeys("facebook login");
		
		Thread.sleep(2000);
		driver.findElements(By.id("mamun"));
		
		driver.quit();
		
	}
}
