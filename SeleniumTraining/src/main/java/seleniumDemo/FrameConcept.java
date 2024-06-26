package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/selectable/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//click Selectable (outside frame)
		driver.findElementByLinkText("Selectable").click();

		//Using index number- if your iframe has no Id or Name locator then go to Index number

		//Switching to frame - way 2
		
		//driver.switchTo().frame(0); // using index number - (Note: in java index starts from Zero[0])
		
		//Switching to frame- way-3	
		//WebElement iframe = driver.findElementByClassName("demo-frame");
		//driver.switchTo().frame(iframe);
		
		//Switching to frame
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		//driver.switchTo().frame(0);
		//driver.switchTo().frame(driver.findElementByClassName("demo-frame")); //Select WebElement by CalssName
		//driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		//OR (we can do it other way)
		
	//WebElement iframe = driver.findElementByClassName("demo-frame");
		//driver.switchTo().frame(iframe);

		//clicking Item 1,3 element 
		//driver.findElementByXPath("//ol[@id='selectable']/li[3]").click();
		driver.findElementByXPath("//ol[@id='selectable']/li[3]").click();
	
		//clicking Item 4,5,7 element
		driver.findElementByXPath("//ol[@id='selectable']/li[4]").click(); 
		
		driver.findElementByXPath("//ol[@id='selectable']/li[5]").click(); 
		
		driver.findElementByXPath("//ol[@id='selectable']/li[7]").click(); 			

		//switch back to main HTML page from iframe 
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
	
		//click Demos (outside frame)
		Thread.sleep(3000);
		driver.findElementByLinkText("Demos").click();

		Thread.sleep(3000);
		//driver.close();
	}
}


