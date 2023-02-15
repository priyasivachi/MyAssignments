package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class duplicateLead {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver DL =new ChromeDriver();
		DL.get("http://leaftaps.com/opentaps/control/login");
		DL.findElement(By.id("username")).sendKeys("demosalesmanager");
		DL.findElement(By.id("password")).sendKeys("crmsfa");
		DL.findElement(By.className("decorativeSubmit")).click();
		DL.findElement(By.linkText("CRM/SFA")).click();
		DL.findElement(By.linkText("Leads")).click();
		DL.findElement(By.linkText("Create Lead")).click();
		DL.findElement(By.id("createLeadForm_companyName")).sendKeys("ShanmugCafe");
		DL.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
		DL.findElement(By.id("createLeadForm_lastName")).sendKeys("Jothivel");
		DL.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Dharsini");
		DL.findElement(By.id("createLeadForm_departmentName")).sendKeys("Teastal");
		DL.findElement(By.id("createLeadForm_description")).sendKeys("going to take a break");
		DL.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ssprt@gmail.com");
		WebElement dd=DL.findElement(By.name("generalStateProvinceGeoId"));
		Select sec=new Select(dd);
		sec.selectByVisibleText("New York");
		DL.findElement(By.name("submitButton")).click();
		String title=DL.getTitle();
		System.out.println("title1"+title);
		
		DL.findElement(By.linkText("Duplicate Lead")).click();
		DL.findElement(By.id("createLeadForm_companyName")).clear();
		DL.findElement(By.id("createLeadForm_companyName")).sendKeys("Starbucks");
		
		
		DL.findElement(By.id("createLeadForm_firstName")).clear();
		DL.findElement(By.id("createLeadForm_firstName")).sendKeys("Sivachi");
		

		DL.findElement(By.name("submitButton")).click();
		
		Thread.sleep(1500);
		String titlee=DL.getTitle();
		System.out.println("title2"+titlee);
				

	}

}
