package ActionsCLass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	Actions act=new Actions(driver);
	Thread.sleep(2000);
	WebElement source = driver.findElement(By.id("box6"));
	WebElement target = driver.findElement(By.xpath("//div[text()='Italy']"));
	Thread.sleep(2000);
	//act.dragAndDrop(source, target).build().perform();
	act.clickAndHold(source).moveToElement(target).release().build().perform();
}
}
