package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateJava {

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
		
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("kiran@testleaf.com");
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		Thread.sleep(2000);
		
		String captureName = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]")).getText();
		System.out.println(captureName);	
		
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).click();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String duplicateLead = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(duplicateLead);
		if( duplicateLead.equalsIgnoreCase(captureName))
		{
			System.out.println("same name");
		}
		
		else
		{
			System.out.println("Not same");
		}
	driver.close();
	}
	
	

}
