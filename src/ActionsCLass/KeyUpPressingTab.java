package ActionsCLass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpPressingTab {
public static void main(String[] args) throws InterruptedException {
	//open the browser
	ChromeDriver driver=new ChromeDriver();
	//maximize 
	driver.manage().window().maximize();
	//enter into dws
	driver.navigate().to("https://demowebshop.tricentis.com/");
	Actions act = new Actions(driver);
//	act.keyDown(Keys.TAB).build().perform();
//	Thread.sleep(2000);
//	act.keyDown(Keys.TAB).build().perform();
//	Thread.sleep(2000);
//	act.keyDown(Keys.ENTER).build().perform();
	
	act.keyDown(Keys.TAB).keyDown(Keys.TAB).keyDown(Keys.ENTER).build().perform();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().refresh();

	act.keyUp(Keys.ENTER).build().perform();
	Thread.sleep(2000);
	act.keyUp(Keys.TAB).build().perform();
	
	
}
}
