package TestNgBPG2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Woodland {
	@Test
	public void woodland() {
		WebDriver driver=new ChromeDriver();
		//maximize the Browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//enter into DWS page
		driver.get("https://www.woodlandworldwide.com/");
		driver.quit();
	}
}
