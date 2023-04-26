package Week5.Day1.LeafTaps.TestNg.Practice;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificationsTestNg {
	ChromeDriver driver;
	@BeforeMethod
	public void openBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--remote-allow-origins=*");
		   driver = new ChromeDriver(options);

	
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		

	}
@AfterMethod
	public void closeBrowser() {
	driver.close();

	}
}
