package selenium.marathan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//open the website
		driver.get("https://www.amazon.in/");
		
		//enter bag and search
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags");
	
		
		//Bags for boys
		driver.findElement(By.xpath("//span[text()=' for boys']")).click();
		
		//Print total no of bags
		WebElement totalnoofBags = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
		{
			
			System.out.println(totalnoofBags.getText()) ;
			
		}
		//Choose the brand
		driver.findElement(By.xpath("//li[@id='p_89/Safari']/span[1]/a[1]/span[1]")).click();
		
		driver.findElement(By.xpath("//li[@id='p_89/American Tourister']/span[1]/a[1]/span[1]")).click();
		
		
		driver.findElement(By.xpath("//span[@class='a-dropdown-label']")).click();
		
		driver.findElement(By.xpath("(//a[@class='a-dropdown-link'])[4]")).click();
		
		//Bag Brand Name
		WebElement brandName = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]"));
		{
			System.out.println("The brandname is"+  " " +brandName.getText());
		}
		//Bag's discounted price
		WebElement discountPrice = driver.findElement(By.xpath("//span[@class='a-price-symbol']/following-sibling::span"));
		{
			System.out.println("The disocunted price  is"+  " " +discountPrice.getText());
		}
		 //get the title
		String title=driver.getTitle();
		System.out.println("Title is" + title);
		
		driver.close();
		

			
		
		

		
	
		
		
			
		
		
		
		
	}
}
