package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAssignment {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		driver.findElement(By.name("firstname")).sendKeys("demosalesmanager");
		driver.findElement(By.name("lastname")).sendKeys("jjjjjj");
		driver.findElement(By.name("reg_email__")).sendKeys("1111111777");
		driver.findElement(By.id("password_step_input")).sendKeys("12qw@k");
		
		WebElement dd=driver.findElement(By.id("day"));
		Select sec=new Select(dd);
		sec.selectByVisibleText("29");
		
		WebElement dd1=driver.findElement(By.id("month"));
		Select sec1=new Select(dd1);
		sec1.selectByVisibleText("Jul");
		
		WebElement dd2=driver.findElement(By.id("year"));
		Select sec2=new Select(dd2);
		sec2.selectByVisibleText("1986");
		
		driver.findElement(By.xpath("//input[@name='sex']/parent::span")).click();
		
		

	}

}
