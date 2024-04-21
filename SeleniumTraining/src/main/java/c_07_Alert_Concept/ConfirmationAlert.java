package c_07_Alert_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver(); 

		driver.get("http://leaftaps.com/opentaps");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//driver.findElementByLinkText("AGENT LOGIN").click();

		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");

		//driver.findElementByXPath("//button[text()='Try it']").click();

		driver.findElementById("password").sendKeys("crmsfa");

		driver.findElementByClassName("decorativeSubmit").click();

		driver.findElementByLinkText("CRM/SFA").click();


		//click Create lead
		driver.findElementByLinkText("Create Lead").click();
		//Click Merge leads
		driver.findElementByLinkText("Merge Leads").click();

		//click merge
		driver.findElementByLinkText("Merge").click();

		//Confirmation Alert
		//switch control to Alert from HTML page, get the Alert text & store it in a variable
		String ConfirmationAlert = driver.switchTo().alert().getText();
		System.out.println(ConfirmationAlert);

		//wait 3 seconds
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();


		driver.close();

		//switching to alert and capturing alert message

		/*Alert confirmationAlert = driver.switchTo().alert();
		System.out.println(confirmationAlert.getText());
		//Alert ConfirmationAlert = driver.switchTo().alert();
		//System.out.println(ConfirmationAlert.getText());

		Thread.sleep(3000);
		confirmationAlert.dismiss();*/
		//confirmationAlert.accept();


		/*String alertMessage = driver.switchTo().alert().getText();

		Thread.sleep(3000);
		//Displaying alert message
		System.out.println(alertMessage);

		Thread.sleep(3000);
		//Accepting alert
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();*/
	}

}
