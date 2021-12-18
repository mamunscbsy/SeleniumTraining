package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {

		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//load URL
		driver.get("http://leaftaps.com/opentaps");

		//maximize browser window
		driver.manage().window().maximize();

		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Print current title
		System.out.println(driver.getTitle());

		//Enter Username 
		driver.findElementById("username").sendKeys("DemoSalesManager");

		//Enter Password - (Element level)
		driver.findElementById("password").sendKeys("crmsfa");

		// Click Login Button 
		driver.findElementByClassName("decorativeSubmit").click();

		// click crm.sfa link
		driver.findElementByLinkText("CRM/SFA").click();

		//click create lead link
		driver.findElementByLinkText("Create Lead").click();

		//Select class for Dropdown (how to handle with dropdown)

		// 1. identify the dropdown element and pass to select class
		WebElement Source = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(Source);
		//dd.selectByVisibleText("Employee");
		//dd.selectByValue("LEAD_DIRECTMAIL");
		dd.selectByIndex(5);

		//WebElement Source = driver.findElementById("createLeadForm_dataSourceId");
		//Select dd = new Select(Source);
		//dd.selectByVisibleText("Employee"); //using-way1
		//dd.selectByValue("LEAD_CONFERENCE");//using-way2
		//dd.selectByIndex(3); //using-way3

		WebElement mkt_cam = driver.findElementByName("marketingCampaignId");
		Select dd1 = new Select(mkt_cam);
		dd1.selectByVisibleText("Demo Marketing Campaign");
		//dd1.selectByValue("DEMO_MKTG_CAMP");
		//dd1.selectByIndex(5);


		// 2. select specific value from that select dropdown element

		// choosing value from dropdown - 3 options

		// dd.selectByVisibletext("Distribution");		// First Way 
		// dd.selectByValue("IND_DISTRIBUTION");		// 2nd Way 
		// dd.selectByIndex(4);							// 3rd Way 

		//close Browser
		//driver.close();

	}


}
