package SelectCLass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaleElementException {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement digitel_download = driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]"));
	if(digitel_download.isDisplayed()) {
		System.out.println("my script is successfull.....");
		digitel_download.click();
		Thread.sleep(2000);
		WebElement sort_by = driver.findElement(By.id("products-orderby"));
		Select s = new Select(sort_by);
		List<WebElement> options = s.getOptions();
		int i=0;
		for (WebElement web : options) {
			s.selectByIndex(i++);
			Thread.sleep(1000);
			sort_by = driver.findElement(By.id("products-orderby"));
			s = new Select(sort_by);
		}
	}
	else
	System.out.println("my script is unsuccessfull.......");
}
}
