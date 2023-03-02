package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundCheckBox {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.leafground.com/checkbox.xhtml");
	
//Click Basic Checkbox
		driver.findElement(By.xpath("(//span[@class='ui-chkbox-label'])[1]")).click();
		
//Click Notification Checkbox		
		driver.findElement(By.xpath("(//span[@class='ui-chkbox-label'])[2]")).click();
		
//Choose your favorite language(s)
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget']//div)[2]")).click();
		driver.findElement(By.xpath("//label[text()='Javascript']")).click();
		
//Tri State Checkbox		
		//driver.findElement(By.xpath("//input[@id='j_idt87:ajaxTriState_input']")).click();
		
//Toggle Switch		
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		
//Verify if check box is disabled		
		boolean enabled=driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']")).isEnabled();
		if(enabled)
		{
			System.out.println("This text box is disabled");
		}
		else
		{
			System.out.println("This text box is not disabled");
			
			}
		
	driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
	driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
	driver.findElement(By.xpath("(//label[text()='Rome'])[2]")).click();
	
	
	
	}
	
}
