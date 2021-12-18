package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UKFlooringSale {
	
	@Test
	public void flooringSale() throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
			
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.ukflooringsale.co.uk/");
		
		//Verify title of the page(after enter the app./navigate the app.)
		System.out.println(driver.getTitle());
		
		//Validate UK Flooring Sale logo displayed(after enter the app/navigate the app.)
		boolean Logotext = driver.findElementByXPath("//img[@alt='UK Flooring Sale']").isDisplayed();
		System.out.println(Logotext);
		
		Assert.assertTrue(Logotext,"Verify UK Flooring Sale logo is displayed");
		
		//click My Account
		driver.findElementByLinkText("My Account").click();
		
		driver.findElementById("email").sendKeys("chowdhurymohammad@hotmail.co.uk");
		
		driver.findElementById("pass").sendKeys("Welcome123");
		
		driver.findElementByXPath("//button[@title='Login']").click();
		
			//Validate LogOut button is displayed(after login)
				boolean LogOut = driver.findElementByLinkText("Log Out").isDisplayed();
				System.out.println(LogOut);
				
				Assert.assertTrue(Logotext,"Verify LogOut button is displayed");
		Thread.sleep(3000);
		
		
		driver.findElementByLinkText("My Wishlist").click();
		driver.findElementByXPath("//h3[text()='Shopping Bag']").click();
		driver.findElementByLinkText("Carpet Tiles").click();
		driver.findElementByXPath("(//span[text()='Add to Cart'])[1]").click();
		driver.findElementByXPath("//div[@class='summary_row  ']").click();
		driver.findElementByXPath("//button[@title='My Cart']").click();
				
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@class='input-text']").sendKeys("product");
		//View Product
		driver.findElementByXPath("(//button[@class='button'])[3]").click();
		//Grid View
		driver.findElementByXPath("(//strong[@class='grid'])[1]").click();
		//List View
		driver.findElementByLinkText("List").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='sort-by'])[2]").click();
		//Sort by Price
		WebElement ele = driver.findElementByXPath("(//select[@onchange='setLocation(this.value)'])[2]");
		Select dd = new Select(ele);
		dd.selectByVisibleText("Price");
		
		//Sort by Name
		WebElement elem = driver.findElementByXPath("(//select[@onchange='setLocation(this.value)'])[2]");
		Select dd1 = new Select(elem);
		dd1.selectByVisibleText("Name");
		
		
		//Click Ascending Order
		driver.findElementByXPath("(//div[@class='right'])[2]").click();
		
		//Click Descending order
		driver.findElementByXPath("(//div[@class='right'])[1]").click();
		
		WebElement ele1 = driver.findElementByXPath("(//select[@onchange='setLocation(this.value)'])[1]");
		Select dd3 = new Select(ele1);
		dd3.selectByVisibleText("30");
		
		WebElement ele2 = driver.findElementByXPath("(//select[@onchange='setLocation(this.value)'])[1]");
		Select dd4 = new Select(ele2);
		dd4.selectByVisibleText("60");
		
		WebElement ele3 = driver.findElementByXPath("(//select[@onchange='setLocation(this.value)'])[1]");
		Select dd5 = new Select(ele3);
		dd5.selectByVisibleText("100");
		
		WebElement ele4 = driver.findElementByXPath("(//select[@onchange='setLocation(this.value)'])[1]");
		Select dd6 = new Select(ele4);
		dd6.selectByVisibleText("All");
		
		driver.close();
		
			}
	}


