package browsersTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class FireFoxDriver {

	public static void main(String[] args) {
				
				//For Firefox Browser(We are using Selenium WebDriver and Firefox Browser and gecko driver)
				System.setProperty("webdriver.gecko.driver","C:\\SeleniumSoft\\geckodriver-v0.28.0-win64\\geckodriver.exe");
				
				//FirefoxDriver driver = new FirefoxDriver();
				
				WebDriver driver = new FirefoxDriver();
						
				//maximize the window
				driver.manage().window().maximize();
			
				//Load url		
				//driver.get("leaftaps.com/opentaps");
				driver.navigate().to("http://google.com");
						
				//get title of the page
				//System.out.println(driver.getTitle());
					String title = driver.getTitle();
					System.out.println(title);
					
					//Assertion
					Assert.assertEquals(title,"Google", "Asserting page Title");
					
					//isDisplayed();
					 boolean searchBox = driver.findElement(By.name("q")).isDisplayed();
					
					 //Assertion
					 Assert.assertTrue(searchBox, "SearchBox is displayed");
					
					 //isEnabled();
					 boolean gmail = driver.findElement(By.linkText("Gmail")).isEnabled();
					 if(gmail==true) {
						 System.out.println("The Gmail link is Enabled");
					 }else {
						 System.out.println("The Gmail link is not Enabled");
					 }
					 
					 //isSelected();-to do this validation we can use only-RadioButton or a a CheckBox
					 
					 
				//click About
				driver.findElement(By.linkText("About")).click();
						
				//click products
				//driver.findElementByXPath("//a[@title='Products']").click();
				
				//close browser
				
				driver.close();

			}

}
