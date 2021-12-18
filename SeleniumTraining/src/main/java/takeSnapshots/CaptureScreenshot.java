package takeSnapshots;

import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CaptureScreenshot {

	ChromeDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println(driver.getTitle());
	}
	@AfterMethod
	public void tearDown() {
		//driver.close();
	}
	@Test
	public void captureScreenshot() throws IOException, InterruptedException {
		File src = driver.getScreenshotAs(OutputType.FILE); // take snapshot and store in Temp File

		//location 1-the path/location where it store after move
		//File dest = new File("C:\\Users\\mamun\\Desktop\\screenshot\\img.png"); //define the destination file

		// location 2-the path/location where it store after move
		File dest = new File("./snap/image.png");

		FileUtils.copyFile(src, dest); // moving file source to destination

		//Type "iphone 13" on Google search box and hit enter for search
		driver.findElementByXPath("//input[@name='q']").sendKeys("iphone 13",Keys.ENTER);
		
		Thread.sleep(3000);
		//click/select the ist item from the search result
		//driver.findElementByXPath("(//span[@class='pymv4e'])[1]").click();
		
		//Again take the screenshot 
		File src1 = driver.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("C:\\Users\\mamun\\Desktop\\screenshot\\img.png");
		FileUtils.copyFile(src1, dest1);
		
	}
}
