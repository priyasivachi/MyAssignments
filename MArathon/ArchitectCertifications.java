package selenium.marathan;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class ArchitectCertifications {

public static void main(String[] args)  {
//for avoid notifications
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			ChromeDriver driver=new ChromeDriver(option);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
//Login into salesforce
			driver.get("https://login.salesforce.com/");
			driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
			driver.findElement(By.id("password")).sendKeys("Leaf@123");
			driver.findElement(By.id("Login")).click();
			
//Click on Learn More link in Mobile Publisher			
			driver.findElement(By.xpath("//span[text()='Learn More']")).click();
			
//Window handling to switch one window to another window
			String homeWindow = driver.getWindowHandle();
			Set<String> nextWindow = driver.getWindowHandles();
			List<String> list=new ArrayList<String>(nextWindow);
			driver.switchTo().window(list.get(1));
			
//Click on confirm button
			driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
			
//click learning that is a shadow elements
			Shadow dom = new Shadow(driver);
			dom.setImplicitWait(20);
			WebElement element = dom.findElementByXPath("//span[text()='Learning']");
			element.click();
			
//Mousehover on Learning On Trailhead
			WebElement learning = dom.findElementByXPath("//span[text()='Learning on Trailhead']");
			Actions builder=new Actions(driver);
			builder.moveToElement(learning).perform();	
	
//Click on salesforce Certifications			
			WebElement sfCertication= dom.findElementByXPath("//a[text()='Salesforce Certification']");
			sfCertication.click();
			
//Choose Salesforce Architecture
			driver.findElement(By.xpath("(//img[@class='roleMenu-item_img']/following-sibling::div)[2]")).click();
			System.out.println("Priya");
			
//Get the summary
			WebElement summary = driver.findElement(By.xpath("//div[contains(@class,'cert-site_text slds-text-align--center')]"));
			System.out.println("Summary is" + " " +summary.getText());
			
//Get the List of Salesforce Architect Certifications	
		
		List<WebElement> saCerticatesNames = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		for(int i=0;i<saCerticatesNames.size();i++)
		{
			System.out.println("All certification are " +saCerticatesNames.get(i).getText());
		}	
			
//Click in Application Architect
		driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
		
//Get the List of Salesforce  Application Architect Certifications	
		List<WebElement> saaCertifications=driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
																		
		for(int i=0;i<saaCertifications.size();i++)
		{
		System.out.println("Salesforce Application Architecture Certificaions are" + " " + saaCertifications.get(i).getText());
		}
}

}
