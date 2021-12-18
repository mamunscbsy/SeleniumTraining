package AUI_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("https://jqueryui.com/droppable/");
				
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Switch to Frame
		driver.switchTo().frame(0);
		
		//select draggable and droppable elements and store in a variable
		//WebElement src = driver.findElementById("draggable");
		WebElement src = driver.findElementByXPath("//div[@id='draggable']");
		
		WebElement dest = driver.findElementById("droppable");
	
		//wait 3 sec
		Thread.sleep(3000);
		
		//Create object of Actions class and pass the driver 
		Actions action = new Actions(driver);
		
		//wait 3 sec		
		Thread.sleep(3000);
		
		//perform DragAndDrop action, pass the elements and use perform() method
		//action.dragAndDrop(src, dest).perform();
		action.dragAndDrop(src, dest).perform();

		
		//Switch back from frame
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		
		//click Selectable
		driver.findElementByLinkText("Selectable").click();
		
			
		Thread.sleep(4000);
		driver.close();
		
		
	}

}
