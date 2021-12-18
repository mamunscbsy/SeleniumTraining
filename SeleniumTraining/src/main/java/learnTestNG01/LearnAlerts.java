package learnTestNG01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnAlerts {

	@Test
	public void learnAlerts() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // For Chrome

		// driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");// It's not
		// working right now

		driver.get("http://leaftaps.com/opentaps");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// driver.findElementByLinkText("AGENT LOGIN").click();

		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");

		// driver.findElementByXPath("//button[text()='Try it']").click();

		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");

		driver.findElementByXPath("//input[@value='Login']").click();

		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByXPath("//a[text()='Create Lead']").click();

		driver.findElementByXPath("//a[text()='Merge Leads']").click();

		driver.findElementByXPath("//a[text()='Merge']").click();

		String text = driver.switchTo().alert().getText();

		System.out.println(text);

		driver.switchTo().alert().accept();

		driver.close();

		// driver.findElementByXPath("//input[@value='Login']").click();

		// Thread.sleep(2000);

		// String txt = "name";

		// String text = driver.switchTo().alert().getText(); // read the text from
		// alert

		// System.out.println(text);// print the text in console

		// driver.switchTo().alert().accept(); // click ok button from alert

//		driver.switchTo().alert().dismiss(); // click cancel button from alert

	}

}
