package week2.day2;

import java.time.Duration;

//import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

public class LeafGroundInput {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/input.xhtml");
		
		
	//TYPE YOUR NAME
		driver.findElement(By.xpath("(//div[@class='col-12']/input[1])")).sendKeys("Dharsini");
		
	//Append Country to this City.
		driver.findElement(By.xpath("(//div[@class='col-12']/input)[2]")).sendKeys("USA");
		
	//Verify if text box is disabled
		boolean enabled=driver.findElement(By.xpath("(//div[@class='col-12']/input)[3]")).isEnabled();
		if(enabled==false)
		{
			System.out.println("This text box is disabled");
		}
		
	//Clear the typed text.
		driver.findElement(By.name("j_idt88:j_idt95")).clear();
		
	//Retrieve the typed text.
		String typedtext=driver.findElement(By.name("j_idt88:j_idt97")).getAttribute("value");
		System.out.println(typedtext);
		
	//Type email and Tab. Confirm control moved to next element.
	    driver.findElement(By.name("j_idt88:j_idt99")).sendKeys("aaa@gmail.com",Keys.TAB);
	 
	// Type about yourself
	    driver.findElement(By.xpath("(//div[@class='col-12']/textarea)")).sendKeys("I am a Software Quality analyst")	;
	
	//Text Editor
	    driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[1]")).sendKeys("I am a selenium Automation Tester");
		
	///Just Press Enter and confirm error message*
	    driver.findElement(By.xpath("//div[@class='col-12 mb-2 lg:col-8']/input")).sendKeys(Keys.ENTER);
	    WebElement errorMessage = driver.findElement(By.xpath("//span[@class='ui-message-error-detail']"));
	    System.out.println("Error message is" + " " + errorMessage.getText());
	    
	//Click and Confirm Label Position Changes
	    WebElement labelPosition = driver.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all'])[3]"));
	    Point location = labelPosition.getLocation();
	    labelPosition.click();
	    Point location2 = labelPosition.getLocation();
	    if(!location.equals(location2))
	    {
	    System.out.println("position changed");
	    }
	    else
	    {
	    	System.out.println("position not changed");
	    }
	//Type your name and choose the third option
	    
	WebElement nameType = driver.findElement(By.xpath("//input[@name='j_idt106:auto-complete_input']"));
	nameType.sendKeys("Siva");
	Thread.sleep(2000);
	WebElement option = driver.findElement(By.xpath("(//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all'])[3]"));
	Actions builder=new Actions(driver);
	builder.moveToElement(option).perform();
	Thread.sleep(3000);
	for(int i=0;i<3;i++)
	{
		nameType.sendKeys(Keys.DOWN);
		
	}
	
	nameType.sendKeys(Keys.ENTER);
	//Click and Confirm Keyboard appears
	    driver.findElement(By.xpath("//input[@class='ui-inputfield ui-keyboard-input ui-widget ui-state-default ui-corner-all is-keypad']")).click();
	    System.out.println("Keyboard appears");
	
	//Custom Toolbar
	    driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[2]")).sendKeys("I am going to be a Selenium Automation Tester");
	

	}

}
