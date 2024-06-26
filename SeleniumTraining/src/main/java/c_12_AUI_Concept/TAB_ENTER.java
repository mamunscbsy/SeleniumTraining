package c_12_AUI_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TAB_ENTER {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // For Chrome

		driver.get("https://www.facebook.com/");
		//driver.get("https://www.amazon.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		
		//facebook.com- enter email as abc@yahoo.com
		driver.findElementByName("email").sendKeys("abc@yahoo.com");

		Actions action = new Actions(driver);
		//By using Actions class- enter password as mahbub using Tab key on facebook.com
		
		Thread.sleep(3000);
		//Hit Tab key from Keyboard-Tab action will perform
		action.sendKeys(Keys.TAB)
		
		//Enter the password in password field
		.sendKeys("Eva123")
		.build().perform();//perform action

		//You can use Enter key after Tab- Hit enter facebook.com
		action.sendKeys(Keys.ENTER).perform();
		
		//it will select 1st Forgot Password?
		action.sendKeys(Keys.TAB).perform();
		//it will select Log In button
		action.sendKeys(Keys.TAB).perform();
		//it will select last Forgot Password?
		action.sendKeys(Keys.TAB).perform();
		//For Amazon.com- we can use below code (Enter key)
		/*driver.findElementById("twotabsearchtextbox").sendKeys("iPhone");
		//Hit Enter key
		driver.findElementById("twotabsearchtextbox").sendKeys(Keys.ENTER);*/
	}

}
