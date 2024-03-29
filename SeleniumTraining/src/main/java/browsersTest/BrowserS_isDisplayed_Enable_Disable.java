package browsersTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class BrowserS_isDisplayed_Enable_Disable {

	public static void main(String[] args) {

		//Pre-condition:- Download and Install FireFox Browser and Download GeckoDriver and add to your project, Drivers folder
		
				//For Chrome Browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\eclipse-workspace\\SeleniumTraining\\drivers\\chromedriver.exe");
				
				ChromeDriver driver = new ChromeDriver(); 
				
				//For Internet Explorer Browser
				//System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");

				//For Firefox Browser
				//System.setProperty("webdriver.gecko.driver","C:\\SeleniumSoft\\geckodriver-v0.28.0-win64\\geckodriver.exe");
				
				//FirefoxDriver driver = new FirefoxDriver();
				//WebDriver driver = new FirefoxDriver();
						
				//maximize the window
				driver.manage().window().maximize();
				Dimension size = driver.manage().window().getSize();
				System.out.println(size);
			
				//Load url		
				//driver.get("http://google.com");
				driver.navigate().to("http://google.com"); //Navigate to Google
						
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


