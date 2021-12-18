package DemoScrolling;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragDrop_Horizantal {
	
	ChromeDriver driver;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rangeslider.js.org/");
		}
	
	@Test
	public void dragSliderLeft() {
	
	WebElement slider = driver.findElementByXPath("//div[@id='js-rangeslider-0']/div[2]");
					
	WebElement output = driver.findElementById("js-output");
	
	Actions action = new Actions(driver);
	action.dragAndDrop(slider, output);
	action.dragAndDropBy(slider, -50, 0).perform();
	System.out.println("what is the output after DragibLeft :" + output.getText());
	}
	
	//@Test
	public void dragSliderRight() {
			
	WebElement slider = driver.findElementByXPath("//div[@id='monthlyPayment-range-slider__controls']");
					
	WebElement output = driver.findElementByXPath("//span[@class='fc-range-slider__range-slider__rangeLabel']");
	
	Actions action = new Actions(driver);
	//action.dragAndDrop(slider, output);
	action.dragAndDropBy(slider, 100, 0).perform();
	System.out.println("what is the output after DragibRight :" + output.getText());
	}

}
