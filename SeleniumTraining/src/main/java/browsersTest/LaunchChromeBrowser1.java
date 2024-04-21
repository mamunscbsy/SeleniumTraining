package browsersTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser1 {

	public static void main(String[] args) throws InterruptedException {

		//Launch/open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		
		//Syntax of create of object of ChromeDriver class
		//ClassName object = new ClassName();
		
		//ChromeDriver driver = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();
		
		//Load URL/open application
		//driver.navigate().to("https://www.google.com/");
		
		driver.get("https://www.google.com/");
		
		//driver.get("http://leaftaps.com/opentaps");
		
		//Maximize window
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//Close browser
		driver.close();	
		
	}
	
	
}
