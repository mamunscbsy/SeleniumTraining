package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsDefinition {

	ChromeDriver driver;

	@Given("Launch chrome browser and load url") 
	public void launchChromeBrowserAndLoadUrl() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mamun\\drivers\\chromedriver.exe");

		driver = new ChromeDriver(); // For Chrome
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("enter username as demosalesmanager")
	public void enterUsernameAsDemosalesmanager() {
		driver.findElementById("username").sendKeys("DemoSalesManager");
	}

	@Given("enter password as crmsfa")
	public void enterPasswordAsCrmsfa() {
		driver.findElementById("password").sendKeys("crmsfa");
	}

	@When("click the login button")
	public void clickTheLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("its navigated Homepage")
	public void itsNavigatedHomepage() {
		System.out.println(driver.getTitle());
	}

	@Given("click CRMSFA")
	public void clickCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@Given("click leads")
	public void clickLeads() {
		driver.findElementByLinkText("Leads").click();
	}

	@Given("click createLead")
	public void clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@When("enter the company as ABC")
	public void enterTheCompanyAsABC() {
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("ABC");
	}

	@When("enter the firstname as Hema")
	public void enterTheFirstNameAsHema() {
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Hema");
	}

	@When("enter the lastname as Mali")
	public void enterTheLastNameAsMali() {
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Mali");
	}

	@When("click the create lead button")
	public void clickTheCreateLeadButton() {
		driver.findElementByXPath("//input[@value='Create Lead']").click();
	}

	@Then("its navigated ViewLeadPage")
	public void itsNavigatedViewLeadPage() {
		System.out.println(driver.getTitle());
	}

	@When("click the logout button")
	public void clickTheLogoutButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@Then("close browser")
	public void close_browser() {
		driver.quit();
	}
	@Given("enter username as ssssss")
	public void enterUsernameAsSsssss() {
		driver.findElementById("username").sendKeys("ssssss");

	}
	@Then("verify error msg")
	public void verifyErrMsg() {
		String text = driver.findElementById("errorDiv").getText();

		if (text.contains("The Following Errors Occurred")) {
			//System.out.println("The given Credentials is wrong");
			System.out.println("Error message is matched");
		}else {
			System.out.println("Error message is not matched");
		}

	}

	@Then("its navigate same Page")
	public void samePage() {
		System.out.println(driver.getTitle());
	}

	@Then("verify the firstname")
	public void verify_the_firstname() {
		String fname = driver.findElementById("viewLead_firstName_sp").getText();
		if(fname.equals("Hema")) {
			System.out.println("Firstname is matched");
		}else
			System.out.println("Firstname is not matched");
	}

	@Given("click leads link")
	public void click_leads_link() {
		driver.findElementByLinkText("Leads").click();
	}

	@When("click Find Leads")
	public void click_Find_Leads() {
		driver.findElementByLinkText("Find Leads").click();

	}

	@When("enter firstname")
	public void enter_firstname() {
		driver.findElementByXPath("(//div[@class='x-form-element']/input)[14]").sendKeys("Gopi");
	}

	@When("click Find Leads button")
	public void click_Find_Leads_button() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();

		Thread.sleep(2000);
	}

	@Then("navigated ViewLeadPage")
	public void navigated_ViewLeadPage() {
		System.out.println(driver.getTitle());
	}

	@Then("verify title of the page")
	public void verify_title_of_the_page() {
		System.out.println(driver.getTitle());
	}

	@Then("click on Edit")
	public void click_on_Edit() {
		driver.findElementByLinkText("Edit").click();
	}

	@Then("navigated Edit Lead page")
	public void navigated_Edit_Lead_page() {
		System.out.println(driver.getTitle());
	}

	@Then("change the company name")
	public void change_the_company_name() {
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("CTS");
	}

	@Then("click update")
	public void click_update() {
		driver.findElementByXPath("//input[@value='Update']").click();
	}

	@Then("confirm changed name appears")
	public void confirm_changed_name_appears() {
		System.out.println("name");
	}

	@When("click on phone")
	public void click_on_phone() {
		driver.findElementByXPath("//span[text()='Phone']").click();
	}

	@When("enter phone number")
	public void enter_phone_number() {
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("1234567890");
	}

	@When("click find leads button")
	public void click_find_leads_button() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
	}

	@When("capture lead ID of first resulting lead")
	public void capture_lead_ID_of_first_resulting_lead() throws InterruptedException {
		Thread.sleep(2000);
		String leadId = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		System.out.println(leadId);
		//driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		Thread.sleep(2000);
	}
	@When("click first resulting lead")
	public void click_first_resulting_lead() throws InterruptedException {
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();

		Thread.sleep(2000);
	}
	@When("click Delete")
	public void click_Delete() {
	driver.findElementByXPath("//a[text()='Delete']").click();

	}

	@Then("navigated MyLeadsPage")
	public void navigated_MyLeadsPage() {
		System.out.println(driver.getTitle());
	}

	@Then("enter captured lead ID")
	public void enter_captured_lead_ID() {
		driver.findElementByXPath("(//div[@class='x-form-element']/input)[13]").sendKeys("10559");

	}

	@Then("verify error message")
	public void verify_error_message() {
		String errorMessage = driver.findElementByXPath("//div[text()='No records to display']").getText();
		if(errorMessage.contains("No records to")) {
			System.out.println("Error message is matched");
		}else {
			System.out.println("Error message is not matched");
		}
	}

	@When("choose source as Website")
	public void chooseSourceAsWebsite() {
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(source);
		dd.selectByVisibleText("Website");
	}

}
