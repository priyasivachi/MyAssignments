package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;





public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ShanmugCafe");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jothivel");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Dharsini");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Teastal");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("going to take a break");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ssprt@gmail.com");
	WebElement dd=driver.findElement(By.name("generalStateProvinceGeoId"));
	Select sec=new Select(dd);
	sec.selectByVisibleText("New York");
	driver.findElement(By.name("submitButton")).click();
	Thread.sleep(1500);
	String title=driver.getTitle();
	System.out.println("titel"+title);
			
			
	
	
	
	}

}
