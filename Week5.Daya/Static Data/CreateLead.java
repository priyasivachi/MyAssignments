package Week5.Day1.LeafTaps.TestNg.DynamicData.Practice;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead   extends ProjectSpecificationsTestNg
{
	@BeforeTest
	public void setData()
	{
		excelfilename="TNPCL01";
		
	}
	@Test(dataProvider="sendData")	
	public void cLead(String cName,String fName,String lName)
		{
	
			
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
			driver.findElement(By.name("submitButton")).click();
			
	}
	}


