package Week5.Day1.LeafTaps.TestNg.DynamicData.Practice;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificationsTestNg {
	public ChromeDriver driver;
	public String excelfilename;
	@Parameters({"url", "username" ,"password"})
	
	@BeforeMethod
	public void openBrowser(String url,String uname,String pwd) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--remote-allow-origins=*");
		   driver = new ChromeDriver(options);
//Webbrowser
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

	}
	
@AfterMethod
	public void closeBrowser() {
	driver.close();

	}
@DataProvider
public String[][] sendData() throws IOException
{
	String[][] data=ReadExcel.getdata(excelfilename);
	return data;
}
}
