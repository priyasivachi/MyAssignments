package selenium.marathan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//open the web site book my show
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();
		
		//Type the city as "chennai"
		driver.findElement(By.xpath("//span [text()='Chennai']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Bakasuran (UA)')]")).click();
		//Favorite movie
		
		//Print the name of the theater displayed first
		String text1=driver.findElement(By.xpath("//a[@class='__venue-name']")).getText();
		System.out.println("The Theatre name  is " + " "+text1);
		
		//info of the theater
		driver.findElement(By.xpath("//a[@class='__venue-name']")).click();
		//parking facility
		driver.findElement(By.xpath("//div[text()='Details']")).click();
		
		WebElement parking =driver.findElement(By.xpath("//div[text()='            Parking Facility        ']"));
		
		
		if(parking.isEnabled())
		{
			System.out.println("PArking is avaialble");
			
		}
		
		//close the theatre pop up
		driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		 
		 //first green available timing
		 
		//driver.findElement(By.xpath("(//a[@data-session-id='AGSM_19166']//div)[3]/preceding::div[1]")).click();
		
		//
		
		driver.findElement(By.xpath("(//a[@class='showtime-pill time_vrcenter data-enabled'])[2]")).click();
		
	
		//Accept the popup button
		 driver.findElement(By.xpath("//div[@id='btnPopupAccept']")).click();
	
		
		
		//choose seat and click seats
		driver.findElement(By.xpath("//ul[@id='popQty']//li[1]")).click();
		
		//Click the select seats
		driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
		
		//choose available ticket
		driver.findElement(By.xpath("//div[@id='C_7_0111']/a")).click();
		
		//click pay button
		driver.findElement(By.xpath("//a[@id='btmcntbook']/span[1]")).click();
		 
		
		
		//print the subtotal
		
	/*String subtotal = driver.findElement(By.xpath("//div[@class='_total-section amt-payable']//span[1]")).getText();
	8
		{
		
			
			System.out.println("The subtotal is" +  subtotal );
		}*/
		
		WebElement subtotal = driver.findElement(By.xpath("//span[text()='Rs. 212.30']"));
		{
			System.out.println("The  price  is"+  " " + subtotal.getText());
		}
		
}
			
		
		
	}

	
	


