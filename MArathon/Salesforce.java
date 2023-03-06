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

public class Salesforce {

	public static void main(String[] args) throws InterruptedException {
//for avoid notifications
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//login into salesforce
		driver.get("https://login.salesforce.com/");
		
//username
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		
//password
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		
//login
		driver.findElement(By.id("Login")).click();
		
//get the title of the page
		String title = driver.getTitle();
		System.out.println("The title is" + title);
		
//click onLearn more link in Mobile Publisher
		driver.findElement(By.xpath("(//span[@class=' label bBody'])[2]")).click();
		
//window handling
		String homeWindow = driver.getWindowHandle();//home window
	    Set<String> nextWindow = driver.getWindowHandles();//next window 
	    List<String> list=new ArrayList<String>(nextWindow);
	    String confirmpage= list.get(1);
	    driver.switchTo().window(confirmpage);
	   //driver.switchTo().window(list.get(1));
	   
//click confirm redirect
	driver.findElement(By.xpath("//button[text()='Confirm']")).click();
	
//click learning that is a shadow elements
	Shadow dom = new Shadow(driver);
	dom.setImplicitWait(20);
	WebElement element = dom.findElementByXPath("//span[text()='Learning']");
	element.click();
	
//Mousehover on Learning On Trailhead
	WebElement learning = dom.findElementByXPath("//span[text()='Learning on Trailhead']");
	Actions builder=new Actions(driver);
	builder.moveToElement(learning).perform();
	
//click on salesforce certifications
	WebElement certifications = dom.findElementByXPath("//a[text()='Salesforce Certification']");
	certifications.click();	
	
//print all the certifications
	List<WebElement> certicatesNames = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
	for(int i=0;i<certicatesNames.size();i++)
	{
		System.out.println("All certification are " +certicatesNames.get(i).getText());
	}
	
// get the admin title 
	driver.findElement(By.xpath("//a[text()='Administrator']")).click();
	Thread.sleep(2000);
	String title1 = driver.getTitle();
	System.out.println("certification" +  " " +title1);
	
	
	
	}
	
	

}








