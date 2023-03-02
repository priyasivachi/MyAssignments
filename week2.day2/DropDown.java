package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/select.xhtml");
		
		driver.findElement(By.xpath("//select[@class='ui-selectonemenu']")).click();
		driver.findElement(By.xpath("//option[text()='Selenium']")).click();
		
		driver.findElement(By.xpath("//label[@id='j_idt87:country_label']")).click();
		driver.findElement(By.xpath("//li[@id='j_idt87:country_3']")).click();
		
		driver.findElement(By.xpath("//label[@id='j_idt87:city_label']")).click();
		//driver.findElement(By.xpath("//li[@class='ui-selectonemenu-item ui-selectonemenu-list-item ui-corner-all']")).click();
		
		driver.findElement(By.xpath("//input[@id='j_idt87:auto-complete_input']")).click();
		//driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		
		driver.findElement(By.xpath("//label[@id='j_idt87:lang_label']")).click();
		driver.findElement(By.xpath("//li[@id='j_idt87:lang_2']")).click();
		
		driver.findElement(By.xpath("//label[@id='j_idt87:value_label']")).click();
		
		
		
		
		
	}

}
