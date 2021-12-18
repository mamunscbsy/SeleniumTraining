package miscellaneousConcept;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver= new ChromeDriver();
			
			driver.get("https://erail.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElementById("txtStationFrom").clear();		
			driver.findElementById("txtStationFrom").sendKeys("MAS", Keys.TAB);
					driver.findElementById("txtStationTo").clear();
			driver.findElementById("txtStationTo").sendKeys("NDLS", Keys.TAB);
			
			//find the table
			WebElement table2 = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");		
			
			// find row (tr tag)		
			List<WebElement> allRows = table2.findElements(By.tagName("tr"));
			System.out.println(allRows.size());
			
			
			WebElement secondRow = allRows.get(2);	
				
			// find column (td tag)
			List<WebElement> allSecRColumn = secondRow.findElements(By.tagName("td"));
			System.out.println(allSecRColumn.size());
			
			WebElement secondColumn = allSecRColumn.get(1);
			
			System.out.println(secondColumn.getText());
			
		}


	}


