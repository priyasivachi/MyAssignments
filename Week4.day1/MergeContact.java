package Week4.Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		
		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			
		//2. Enter UserName and Password Using Id Locator	
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
	
		//3. Click on Login Button using Class Locator
			driver.findElement(By.className("decorativeSubmit")).click();
	
		//4. Click on CRM/SFA Link
			driver.findElement(By.linkText("CRM/SFA")).click();
			
		//5. Click on contacts Button		
			driver.findElement(By.linkText("Contacts")).click();
			
		//6. Click on Merge Contacts using Xpath Locator
			driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
	
		//	7. Click on Widget of From Contact
			driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
			Set<String> fromWindow = driver.getWindowHandles();
			List<String> fromList=new ArrayList<String>(fromWindow);
			driver.switchTo().window(fromList.get(1));
			Thread.sleep(3000);
			
		//8. Click on First Resulting Contact
			driver.findElement(By.xpath("(//div[@class ='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
			driver.switchTo().window(fromList.get(0));
			
		//9. Click on Widget of To Contact	
			driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
			Set<String> ToWindow = driver.getWindowHandles();
			List<String> ToWindows= new ArrayList<String>(ToWindow);
			driver.switchTo().window(ToWindows.get(1));
			Thread.sleep(3000);
			
		//10. Click on Second Resulting Contact
			driver.findElement(By.xpath("(//div[@class ='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
			driver.switchTo().window(ToWindows.get(0));
			
		//11. Click on Merge button using Xpath Locator	
			driver.findElement(By.className("buttonDangerous")).click();
			
		//12. Accept the Alert
			Alert alert = driver.switchTo().alert();
			alert.accept();
			String title = driver.getTitle();
			System.out.println(title);
			
		//13. Verify the title of the page
			if(title.equals("View Contact | opentaps CRM"))
				{
				System.out.println("True");
				}
			else
				{
				System.out.println("false");
				}
	}

}
