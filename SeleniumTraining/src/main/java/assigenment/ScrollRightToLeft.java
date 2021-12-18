package assigenment;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScrollRightToLeft {
	ChromeDriver driver;

	@BeforeMethod
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.landrover.co.uk/offers-and-finance/finance-calculator.html");
		driver.findElementByXPath("//button[@aria-label='MONTHLY PAYMENT']").click();
	}
	@Test
	public void dragLeft() throws InterruptedException {

		WebElement slider = driver.findElementByXPath("//div[@id='monthlyPayment-range-slider__controls']/div[3]");
		//WebElement slider =	driver.findElementByCssSelector("#handle_max");			
		WebElement output = driver.findElementByXPath("//span[@class='fc-range-slider__range-slider__rangeLabel']");

		Actions action = new Actions(driver);
		//action.dragAndDrop(slider, output);
		action.dragAndDropBy(slider, -55, 0).perform();
		System.out.println("what is the output after DragibLeft :" + output.getText());
		Thread.sleep(5000);
	}

	@Test
	public void dragRight() {

		WebElement slider = driver.findElementByXPath("//div[@id='monthlyPayment-range-slider__controls']/div[3]");

		WebElement output = driver.findElementByXPath("//span[@class='fc-range-slider__range-slider__rangeLabel']");

		Actions action = new Actions(driver);
		//action.dragAndDrop(slider, output);
		action.dragAndDropBy(slider, 100, 0).perform();
		System.out.println("what is the output after DragibRight :" + output.getText());
	}
	@AfterMethod
	public void closeBrowser(){
		
		driver.quit();
	}
}