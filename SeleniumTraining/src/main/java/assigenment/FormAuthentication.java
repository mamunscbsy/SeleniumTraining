package assigenment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormAuthentication {

	WebDriver driver;

	@BeforeMethod
	public void start()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
	}

	//Test case-1
	@Test(priority = 0)
	public void wrongPassword() throws InterruptedException{

		driver.findElement(By.linkText("Form Authentication")).click();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mamun");
		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();

		String errorMsg = driver.findElement(By.xpath("//div[@id='flash']")).getText();
		System.out.println(errorMsg);

		Assert.assertEquals(errorMsg, "Your password is invalid!");

		Thread.sleep(1000);     
	}
	@Test(priority = 1)
	public void incorrectUsername() throws InterruptedException{

		//click on form authentication
		driver.findElement(By.linkText("Form Authentication")).click();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Ehram");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();

		String errorMsg = driver.findElement(By.xpath("//div[@id='flash']")).getText();
		System.out.println(errorMsg);

		Assert.assertEquals(errorMsg, "Your username is invalid!");
		Thread.sleep(1000); 
	}
	@Test(priority = 2)
	public void correctCredentials() throws InterruptedException{

		driver.findElement(By.linkText("Form Authentication")).click();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
		driver.findElement(By.xpath("//i[text()=' Logout']")).click();
		Thread.sleep(1000); 
	}

	//Test case- 2
	@Test (priority = 3)
	public void infiniteScroll() throws InterruptedException
	{
		driver.findElement(By.linkText("Infinite Scroll")).click();


		JavascriptExecutor jse = (JavascriptExecutor)driver;
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

	//Test case -3
	@Test(priority = 4)
	public void pressTab() throws InterruptedException{

		driver.findElement(By.linkText("Key Presses")).click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).build().perform();
		String tab = driver.findElement(By.id("result")).getText();
		System.out.println(tab);
		Assert.assertEquals(tab, "You entered: TAB");
	}
	@Test(priority = 5)
	public void pressEnter() throws InterruptedException{

		driver.findElement(By.linkText("Key Presses")).click();
		Actions action = new Actions(driver);
		Thread.sleep(1000); 
		action.sendKeys(Keys.ENTER).build().perform();
		String enter = driver.findElement(By.id("result")).getText();
		System.out.println(enter);
		Assert.assertEquals(enter, "You entered: ENTER");

	}

	@Test(priority = 6)
	public void pressEscape() throws InterruptedException{

		driver.findElement(By.linkText("Key Presses")).click();
		Actions action = new Actions(driver);
		Thread.sleep(1000); 
		action.sendKeys(Keys.ESCAPE).build().perform();
		String esc = driver.findElement(By.id("result")).getText();
		System.out.println(esc);
		Assert.assertEquals(esc, "You entered: ESCAPE");

	}
	@Test(priority = 7)
	public void pressDown() throws InterruptedException{

		driver.findElement(By.linkText("Key Presses")).click();
		Actions action = new Actions(driver);
		Thread.sleep(1000); 
		action.sendKeys(Keys.DOWN).build().perform();
		String down = driver.findElement(By.id("result")).getText();
		System.out.println(down);
		Assert.assertEquals(down, "You entered: DOWN");

	}
	@AfterMethod
	public void close()
	{
		driver.quit();
	}

}
