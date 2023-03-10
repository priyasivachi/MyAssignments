package Week4.Day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class buyTheValue {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://buythevalue.in/");
		driver.findElement(By.xpath("(//div[@class='product-content']//a)[1]")).click();
		
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//button[contains(@class,'CloseButton')]")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//input[@id='wk_zipcode']")).sendKeys("600008",Keys.TAB,Keys.ENTER);
		driver.findElement(By.id("product-add-to-cart")).click();
		driver.findElement(By.xpath("(//a[text()='View Cart'])[2]")).click();
		driver.findElement(By.id("checkout")).click();
	

		
		
	}
}