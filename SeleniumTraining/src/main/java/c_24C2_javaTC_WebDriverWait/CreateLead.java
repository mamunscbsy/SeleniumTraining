package c_24C2_javaTC_WebDriverWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			// WebDriverManager.firefoxdriver().setup();
		
			ChromeDriver driver = new ChromeDriver();
		
			// maximize
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
							
			// load URL
			driver.get("http://leaftaps.com/opentaps");

			// Enter Username - (Element level)
			driver.findElementById("username2").sendKeys("DemoSalesManager");

			// Enter Password - (Element level)
			driver.findElementById("password").sendKeys("crmsfa");

			// Click Login Button - (Element level)
			driver.findElementByClassName("decorativeSubmit").click();

			// click crm/sfa link
			driver.findElementByLinkText("CRM/SFA").click();

			//click leads
			driver.findElementByLinkText("Leads").click();
			

			//click create lead link
			driver.findElementByLinkText("Create Lead").click();

			//company name
			driver.findElementById("createLeadForm_companyName").sendKeys("TCS");

			// enter firstName
			
			try {
				driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Hema");
			} catch (NoSuchElementException e) {
				System.out.println("The element not found");
			}
			Thread.sleep(2000);
			// throw new Exception();

			// enter lastName
			driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("Mali");
			// driver.findElementById("createLeadForm_lastName").sendKeys("J");

			// Choose source
			WebElement src = driver.findElementById("createLeadForm_dataSourceId");
			Select dd = new Select(src);
			dd.selectByVisibleText("Website");
			
			// choose ownership
			WebElement ele = driver.findElementByName("ownershipEnumId");
			Select dd2 = new Select(ele);
			dd2.selectByVisibleText("Sole Proprietorship");
			
			// Click Create lead
			driver.findElementByXPath("//input[@name='submitButton']").click();

			//Verify title of the page
			String title = driver.getTitle();
			System.out.println(title);
			
					
			if(title.contains("View")) {
				System.out.println("Title matched");
			} else {
				System.out.println("Title not Matched");
			}
					
			//close browser
			driver.close();
		}


	}


