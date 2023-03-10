package Week4.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Launch SnapDeal.com
		driver.get("https://www.snapdeal.com/");
		
		//Go To Men's Fashions
		Actions hover=new Actions(driver);
		WebElement menFashion = driver.findElement(By.xpath("(//span[@class='labelIcon']/following-sibling::span)[1]"));
		hover.moveToElement(menFashion).perform();
		
		//Go To Sports Shoes
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		
		//Get The Count of the Sports Shoes
		String text = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("The count is" + text);
		
		//Click Training Shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		
		//Sort Low to High
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
		driver.findElement(By.xpath("//li[@data-index='0']/following-sibling::li[1]")).click();
		
		//Check the items are displayed correctly
		String sortingItems = driver.findElement(By.xpath("//div[@class='sort-selected']")).getText();
		if(sortingItems.contains("Price Low To High"))
				{
			System.out.println("Items displayed are sorted correctly");
				}
		else
		{
			System.out.println("Items displayed are  not sorted correctly");
		}
		
		//Select the price range from 900 to 1200
		driver.findElement(By.name("fromVal")).clear();
		driver.findElement(By.name("fromVal")).sendKeys("900");
		driver.findElement(By.name("toVal")).clear();
		driver.findElement(By.name("toVal")).sendKeys("1200",Keys.ENTER);
		
		//filter with color navy
		driver.findElement(By.xpath("//input[@id='Color_s-Navy']/following-sibling::label[1]")).click();
		
		//Verify all the filters
		Thread.sleep(2000);
		String filtersApplied = driver.findElement(By.xpath("//div[@class='filters']")).getText();
		System.out.println("Filters Applied: "+filtersApplied);
		
		//Mouse hover on First Training shoes
		WebElement trainingShoe = driver.findElement(By.xpath("//div[@class='product-tuple-description ']"));
		hover.moveToElement(trainingShoe).perform();
		
		//Click on quick view button
		driver.findElement(By.xpath("(//div[@supc='SDL901001171'])[2]")).click();
		
		//Print the price and discounted percentage
		String priceAndDiscount = driver.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']")).getText();
		System.out.println("Price and discount Percentage is" + priceAndDiscount );
		
		//close the current window
		driver.findElement(By.xpath("//div[@id='sidebar_modal_right']/div[2]/div[2]/i[1]")).click();
		
		//close the main window
		driver.quit();
		
	}
	

}

		
		
		
