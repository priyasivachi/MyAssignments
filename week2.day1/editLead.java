package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class editLead {
	public static void main(String[] args) throws InterruptedException 
		
		 {
			ChromeDriver EL =new ChromeDriver();
			EL.get("http://leaftaps.com/opentaps/control/login");
			EL.findElement(By.id("username")).sendKeys("demosalesmanager");
			EL.findElement(By.id("password")).sendKeys("crmsfa");
			EL.findElement(By.className("decorativeSubmit")).click();
			EL.findElement(By.linkText("CRM/SFA")).click();
			EL.findElement(By.linkText("Leads")).click();
			EL.findElement(By.linkText("Create Lead")).click();
			EL.findElement(By.id("createLeadForm_companyName")).sendKeys("ShanmugCafe");
			EL.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
			EL.findElement(By.id("createLeadForm_lastName")).sendKeys("Jothivel");
			EL.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Dharsini");
			EL.findElement(By.id("createLeadForm_departmentName")).sendKeys("Teastal");
			EL.findElement(By.id("createLeadForm_description")).sendKeys("going to take a break");
			EL.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ssprt@gmail.com");
			WebElement dd=EL.findElement(By.name("generalStateProvinceGeoId"));
			Select sec=new Select(dd);
			sec.selectByVisibleText("New York");
			EL.findElement(By.name("submitButton")).click();
			EL.findElement(By.linkText("Edit")).click();
			EL.findElement(By.id("updateLeadForm_description")).clear();
			EL.findElement(By.id("updateLeadForm_importantNote")).sendKeys("its changed");
			EL.findElement(By.name("submitButton")).click();
			
			Thread.sleep(1500);
			String title=EL.getTitle();
			System.out.println("titel"+title);
					
	}

}
