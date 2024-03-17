package ActionsCLass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys {
public static void main(String[] args) {
	//open the browser
			ChromeDriver driver=new ChromeDriver();
			//maximize 
			driver.manage().window().maximize();
			//enter into dws
			driver.navigate().to("https://demowebshop.tricentis.com/");
			WebElement search_field = driver.findElement(By.id("small-searchterms"));
			Actions act=new Actions(driver);
			act.moveToElement(search_field).click().sendKeys("Mahir Tshirt it is not for sale ").perform();
			act.keyDown(Keys.TAB).keyDown(Keys.ENTER).build().perform();
}
}
