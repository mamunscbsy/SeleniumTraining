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
		
		//1. getWindowHandle()-return only current window reference
		//String FirstWindow = driver.getWindowHandle();
		String CurrentWinRef = driver.getWindowHandle();
		System.out.println("Current window reference = "  + CurrentWinRef);
				
		//Or Get current/first window reference
		//String CurrentWin = driver.getWindowHandle();
		//System.out.println(CurrentWin);
		
		//2. getWindowHandles()-returns all window reference
	Set<String> allwinRef = driver.getWindowHandles();
		
		System.out.println(allwinRef);
		
		// switching 1st window to 2nd window
	for (String eachWin : allwinRef) {
			System.out.println(eachWin);
			
			driver.switchTo().window(eachWin);
			
			System.out.println(driver.getTitle());
			
			//driver.close();
		}	
			
		// After switch to 2nd window click on "Try it" button
		
		//For click on "Try it" button, need to Switch a frame because "Try it" is design under a frame.

		driver.switchTo().frame("iframeResult");
	
		// Click on Try it button
		driver.findElementByXPath("//button[text()='Try it']").click();
			
		//switch back to primary window/First window (see above code of getWindowHandle() for FirstWindow)
		driver.switchTo().window(CurrentWinRef);
		
		//Get title of First window (after back to first window)
		System.out.println(driver.getTitle());
		
		//closing all the windows which open in this session/in this run
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
