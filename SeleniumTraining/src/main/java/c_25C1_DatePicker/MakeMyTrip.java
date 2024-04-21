package c_25C1_DatePicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		
		String month = "May 2022";
		String day = "20";

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\git\\repository\\SeleniumTraining\\drivers\\chromedriver.exe");
		//Create object of ChromeDriver Class
		WebDriver driver = new ChromeDriver();
		//Load URL
		driver.get("https://www.makemytrip.com/");
		
		
		//Maximize window
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		Thread.sleep(2000);
		
		
		/*while (true) {
		String text = driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[3]/div[1]/table/thead")).getText();
		System.out.println(text);
		if(text.equals(month)) 	{
			break;		
		}
		else {
			driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[3]/div[1]/table/thead/tr[1]/th[3]/i")).click();
		}
		driver.findElement(By.xpath("//div[9]//div[1]//table[1]//tbody[1]//tr//td[contains(text(),"+day+")]")).click();
	}
}*/	

	}

}
