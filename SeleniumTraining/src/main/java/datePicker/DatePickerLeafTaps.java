package datePicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerLeafTaps{

	public static void main(String[] args) throws InterruptedException {

		//How to pick a date from calendar
		
		String month = "May, 2022";
		String day = "20";

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\git\\repository\\SeleniumTraining\\drivers\\chromedriver.exe");
		//Create object of ChromeDriver Class
		WebDriver driver = new ChromeDriver();
		//Load URL
		driver.get("http://leaftaps.com/opentaps");
		//Maximize window
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Enter user name
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");

		//driver.findElementByXPath("//button[text()='Try it']").click();
		//Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click login btn
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click CRMSFA
		driver.findElement(By.linkText("CRM/SFA")).click();

		//click Create lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Click on calendar icon near from the Birth date field
		driver.findElement(By.xpath("//img[@id='createLeadForm_birthDate-button']")).click();
		
		//1st capture month and year from calendar and store it in a variable 
		while (true) {
			String text = driver.findElement(By.xpath("//td[@class='title']")).getText();
			System.out.println(text);
			
			if(text.equals(month)) 	{ //when it finds month = "May 2022", then comes out from the while loop.
				break; //when the condition will be met, it will stop here
			}
			else {
				//continue clicking on next month btn until found the "May 2022" month.
				driver.findElement(By.xpath("(//div[@unselectable='on'])[6]")).click();
			}				
			}
		//close the calendar 
		driver.findElement(By.xpath("(//div[@unselectable='on'])[2]")).click();
		
		//enter text in description field
		driver.findElement(By.id("createLeadForm_description")).sendKeys("It's a software company");
		Thread.sleep(3000);
		driver.quit();
		}
}
