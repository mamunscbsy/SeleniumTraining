package takeSnapshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSnapshot {

	public static void main(String[] args) throws IOException, InterruptedException {

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

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");

		try {
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hema");
			System.out.println("FirstName entered");
		} catch (Exception e1) {
			System.err.println("FirstName not entered");
		}				
		
		try {
		driver.findElementByXPath("//input[@id='createLeadForm_lastName3']").sendKeys("Ma");
		System.out.println("Enter lastName successfully");
		
		}catch(Exception e) {
			System.err.println("LastName not enter successfully");
		
		
		}finally {
		
			//Take snapshot
				
			File src = driver.getScreenshotAs(OutputType.FILE); // take snapshot and store in Temp File
			
			//location 1-the path/location where it store after move
			File dest = new File("C:\\Users\\mamun\\Desktop\\snaps\\img.png"); //define the destination file
				
		// location 2-the path/location where it store after move
		//File dest = new File("./snap/image.png");
		
		FileUtils.copyFile(src, dest); // moving file source to destination
				
		}
		// click create lead
		driver.findElementByXPath("//input[@value='Create Lead']").click();

		driver.close();

	}


	}


