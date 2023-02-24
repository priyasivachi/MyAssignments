package selenium.marathan;


import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver rb =new ChromeDriver();
		rb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		rb.manage().window().maximize();
		//open the URL
		rb.get("https://www.redbus.in/");
		
		//Type chennai and select first one
		rb.findElement(By.id("src")).sendKeys("Chennai");
		rb.findElement(By.xpath("//li[text()='Chennai']/following-sibling::li")).click();
		
		
		//Type bangalore and select the first option
		rb.findElement(By.id("dest")).sendKeys("Bangalore");

		//rb.findElement(By.xpath("//li[@class='selected']/i")).click();
		rb.findElement(By.xpath("//li[text()='Anand Rao Circle, Bangalore']/preceding-sibling::li[1]")).click();
		
		
		//select the day
		rb.findElement(By.id("onward_cal")).click();
		
		rb.findElement(By.xpath("//td[@class='wd day'][1]")).click();
		
		
		//click search buses
		rb.findElement(By.id("search_btn")).click();
		
		//Print the no of bus found

		String text=rb.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("No of Bus" + text);
		
		//Clcik sleeper
		
		rb.findElement(By.xpath("//label[@title='SLEEPER']")).click();
		
		
		//Print the no of bus found
		String text1=rb.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("No of sleeper Bus" + text1);
		
		//get Title
		String title=rb.getTitle();
		System.out.println(title);
		
		
		
		
		 
	}

}
