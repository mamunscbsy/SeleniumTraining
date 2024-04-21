package c_25C_ExceptionHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept_ExceptionHandling {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Enter URL
		driver.get("https://jqueryui.com/selectable/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//click Selectable (outside frame)
		
		try {
		driver.findElementByLinkText("Selectable1").click();
		//System.out.println("The element is clickable");
		
		} 
		catch (Exception e) {
		//System.err.println("The element is not clickable");
			
			//Create RunTime exception by using throw keyword
			//throw new RuntimeException();
		}	
		
		
	
	finally { 
		System.out.println("The element is found");
			}
		//Using index number- if your iframe has no Id or Name locator then go to Index number

		//Switching to frame - way 2		
		driver.switchTo().frame(0); // using index number - (Note: in java index starts from Zero[0])

		//clicking Item 1 element 
				driver.findElementByXPath("//ol[@id='selectable']/li[3]").click();
				
				//clicking Item 3 element
				driver.findElementByXPath("//ol[@id='selectable']/li[4]").click(); 
				driver.findElementByXPath("//ol[@id='selectable']/li[5]").click(); 		
				driver.findElementByXPath("//ol[@id='selectable']/li[7]").click(); 			

				//switch back to main HTML page 
				//driver.switchTo().defaultContent();
				driver.switchTo().parentFrame();

				//click Demos (outside frame)
				Thread.sleep(3000);
				driver.findElementByLinkText("Demos").click();
				
				System.out.println("TC completed");
				
				Thread.sleep(3000);
				driver.close();
			}
	}


