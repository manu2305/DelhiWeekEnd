package Loactors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttributeAndIndex {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	//using , xpath by attribute with the index concept
	//driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("shivani malhotra");
	//driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
}
}
