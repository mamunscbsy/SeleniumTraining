package testngTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExceptionHandling {

	public static void main(String[] args) throws InterruptedException {


System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		// WebDriverManager.firefoxdriver().setup();
	
		//WebDriver driver = new ChromeDriver();
	
		ChromeDriver driver = new ChromeDriver();

		// maximize
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// load URL
		driver.get("http://leaftaps.com/opentaps");

		// Enter Username - (Element level)
		driver.findElementById("username").sendKeys("DemoSalesManager");

		// driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		// Enter Password - (Element level)
		driver.findElementById("password").sendKeys("crmsfa");

		// Click Login Button - (Element level)
		driver.findElementByClassName("decorativeSubmit").click();

		// click crm/sfa link
		driver.findElementByLinkText("CRM/SFA").click();

		// click leads
		driver.findElementByLinkText("Leads").click();
		

		// click create lead link

		driver.findElementByLinkText("Create Lead").click();

		// company name
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		
		// enter firstName
		
		try {
			driver.findElementByCssSelector("input#createLeadForm_firstName1").sendKeys("Hema");
			System.out.println("The Element is found");
			
		} catch (NoSuchElementException e) {
			System.out.println("The element not found");
			
			Thread.sleep(2000);
			
			throw new RuntimeException();
			
			//throw new RuntimeException();
		}finally 
		{
			System.out.println("The Element found");
		}
		

		// enter lastName
		driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("M");
		
		System.out.println("The Test case is completed");
		
		driver.close();
	}

}
