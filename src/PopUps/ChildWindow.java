package PopUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {
public static void main(String[] args) throws InterruptedException {
	String given_data="https://www.facebook.com/nopCommerce";
	WebDriver driver=new ChromeDriver();
	//maximize 
	driver.manage().window().maximize();
	//enter into dws
	driver.navigate().to("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	String parent = driver.getWindowHandle();
	driver.findElement(By.xpath("//a[text()='Twitter']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Facebook']")).click();
	Thread.sleep(2000);
	Set<String> childs = driver.getWindowHandles();
	System.out.println(childs);
	for (String str : childs) {
		driver.switchTo().window(str); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
	}
	
}
}
