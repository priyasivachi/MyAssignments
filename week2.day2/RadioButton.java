package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
		driver.findElement(By.xpath("//label[text()='Bengaluru']")).click();
		driver.findElement(By.xpath("(//label[text()='Firefox'])[2]")).click();
		driver.findElement(By.xpath("//label[text()='1-20 Years']")).click();
		
		
	}

}
