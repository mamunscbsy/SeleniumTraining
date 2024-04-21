package c_23C1_learnDataProvider_Parameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


public class ProjectSpecificWrapper {
	
	public ChromeDriver driver;

	@Parameters({"url","uname","pwd"})

	@BeforeMethod
	public void login(String url, String uname, String pwd) { 

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();

		//maximize
		driver.manage().window().maximize();

		//load URL
		driver.get(url); 

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Enter Username - (Element level)
		driver.findElementById("username").sendKeys(uname);

		//Enter Password - (Element level)
		driver.findElementById("password").sendKeys(pwd);

		// Click Login Button - (Element level)
		driver.findElementByClassName("decorativeSubmit").click();

		// click crm.sfa link
		driver.findElementByLinkText("CRM/SFA").click();

	}
	@AfterMethod
	public void closeBrowser() { 
		driver.close();
	}
	
	@DataProvider
	//public void getData(){
	public String[][] getData() {
	
		//create object of 2D Array/declare 2D Array and write size of array(Row & column)
		
		String [] [] data = new String[4][3];
		
		
		data[0][0] = "TCS";
		data[0][1] = "Zakia";
		data[0][2] = "Khan";
		
		data [1][0] = "ABC";
		data [1][1] = "Sarwath";
		data [1][2] = "Sarqume";
		
		data [2][0] = "XYZ";
		data [2][1] = "Wadud";
		data [2][2] = "Khan";
		
		data [3][0] = "CTS";
		data [3][1] = "Shah";
		data [3][2] = "Majumder";
		
		return data;
			
		// return data;
		
		/*data [3][0] = "ABC";
		data [3][1] = "Mamun";
		data [3][2] = "Chy";
		
		data [4][0] = "CTS";
		data [4][1] = "Nilufar";
		data [4][2] = "Chowdhury";
		
		data [5][0] = "DXC";
		data [5][1] = "Mohd.";
		data [5][2] = "Shakil";*/
		
		//add return type and change return type of getData()
			//return data;		
		
	}
}
