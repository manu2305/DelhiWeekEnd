package AssertionMethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertMethods {
@Test
public void dws() {
	String  expected_result="https://demowebshop.tricentis.com";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	String actual_result = driver.getCurrentUrl();
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(expected_result, actual_result,"its not matching");
	System.out.println("Script is Done");
	sa.assertAll();
	sa.assertEquals(expected_result, actual_result);
	
}
}
