package selenium.marathan;



import org.testng.annotations.Test;


import org.testng.annotations.BeforeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;




public class TestCasetestng1SalesForce extends ProjectSpecificMethod {
	
	@BeforeTest
	public void setData() {
		excelfilename="Question";
	}
	@Test(dataProvider = "sendData") 
	
	
	
		public void chatter(String question, String details)
		{
		
		
		//Type content on the search box	
				driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("content");
				
		//click Content link	
				driver.findElement(By.xpath("//p[text()='Salesforce CRM Content']")).click();
				
		//click on chatter tab	
				WebElement chatter = driver.findElement(By.xpath(" //span[text()='Chatter']"));
		//for facing javascript exception
				driver.executeScript("arguments[0].click();",chatter);
				
		//click question tab
				driver.findElement(By.xpath("//span[text()='Question']")).click();
				
				System.out.println("title is"+ chatter.getText());
				if(chatter.getText().contains("Chatter"))
				{
					System.out.println("Title confirmed");
				}
				else
				{
					System.out.println("Title mismatch");
				}
				
		//Question tag
				WebElement questionTag = driver.findElement(By.xpath("//textarea[@role='textbox']"));
				 questionTag.clear();
				 questionTag.sendKeys(question);
				 
				 
				 
				 WebElement questionConfirmed = driver.findElement(By.xpath("(//span[@class='uiOutputText'])[3]"));
				 System.out.println(questionConfirmed.getText() );
				 if(questionConfirmed .getText().contains("What is your problem"))
				 {
					 System.out.println("Questions match");
				 }
				 
				 else
				 {
					 System.out.println("Questions not match");
				 }
				
		//details tag
				driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys(details);
				
	    //click ask
				driver.findElement(By.xpath("//button[text()='Ask']")).click();
				
		

}
}