package selenium.marathan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.sukgu.Shadow;

public class ServiceNow {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://dev86669.service-now.com/");
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Testleaf@123");
		driver.findElement(By.id("sysverb_login")).click();
		
		Shadow dom = new Shadow(driver);
		dom.setImplicitWait(20);
		WebElement all = dom.findElementByXPath("//div[@class='sn-polaris-tab can-animate polaris-enabled']");
		all.click();
		
		WebElement serviceCatalog = dom.findElementByXPath("//span[text()='Service Catalog']");
		serviceCatalog.click();
		
		WebElement frame = dom.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13']")).click();
		driver.findElement(By.xpath("(//label[@class='radio-label'])[2]")).click();
		driver.findElement(By.xpath("//option[text()='500MB [add $1.00]']")).click();
		driver.findElement(By.xpath("//label[@for='IO:abd0057697968d1021983d1e6253afad_1f8101b697968d1021983d1e6253af4f']")).click();
		driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
		String order= driver.findElement(By.xpath("//div[@class='notification notification-success']")).getText();
		System.out.println(order);
		String requestNo = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
		System.out.println(requestNo);
	}
	
	

}
