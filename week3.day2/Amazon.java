package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
//open the website
driver.get("https://www.amazon.in/");
//search mobile
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles",Keys.ENTER);

List<WebElement> mobileprice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

List<Integer> allPricesInt = new ArrayList<Integer>();

for(WebElement each :mobileprice) {
	String text = each.getText().replaceAll(",", "");
	if(!text.isEmpty()) {
	int text2 = Integer.parseInt(text);
	allPricesInt.add(text2);
	}

}

Collections.sort(allPricesInt);

System.out.println(allPricesInt.get(0));




	}

}
