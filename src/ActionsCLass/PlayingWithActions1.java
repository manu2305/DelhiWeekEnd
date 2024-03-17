package ActionsCLass;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PlayingWithActions1 {
public static void main(String[] args) throws InterruptedException {
	//open the browser
		ChromeDriver driver=new ChromeDriver();
		//maximize 
		driver.manage().window().maximize();
		//enter into dws
		driver.navigate().to("https://demowebshop.tricentis.com/");
		System.out.println(driver.getWindowHandle());
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='header-links']/ul/li/a"));
		Actions act = new Actions(driver);
		for (WebElement web : links) {
			act.keyDown(Keys.SHIFT).click(web).build().perform();
			Thread.sleep(2000);
		}
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
//		act.keyDown(Keys.PAGE_DOWN).build().perform();
//		Thread.sleep(5000);
//		driver.quit();
}
}
