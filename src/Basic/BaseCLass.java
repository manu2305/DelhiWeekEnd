package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseCLass {
	public static WebDriver driver;
public static void preCondition() {
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
}
public static void preCondition1() {
	 driver=new EdgeDriver();
	driver.manage().window().maximize();
}
public static void preCondition2() {
	 driver=new FirefoxDriver();
	driver.manage().window().maximize();
}
public static void postCondition() {
	driver.close();
}
public static void postCondition1() {
	driver.quit();;
}
}
