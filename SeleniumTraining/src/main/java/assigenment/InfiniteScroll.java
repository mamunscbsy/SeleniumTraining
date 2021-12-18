package assigenment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InfiniteScroll {


	WebDriver driver;

	@BeforeTest
	public void start(){
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
	}
	@Test
	public void infiniteScroll() {
		driver.findElement(By.linkText("Infinite Scroll")).click();

		JavascriptExecutor jse = (JavascriptExecutor)driver;

		long initialHeight = (long)(jse.executeScript("return document.body.scrollHeight"));

		while(true) {
			jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(2000);
			long currentlHeight = (long)(jse.executeScript("return document.body.scrollHeight"));
			if(initialHeight==currentlHeight) {
				break;
			}
			initialHeight == currentlHeight;
		}
		@AfterTest
		public void close()
		{
			driver.quit();
		}
	}


