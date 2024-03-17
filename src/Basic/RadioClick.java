package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioClick extends BaseCLass {
public static void main(String[] args) throws InterruptedException {
	preCondition();
	driver.get("https://demowebshop.tricentis.com/");
//	driver.findElement(By.id("pollanswers-1")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.id("pollanswers-2")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.id("pollanswers-3")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.id("pollanswers-4")).click();
	List<WebElement> community_poll = driver.findElements(By.cssSelector("input[type='radio']"));
	for (WebElement web : community_poll) {
		web.click();
		Thread.sleep(2000);
	}
}
}
