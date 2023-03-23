package selenium.marathan;


import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.DataProvider;




public class ProjectSpecificMethod {
	
	public RemoteWebDriver driver;
	public String excelfilename;
	public String excelname;
	@BeforeMethod
	public void openBrowser()
	{
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		 driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();
		
		//click on App Launcher		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		//Click View All		
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
		
	}
	@DataProvider
	public String[][] sendData() throws IOException  
	{
		String[][] data = ReadExcel.getData(excelfilename);
		return data;
	}
	@DataProvider
		public String[][] sendDataa() throws IOException  
		{
			String[][] data1 = excelInputRead.salesforceData(excelname);
			return data1;
			
		
			
			 
}
}