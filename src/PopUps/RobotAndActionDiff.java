package PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotAndActionDiff {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Robot rbt = new Robot();
	Thread.sleep(1000);
	rbt.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	rbt.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	rbt.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	rbt.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	rbt.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	rbt.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	rbt.keyPress(KeyEvent.VK_M);
	rbt.keyPress(KeyEvent.VK_A);
	rbt.keyPress(KeyEvent.VK_N);
	rbt.keyPress(KeyEvent.VK_U);
	
	rbt.keyRelease(KeyEvent.VK_TAB);
	rbt.keyRelease(KeyEvent.VK_M);
	rbt.keyRelease(KeyEvent.VK_A);
	rbt.keyRelease(KeyEvent.VK_N);
	rbt.keyRelease(KeyEvent.VK_U);
	
}
}
