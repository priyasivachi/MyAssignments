package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("srihari");
		
		driver.findElement(By.id("lastNameField")).sendKeys("Siva");
		
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("hari");
		
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("sivachi");
		
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Scientist");
		
		driver.findElement(By.id("createContactForm_description")).sendKeys(" I Am a Scientist");
		
		driver.findElement(By.name("primaryEmail")).sendKeys("aaa@gji.comt");
		
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select sta=new Select(state);
		sta.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateContactForm_description")).clear();
		
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("I am a hero");
		
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		
		String title = driver.getTitle();		
		System.out.println("the title is" + " "+ title);
		

		
		
		

	}

}
