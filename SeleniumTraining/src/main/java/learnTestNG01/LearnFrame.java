package learnTestNG01;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnFrame {
	
	@Test
	public void learnFrame(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // For Chrome
		driver.get("https://jqueryui.com/selectable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Switching to frame - way 1 //if your iframe has Id or name locator put the 'Value' directly
//		driver.switchTo().frame("sidebar"); //for id or name locator only(put the id or name locator "value")
		
		//Using index number- if your iframe has no Id or Name locator then go to Index number
		//Switching to frame - way 2
		//driver.switchTo().frame(0); // using index number - (Note: in java index starts from Zero[0])
		
		//WebElement- if there are multiple index then we go for webelement
		//Switching to frame - way 3
		//WebElement eleFrame = driver.findElementByClassName("demo-frame");
		//driver.switchTo().frame(eleFrame);
		
		driver.switchTo().frame(driver.findElementByClassName("demo-frame")); //Select WebElement by CalssName
		
		driver.findElementByXPath("//ol[@id='selectable']/li[1]").click(); //clicking Item 1 element 
		
		
		//for switch back to main HTML page from frame
		driver.switchTo().defaultContent();
		
		//after back to main html select any element from outside Nested HTML
		driver.findElementByLinkText("Download").click();
		
		driver.findElementByXPath("//*[@id=\'menu-top\']/li[3]/a").click();
		driver.findElementByXPath("//*[@id=\'menu-top\']/li[4]/a").click();
		driver.findElementByXPath("//*[@id=\'menu-top\']/li[5]/a").click();
		driver.findElementByXPath("//*[@id=\'menu-top\']/li[6]/a").click();
		driver.findElementByXPath("//*[@id=\'menu-top\']/li[7]/a").click();
		driver.findElementByXPath("//*[@id=\'menu-top\']/li[8]/a").click();
		
		driver.close();

		
		
		
	}

}
