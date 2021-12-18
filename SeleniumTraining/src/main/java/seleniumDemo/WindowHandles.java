package seleniumDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/jsref/met_win_open.asp");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Click on- Try it Yourself
		driver.findElementByPartialLinkText("Try it Yourself »").click();
		
		//String currentWindow = driver.getWindowHandle();

		//String currentWindow = driver.getWindowHandle();
		//System.out.println(currentWindow);
		
		//Get first window reference
		String FirstWindow = driver.getWindowHandle();
		System.out.println(FirstWindow);
		
		
		Set<String> allWin = driver.getWindowHandles();
		
		
		//System.out.println(allWin);
		
		for (String eachWin : allWin) {
			//System.out.println(eachWin);
			
			driver.switchTo().window(eachWin);
			
			System.out.println(driver.getTitle());
			
			//driver.close();
		}
		
		/*for (String eachWin : allWin) {
			//System.out.println(eachWin);
			
			driver.switchTo().window(eachWin);
			
			//System.out.println(driver.getTitle());
			driver.close();
		}*/
			
		// After switch to 2nd window click on "Try it" button
		
		//Switch to frame for click on "Try it", because Try it button is inside a frame

		driver.switchTo().frame("iframeResult");
	
		// Click on Try it button
		driver.findElementByXPath("//button[text()='Try it']").click();
		
	
		//switch back to primary window/First window
		driver.switchTo().window(FirstWindow);
		
		//Get title of First window (after back to first window)
		System.out.println(driver.getTitle());
		
		// closing all the windows which open in this session/in this run
		driver.quit(); 

		/*
		 * driver.get("https://www.irctc.co.in");
		 * 
		 * driver.manage().window().maximize();
		 * 
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * 
		 * driver.findElementByLinkText("AGENT LOGIN").click();
		 * driver.findElementByLinkText("Contact Us").click();
		 */

	}

}
