package testCasesParameterization;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wrapper.ParametersPSW;

public class ParametersCreateLead extends ParametersPSW {

	
	@Test(dataProvider = "getData")
	
	public void createLead(String cName, String fName, String lName) throws InterruptedException {

		//click leads
		driver.findElementByLinkText("Leads").click();


		//click create lead link
		driver.findElementByLinkText("Create Lead").click();

		//company name
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	
		//enter FistName
		driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys(fName);
		
		Thread.sleep(2000);
		//throw new Exception();

		//enter lastName
		driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys(lName);
		
		//Choose source
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(src);
		dd.selectByVisibleText("Website");

		//choose ownership
		WebElement ele = driver.findElementByName("ownershipEnumId");
		Select dd2 = new Select(ele);
		dd2.selectByVisibleText("Sole Proprietorship");

		//Click Create lead
		driver.findElementByXPath("//input[@name='submitButton']").click();

		//Verify title of the page
		String title = driver.getTitle();
		System.out.println(title);

		if(title.contains("View")) {
			System.out.println("Title matched");
		} else {
			System.out.println("Title not Matche");
		}

	}
}
