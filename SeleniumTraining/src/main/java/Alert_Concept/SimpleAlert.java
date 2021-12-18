package Alert_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\eclipse-workspace\\SeleniumTraining\\drivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Click Submit 
		driver.findElementByXPath("(//input[@id='searchBtn'])[1]").click();
	
		
		//switch control to Alert from HTML page and get the Alert text
		
		String simpleAlert = driver.switchTo().alert().getText();
		System.out.println(simpleAlert);
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		driver.close();
		
	//	String SimpleAlertText = driver.switchTo().alert().getText();
		//System.out.println(SimpleAlertText);
				
		
		//Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		
				
		/*String simpleAlert = driver.switchTo().alert().getText();
		System.out.println(simpleAlert);
	
		driver.switchTo().alert().accept();
		
		driver.close();*/
		
		//System.out.println(getText());
		
		//Alert simple_alert = driver.switchTo().alert();
		//System.out.println(simple_alert.getText());
		
		//Thread.sleep(3000);
		//simpleAlert.accept();
		
		//String alertSms = driver.switchTo().alert().getText();
		//String alertMessage = driver.switchTo().alert().getText();
		
		//System.out.println(alertMessage);
		//System.out.println("Alert message is: "+ alertMessage);
		
		//Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		
		/*//String actual_msg = driver.switchTo().alert().getText();
		//System.out.println(actual_msg);
				
		//Thread.sleep(3000);
		//driver.switchTo().alert().accept();*/

	}

}
