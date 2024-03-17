package Loactors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedText {
public static void main(String[] args) throws InterruptedException {
	//open the browser
			WebDriver driver=new ChromeDriver();
			//maximize
			driver.manage().window().maximize();
			//enter into the dws page
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(3000);
			//driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.partialLinkText("Shopping")).click();
			
}
}
