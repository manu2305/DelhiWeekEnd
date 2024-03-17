package Parameters;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	WebDriver driver;
	
	@Parameters("browser")
	@Test()
	public void dws2(String dUrl) {
		//open the browser
		if(dUrl.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
		}
		else if (dUrl.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		} else {
			driver=new FirefoxDriver();
		}
	}
}
