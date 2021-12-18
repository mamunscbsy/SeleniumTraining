package handleCookies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ClearBrowserCacheOrData {

	public static void main(String[] args) {
		
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\eclipse-workspace\\SeleniumTraining\\drivers\\chromedriver.exe");
	
	//ChromeDriver is a class
	ChromeDriver driver = new ChromeDriver();
	//WebDriver driver = new ChromeDriver();
	//Load URL
	driver.get("chrome://settings/clearBrowserData");
	
	//Get page title
	//driver.getTitle();
	System.out.println(driver.getTitle());
	
	//Maximize window
	driver.manage().window().maximize();
	
	//delete cookies
	driver.manage().deleteAllCookies();
	//Implicit wait
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	//Click on Clear Data (Make sure- it will clear your all browser data)
	
	}

}
