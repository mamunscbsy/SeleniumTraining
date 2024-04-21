package c_12_AUI_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//step-1 locate webelement
		WebElement rightclick = driver.findElementByXPath("//span[text()='right click me']");
		
		//Step-2 Create object of actions class and pass driver
		Actions action = new Actions(driver);

		//Step-3 perform RightClick action -contextClick() 
		action.contextClick(rightclick).perform();
		

		Thread.sleep(3000);
		driver.close();



	}

}
