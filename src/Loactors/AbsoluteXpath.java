package Loactors;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
public static void main(String[] args) throws InterruptedException {
	//open the browser
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
//	driver.findElement(By.xpath("html/body/div[4]/div/div/div[2]/div/ul/li[1]/a")).click();
	Thread.sleep(2000);
	List<WebElement> links = driver.findElements(By.xpath("html/body/div[4]/div/div/div[2]/div/ul/li/a"));
	System.out.println(links);
//	for (WebElement web : links) {
//		web.click();
//		driver.navigate().back();
//		Thread.sleep(2000);
//	}
//	for (int i = 0; i <links.size(); i++) {
//		links.get(i).click();
//		driver.navigate().back();
//	}
	Iterator<WebElement> li = links.iterator();
	while (li.hasNext()) {
		li.next().click();
		driver.navigate().back();	
	}
	driver.close();
	
}
}
