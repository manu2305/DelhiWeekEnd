package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByUsingWebElement {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement digitel_download = driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]"));
	if(digitel_download.isDisplayed()) {
		System.out.println("my script is successfull.....");
	}
	else
	System.out.println("my script is unsuccessfull.......");
}
}
