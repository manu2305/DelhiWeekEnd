package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UseTheWebElement {
@Test
public void search() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	DwsHomePage data=new DwsHomePage(driver);
//	data.search_field.sendKeys("My beautifull guys");
//	data.search_button.click();
	data.search_field("My beautifull guys");
	data.search_click();
}
}
