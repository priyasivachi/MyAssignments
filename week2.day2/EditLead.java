package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Pavithra");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(3000);
		
        driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		String title = driver.getTitle();
	    System.out.println("title is" + title);
	    if(title.contains("viewLead"))
	    {
	    	System.out.println("Title Verified");
	    	
	    }
	    else
	    {
	    	System.out.println("Title Not Verified");
	    }
	    
	    driver.findElement(By.linkText("Edit")).click();
	    
	    driver.findElement(By.id("updateLeadForm_companyName")).clear();
	    
	    driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLEaf");
	   
	    driver.findElement(By.name("submitButton")).click();
	  
	    
	 String CompanyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	
		if(CompanyName.contains("TestLEaf")){
			System.out.println("Company Name Updated Successfully");
		} 
		
		else {
			System.out.println("Company Name not updated properly");	
		}
	    
	    driver.close();
	}

}
