package Week4.Day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Nykaa website
		driver.get("https://www.nykaa.com/");
		
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
	    Actions builder=new Actions(driver);
		builder.moveToElement(brands).perform();	
		
		driver.findElement(By.xpath("//div[@id='scroller-container']/div[7]/a[1]")).click();
		WebElement title = driver.findElement(By.xpath("(//h1[@class='css-mrgb7e'])[1]"));
		System.out.println("the title is" + " " + title.getText());
		
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		driver.findElement(By.xpath("(//label[@for='radio_customer top rated_undefined']//div)[2]")).click();
		
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("(//span[@class='filter-name '])[2]")).click();
		driver.findElement(By.xpath("(//div[@class=' css-b5p5ep']/span)[1]")).click();
		driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[1]")).click();
		
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		System.out.println("siva");
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
	
		
		String filterName = driver.findElement(By.className("filter-value")).getText();
		if(filterName.equals("Shampoo"))
		{
			System.out.println("Correct filter is applied: "+filterName);
		}
		else
		{
			System.out.println("Correct filter is not applied: "+filterName);
		}
		
		driver.findElement(By.xpath("//div[contains(text(),'Paris Colour Protect Shampoo')]")).click();
		
		String parentWindow = driver.getWindowHandle();
		Set<String> childWindow = driver.getWindowHandles();
		List<String> windowList=new ArrayList<String>(childWindow);
		driver.switchTo().window(windowList.get(1));
		
		
		driver.findElement(By.xpath("(//span[@class=' css-d3w64v'])[1]")).click();
		String MRP = driver.findElement(By.xpath("(//span[@class='css-1jczs19'])[1]")).getText();
		System.out.println("The Price is" + MRP);
		
		driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
		driver.findElement(By.xpath("//button[@class='css-g4vs13']")).click();
		
		driver.switchTo().frame(0);
		String grandTotal = driver.findElement(By.xpath("(//span[@color='#001325'])[2]")).getText();
		System.out.println("total amount is" +grandTotal );
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		//driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//button[@class='close-btn']")).click();
		
		//16) Click on Continue as Guest //It doesnt work for me. Application Error
				driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
	}

}
