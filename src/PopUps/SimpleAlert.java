package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	Alert art = driver.switchTo().alert();
	art.accept();
}
}
