package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarForAgoda {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.agoda.com/");
	Thread.sleep(7000);
	driver.findElement(By.xpath("//button[@aria-label='Close Message']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@data-element-name='prominent-app-download-floating-button']"));
	Thread.sleep(2000);
	driver.findElement(By.id("check-in-box")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[@data-selenium-date='2024-03-23']")).click();
	Thread.sleep(1000);
	for (;;) {
	try {
		driver.findElement(By.xpath("//div[@aria-label='Tue Jul 23 2024']")).click();
		break;
	} catch (Exception e) {
		driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
	}
	}
	
}
}
