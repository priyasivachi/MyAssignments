package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/button.xhtml");
		
		//Click and Confirm title.
		driver.findElement(By.name("j_idt88:j_idt90")).click();
		String title=driver.getTitle();
		System.out.println(title);
		if(title.contains("Dashboard"))
		{
			System.out.println("Title is confirmed");
		}
		driver.navigate().back();
		
		//Confirm if the button is disabled.
		
		boolean enabled=driver.findElement(By.name("j_idt88:j_idt92")).isEnabled();
		if(enabled==false)
		{
			System.out.println("This text box is disabled");
		}
		//Find the position of the Submit button

	 Point location = driver.findElement(By.name("j_idt88:j_idt94")).getLocation();
	System.out.println("location is" + " "+ location);
		
	}
	
	
	

}
