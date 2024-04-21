package c_12_AUI_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // For Chrome
		
		driver.get("https://jqueryui.com/selectable/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//switch to frame
		driver.switchTo().frame(0);
		
		WebElement Item1 = driver.findElementByXPath("//li[text()='Item 1']");
		
		WebElement Item2 = driver.findElementByXPath("//li[text()='Item 2']");
		
		WebElement Item3 = driver.findElementByXPath("//li[text()='Item 3']");
		
		WebElement Item5 = driver.findElementByXPath("//li[text()='Item 5']");
		
		WebElement Item7 = driver.findElementByXPath("//li[text()='Item 7']");
		
		Actions action = new Actions(driver);
		
		Thread.sleep(3000);
		//It will start clicking/select Item1, Item3, Item5 and Item7 (Up to down)
		action.keyDown(Keys.CONTROL).click(Item1).click(Item3).click(Item5).click(Item7).release().build().perform();
		//action.keyDown(Keys.CONTROL).click(Item1).click(Item3).click(Item5).release().perform();
				
		Thread.sleep(4000);
		//It will start clicking/select Item7, Item5, Item3 and Item1 (Down to Up)
		action.keyUp(Keys.CONTROL).click(Item7).click(Item5).click(Item3).click(Item1).release().perform();
		
	}

}
