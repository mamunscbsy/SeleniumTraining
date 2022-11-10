package handleCookies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ClickonAcookies {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\git\\repository\\SeleniumTraining\\drivers\\chromedriver.exe");
		
		//ChromeDriver is a class
		ChromeDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		//Load URL
		driver.get("https://www.browserstack.com/guide/how-to-handle-cookies-in-selenium");
		
		//Get page title
		//driver.getTitle();
		System.out.println(driver.getTitle());
		
		//Maximize window
		driver.manage().window().maximize();
		
		//delete cookies
		driver.manage().deleteAllCookies();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		//click on a cookie
		//driver.findElementByXPath("//button[@id='accept-cookie-notification']").click();
		
		//driver.close();
	}

}
