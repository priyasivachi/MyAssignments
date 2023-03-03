package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		
		String captureLeadId = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[1]/div[1]/a)[1]")).getText();
		System.out.println(captureLeadId);	 
		
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[1]/div[1]/a)[1]")).click();
		
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(captureLeadId);
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String result = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(result);
		
		if(result.equalsIgnoreCase("No records to display"))
		{
			System.out.println("there is no records");
			
		}
		else
		{
			System.out.println("record is displayed");
		}
		
		driver.close();
		
		
		

		
	}

}
