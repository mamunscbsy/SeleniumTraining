package takeSnapshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TakeScreenshots {

	@Test
	public void createLead() throws InterruptedException, IOException   {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// enter username
		driver.findElementById("username").sendKeys("DemoSalesManager");

		// enter password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		// click login button
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		// click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();// click CRM/SFA link


		// click create lead link
		driver.findElement(By.linkText("Create Lead")).click();

		//enter Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XYZ");

		//enter FirstName Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hema");
		System.out.println("FirstName entered");

		//enter LastName Name
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Ma");
		System.out.println("Enter lastName successfully");

		//Take snapshot/ScreenShot
		//File src = driver.getScreenshotAs(OutputType.FILE); // take snapshot and store in Temp File
		File src = driver.getScreenshotAs(OutputType.FILE);
	
		//Path/location-1, where it will store after moved
		File dest = new File("C:\\Users\\mamun\\Desktop\\snaps\\img.png"); //define the destination file
		
		//Path/location-2, where it will store after moved

		//Store it in a Eclipse project folder - snap
		//File dest = new File("./snap/image.png");

		FileUtils.copyFile(src, dest);
		//FileUtils.copyFile(src, dest); //moved file source to destination(img or image file)


		// click create lead
		driver.findElementByXPath("//input[@value='Create Lead']").click();

		driver.close();

	}


}
