package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.skillrary.com/");
	JavascriptExecutor js=(JavascriptExecutor) driver;
//	js.executeScript("window.scrollBy(0,1500);");
//	js.executeScript("window.scrollBy(0,-1000);");
	js.executeScript("window.scrollTo(0,1500);");
	js.executeScript("window.scrollTo(0,-1000);");
}
}
