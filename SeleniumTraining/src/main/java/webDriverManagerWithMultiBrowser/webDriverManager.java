package webDriverManagerWithMultiBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webDriverManager { //Name should be lower case, otherwise through an exception

	//public static void main(String[] args) throws InterruptedException {
	@Test
	public void test() throws InterruptedException {

		
		/*When you use latest version of WeDriverManager Dependency (Starting version 5.1.1) no need to write 
		 * "WebDriver driver = new ChromeDriver();" after WebDriverManager.chromedriver().create();
		 * Selenium introduce new function create(), just use create() with WebDriverManager.chromedriver().create(), 
		 * It will give you the instance of WebDriver and you can use directly WeDriver driver 
		 * with WebDriverManager.chromedriver().create();
		 * that is WebDriver driver = WebDriverManager.chromedriver().create();
		 */
		//WebDriverManager.chromedriver().create(); [Remove/comment out this line and use below line]
		//WebDriver driver =	WebDriverManager.chromedriver().create();
	
		WebDriver driver = WebDriverManager.chromedriver().create();
	
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//String title = driver.getTitle();
		//System.out.println(title);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//Enter 'Face book login' in Google search box
		driver.findElement(By.name("q")).sendKeys("facebook login");
		
		Thread.sleep(2000);
		
		driver.quit();

	}

	

}
