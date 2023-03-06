package Week4.Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		WebElement customerRating = driver.findElement(By.xpath("(//div[@class='a-row a-size-small']//span)[2]"));
		System.out.println("Customer Rating is"+ customerRating.getText());
		driver.findElement(By.xpath("(//a[contains(@class,'a-link-normal s-underline-text')]//span)[3]")).click();
		
		//Window handling to switch one window to another window
		String homeWindow = driver.getWindowHandle();
		Set<String> nextWindow = driver.getWindowHandles();
		List<String> list=new ArrayList<String>(nextWindow);
		driver.switchTo().window(list.get(1));
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		WebElement subTotal = driver.findElement(By.xpath("//span[text()='46,699']"));
		System.out.println("Cart subtotal is" + " " + subTotal.getText());
		driver.close();
	}
}
