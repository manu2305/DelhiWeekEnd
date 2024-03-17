package AssertionMethods;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HardAssertMethods {
@Test
public void dws() {
	String  expected_result="https://demowebshop.tricentis.com";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	String actual_result = driver.getCurrentUrl();
	assertEquals(expected_result, actual_result,"output is not match");
	assertNotEquals(expected_result, actual_result);
	//WebElement community_pool = driver.findElement(By.id("pollanswers-1"));
	//community_pool.click();
	//assertTrue(community_pool.isSelected());
	System.out.println("my script is successfull....");
	driver.quit();
	
}
}
