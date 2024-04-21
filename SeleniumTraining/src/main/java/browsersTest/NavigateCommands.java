package browsersTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) throws Exception {


		//For Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Load url/Navigate to Google
		driver.get("http://google.com"); //Navigate to Google(it is a simplify of navigate To)
		
		Thread.sleep(5000);
		
		driver.navigate().to("http://newtours.demoaut.com/"); //Same as navigate
		
		Thread.sleep(5000);
		
		driver.navigate().back(); //go back to the previous page > It is not wait for a page load
		
		Thread.sleep(4000);
		
		driver.navigate().forward(); //Go to the page we had came from > Should be used after back
		
		Thread.sleep(4000);
		
		driver.navigate().refresh(); //It will refresh the page
		
		//driver.close(); //Will close your current/active WebPage/page 
		
		driver.quit(); // It will close the .exe driver and it will close all browsers which opened by Selenium
		
			
		
	}

}
