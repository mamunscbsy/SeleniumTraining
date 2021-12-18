package assigenment;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class InfiniteScrolling {



	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");

		driver.findElement(By.linkText("Infinite Scroll")).click();

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		//jse.executeScript("window.scrollBy(0,200)"); 

		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-28898)");
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-28898)");

		String ele = driver.findElement(By.xpath("//h3[text()='Infinite Scroll']")).getText();

		System.out.println(ele);
		Assert.assertEquals(ele, "Infinite Scroll");


	}

}
