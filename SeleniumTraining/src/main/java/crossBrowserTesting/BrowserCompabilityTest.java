package crossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCompabilityTest {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		int iteration = 0;
		
		for (int i =1; i<=3; i++) {
			iteration = iteration +1;
						
			if(i==1) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\eclipse-workspace\\SeleniumTraining\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				System.out.println("Chrome Browser launch successfully");				
			}
			else if(i==2) {
				System.setProperty("webdriver.gecko.driver", "C:\\SeleniumSoft\\geckodriver-v0.28.0-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				System.out.println("Firefox Browser launch successfully");
			}
			else if(i==3) {
				System.setProperty("webdriver.edge.driver", "C:\\Users\\mamun\\eclipse-workspace\\SeleniumTraining\\drivers\\msedgedriver.exe");
				driver = new EdgeDriver();
				driver.manage().window().maximize();
				System.out.println("Edge Browser launch successfully");
			}
			
			//load URL
			driver.get("http://leaftaps.com/opentaps");

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			//Enter Username - (Element level)
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

			//Enter Password - (Element level)
			driver.findElement(By.id("password")).sendKeys("crmsfa");

			// Click Login Button - (Element level)
			driver.findElement(By.className("decorativeSubmit")).click();
				
			Thread.sleep(2000);
			String Url = driver.getCurrentUrl();
			
			//Verify after login Url is correct 
			if(Url.equals("http://leaftaps.com/opentaps/control/login")) {
				System.out.println("LeafTest login successful- passed");
			}else {
				System.out.println("LeafTest login unsuccessful- failed");
			}
			driver.close();
		}
	}
}
