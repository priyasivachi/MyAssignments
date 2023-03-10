package Week4.Day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeafGroundWindows {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//open the URL
			driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
	
		//Click and Confirm new Window Opens
			driver.findElement(By.id("j_idt88:new")).click();
			String ParentWindow = driver.getWindowHandle();
			System.out.println("The parent window is" + driver.getTitle());
			Set<String> ChildWindows = driver.getWindowHandles();
			List<String> WindowLists=new ArrayList<String>(ChildWindows);
			String windows1 = WindowLists.get(1);
			driver.switchTo().window(windows1);
			System.out.println("the child window is"+ driver.getTitle());
	
				if(!ParentWindow.equals(windows1))
				{
					System.out.println("New window is opened");
				}
	
				else
				{
					System.out.println("New window is not opened");
				}
				driver.close();
				driver.switchTo().window(ParentWindow);
	
	//Find the number of opened tabs
	
				driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
				Set<String> noOfOpenedTabs = driver.getWindowHandles();
				List<String> NumberOfWindows=new ArrayList<String>(noOfOpenedTabs);
				int size = NumberOfWindows.size();
				System.out.println("The no of opend windows is" + size);
				driver.switchTo().window(ParentWindow);
     
    // Close all windows except Primary
     
				driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
				Set<String> closedWindow = driver.getWindowHandles();
				for (String s : closedWindow) {
					if(!s.equals(ParentWindow)) {
						driver.switchTo().window(s);
						String title = driver.getTitle();
						System.out.println("Closed window title is" + title);
				driver.close();
		}
	}
				driver.switchTo().window(ParentWindow);
				
	//Wait for 2 new tabs to open
				driver.findElement(By.xpath("//span[text()='Open with delay']")) .click();	
				String waittitle = driver.getTitle();
				System.out.println("Wait title is" + waittitle);
				driver.switchTo().window(ParentWindow);
     
	}
}
