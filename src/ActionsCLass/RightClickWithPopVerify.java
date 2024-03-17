package ActionsCLass;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickWithPopVerify {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	Actions act=new Actions(driver);
	Thread.sleep(2000);
	WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));
	Thread.sleep(2000);
	//act.moveToElement(right_click).contextClick().build().perform();
	act.contextClick(right_click).build().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Paste']")).click();
	Thread.sleep(2000);
	try {
		right_click.click();
		System.out.println("my script is unsuccessfull....");
	}
	catch (UnhandledAlertException e) {
		System.out.println("my script is successfull......");
	}
	}
}
