package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\eclipse-workspace\\SeleniumTraining\\drivers\\chromedriver.exe");
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

		// company name
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");

		// enter firstName						
		driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Hema");

		// enter lastName
		driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("Ma");
		// driver.findElementById("createLeadForm_lastName").sendKeys("J");

		//select source-(DropDown)
		
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		
		Select dd = new Select(src);
		
		dd.selectByVisibleText("Partner");
		
		//Choose Marketing Campaign
		
		WebElement mktCam = driver.findElementById("createLeadForm_marketingCampaignId");
		
		Select dd1 = new Select(mktCam);
		dd1.selectByVisibleText("Car and Driver");
		//dd1.selectByValue("CATRQ_CAMPAIGNS");
		
		//Choose Industry
		WebElement ind = driver.findElementById("createLeadForm_industryEnumId");
		
		Select dd2 = new Select (ind);
		dd2.selectByIndex(2); 
		
		
		
	//WebElement src =	driver.findElementById("createLeadForm_dataSourceId");
		
		//Select Source dropdown and store it in src variable
		//WebElement src = driver.findElementById("createLeadForm_dataSourceId");
	
		//create object of Select class and pass the src variable into it.
		//Select dd = new Select(src);
		
		
		//dd.selectByVisibleText("Employee"); //way-1
		//dd.selectByValue("LEAD_PARTNER"); //way-2
	/*	dd.selectByIndex(11); //way-3
		
		//Select Industry
		WebElement Ind = driver.findElementById("createLeadForm_industryEnumId");
		Select  dd1 = new Select(Ind);
		dd1.selectByVisibleText("Finance");
		
		
		//Select Marketing
		WebElement mkt = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd2 = new Select(mkt);
		dd2.selectByIndex(2); //way-3p
		
		driver.close();
		
		/*WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(src);
		dd.selectByVisibleText("Partner");*/
		
		//Select MKT
		/*WebElement mktcam = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd1 = new Select(mktcam);
		dd1.selectByValue("CATRQ_CARNDRIVER");
		
		//Select INd
		WebElement ind = driver.findElementById("createLeadForm_industryEnumId");
		Select dd2 = new Select(ind);
		dd2.selectByIndex(7);
		
		// select ownership
		WebElement ownship = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dd3 = new Select(ownship);
		dd3.selectByVisibleText("Corporation");
		
		Thread.sleep(4000);
		driver.close();
		
				
		
		/*Thread.sleep(2000);
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(source);
		dd.selectByVisibleText("Word of Mouth");

		//selct mktCam
		WebElement mktcam = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd1 = new Select(mktcam);
		dd1.selectByValue("DEMO_MKTG_CAMP");

		//choose Industry
		WebElement ind = driver.findElementByXPath("//select[@id='createLeadForm_industryEnumId']");
		Select dd2 = new Select(ind);
		dd2.selectByIndex(7);

		//choose Ownership
		WebElement ownership =	driver.findElementByXPath("//select[@name='ownershipEnumId']");
		Select dd3 = new Select (ownership);
		dd3.selectByValue("OWN_LLC_LLP");


		//Choose Source
				WebElement source = driver.findElementById("createLeadForm_dataSourceId");
				Select dd = new Select(source);
				dd.selectByVisibleText("Conference");  //way1

				//choose Marketing Campaign
				WebElement mkt_Cam = driver.findElementById("createLeadForm_marketingCampaignId");
				Select dd1 = new Select(mkt_Cam);
				dd1.selectByValue("CATRQ_AUTOMOBILE");

				//choose Industry
				WebElement ind = driver.findElementById("createLeadForm_industryEnumId");
				Select dd2 = new Select(ind);
				dd2.selectByIndex(2);*/		
	}

}
