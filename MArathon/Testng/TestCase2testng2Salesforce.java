package selenium.marathan;

import org.testng.annotations.Test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.BeforeTest;



public class TestCase2testng2Salesforce extends ProjectSpecificMethod {
	@BeforeTest
	public void setSFData() {
		excelname="Salesforce";
	}
	@Test(dataProvider = "sendDataa") 
	
	
		
	
	public void opportunity(String OpportunityName, String Amount) throws InterruptedException {
		
		//Click Sales From App Launcher
				driver.findElement(By.xpath("//p[@title='Manage your sales process with accounts, leads, opportunities, and more']")).click();
		
		//Click View All Key deals in Key Deals
				Thread.sleep(2000);
				WebElement scroll = driver.findElement(By.xpath("//span[text()='View All Key Deals']"));
				driver.executeScript("arguments[0].click();",scroll);
				
		//Click New
				
				driver.findElement(By.xpath("//div[@title='New']")).click();
				
		//Enter Opportunity Name
				WebElement oppName = driver.findElement(By.xpath("(//input[@part='input'])[3]"));
				Thread.sleep(2000);
				oppName.sendKeys(OpportunityName);
				Thread.sleep(3000);
				String oppName1 = oppName.getAttribute("value");
				System.out.println("send name "+oppName1);
				
				
		//Select  Type as New Customer
				driver.findElement(By.xpath("(//button[@role='combobox'])[2]")).click();
				driver.findElement(By.xpath("//span[text()='New Customer']")).click();
				
		//Select LeadSorce as Partner Referral		
			driver.findElement(By.xpath("(//button[@data-value='--None--'])[2]")).click();
			driver.findElement(By.xpath("//span[text()='Partner Referral']")).click();
			
		//Choose Amount from excel
			driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys(Amount);
			
		//Select Close Date as tomorrow
			
			driver.findElement(By.xpath("//div[@class='slds-dropdown-trigger slds-dropdown-trigger_click slds-size_1-of-1']")).click();
			driver.findElement(By.xpath("//td[@data-value='2023-03-21']//span[1]")).click();
		//Select stage as Need Analysis
			driver.findElement(By.xpath("(//button[@role='combobox']//span)[1]")).click();
			driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
			
		// Select Primary Campaign Source and select first option
			driver.findElement(By.xpath("//input[@placeholder='Search Campaigns...']")).click();
			driver.findElement(By.xpath("//span[@title='test']")).click();
			
		//click save
			driver.findElement(By.xpath("//button[text()='Save']")).click();

		//verify the opportunity is created
			String opportunityName1 = driver.findElement(By.xpath("//slot[contains(@class,'slds-page-header__title slds-m-right--small')]"
					+ "//lightning-formatted-text[1]")).getText();
			System.out.println("new name"+opportunityName1);
			if(opportunityName1.contains(oppName1))
			{
				System.out.println("Opportunity is created");
			}
			else
			{
				System.out.println("Opportunity is not created");
			}
	}
}

