package crossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTest {
	
	//static WebDriver driver = null;
	//or
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		String browserName = "MsEdge";

		if(browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\eclipse-workspace\\SeleniumTraining\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chrome Browser launch successfully");
		}else if(browserName.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumSoft\\geckodriver-v0.28.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Firefox Browser launch successfully");
		}else if(browserName.equals("MsEdge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\mamun\\eclipse-workspace\\SeleniumTraining\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			System.out.println("Microsoft Edge Browser launch successfully");
		}else if(browserName.equals("Safari")) {
			driver = new SafariDriver();
		}else {
			System.out.println("Browser not found");

		}
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println("Page Title : "+ title);
		
		Thread.sleep(3000);
		driver.close();

	}


}


