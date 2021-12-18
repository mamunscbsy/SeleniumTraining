package miscellaneousConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
						
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.mycontactform.com/"); 
		
		System.out.println(driver.getCurrentUrl()); 
		
		System.out.println(driver.getTitle()); 	//Title of the page 	
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//isDisplayed() -return(true/false) verify Home is displayed or not 
		boolean home = driver.findElement(By.xpath("//span[text()='Home']")).isDisplayed();
		System.out.println(home);
		//Validation
		if(home==true) {
			System.out.println("Home is displayed");
		}else {
			System.out.println("Home is not displayed");
		}
		
		driver.findElement(By.id("user")).sendKeys("Prabhu123"); 
			
		//driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("12345");
		
		//username.sendKeys("Prabhu123"); 	 
		
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("12345");
		//password.sendKeys("12345"); 
	
		//click login
		driver.findElement(By.cssSelector("#right_col_top > form > div > input")).click(); 	 	
		
		driver.findElement(By.xpath("//a[contains(text(),'New Form Wizard')]")).click();
		
		//isEnabled() -return(true/false), verify New Form Wizard Button is Enable or not
		boolean startWizardbtn = driver.findElement(By.xpath("//input[@value='Start Wizard']")).isEnabled();
		System.out.println(startWizardbtn);
		if(startWizardbtn==true) {
			System.out.println("Start Wixard button is Enable");
		}else {
			System.out.println("Start Wixard button is not Enable");
		}
		
		driver.findElement(By.className("btn")).click();
		
		driver.findElement(By.id("formname")).sendKeys("Mamun");
		
		driver.findElement(By.xpath("//*[@id=\'referrer\']")).sendKeys("http://tepeople.com/");
		
		driver.findElement(By.id("Submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'Submit\']")).click();
		
		driver.findElement(By.linkText("Sample Forms")).click();
		
		//1st click on the "Sales CheckBox"(select) then verify isSelected() otherwise else part will be work
		driver.findElement(By.xpath("//input[@name='email_to[]'][2]")).click();
		
		//isSelected()-return true/false, verify Sales CheckBob is Selected or not
		boolean SalesCheckbox = driver.findElement(By.xpath("//input[@name='email_to[]'][2]")).isSelected();
		System.out.println(SalesCheckbox);
		
		//Assertion
		Assert.assertTrue(SalesCheckbox, "SalesCheckBox is selected");
		
		//Validation
		if(SalesCheckbox==true) {
			System.out.println("The Sales checkbox is Selected");
		}else {
			System.out.println("The Sales checkbox is not Selected");
		}
		
		driver.quit();
		
		
//		driver.findElement(By.xpath("//*[@id=\'right_col_bottom\']/ul/li[1]/a")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\'right_col_bottom\']/ul/li[2]/a")).click();
//		
//		driver.findElement(By.cssSelector("#right_col_bottom > ul > li:nth-child(3) > a")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\'right_col_bottom\']/ul/li[4]/a")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\'right_col_bottom\']/ul/li[5]/a")).click();

	}

}
