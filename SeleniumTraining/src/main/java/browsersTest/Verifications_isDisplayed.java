package browsersTest;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Verifications_isDisplayed {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch Chrome browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//ChromeDriver is a class
		ChromeDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		//Load URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Get page title
		//driver.getTitle();
		System.out.println(driver.getTitle());
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Enter UserName
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//Enter password
		driver.findElementById("password").sendKeys("crmsfa");
		
		Thread.sleep(2000);
		//Click login
		driver.findElementByClassName("decorativeSubmit").click();
		//driver.findElementByLinkText("Create Lead").click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//Logout button is displayed or not
		boolean LogoutBtn = driver.findElementByClassName("decorativeSubmit").isDisplayed();
		Assert.assertTrue(LogoutBtn, "logout button is didplayed");
		
		//click logout
		//driver.findElementByClassName("decorativeSubmit").click();
		driver.findElement(By.className("decorativeSubmit")).click();
		//Explicit wait
		Thread.sleep(3000);
						
		//close browser
		driver.close();
		
	}

}
