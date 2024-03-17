package Parameters;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterBasic {
@Parameters({"url","url1"})
@Test
public void dws1(String dUrl,String dUrl1) {
	//open the browser
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.navigate().to(dUrl);
	driver.get(dUrl1);
	driver.quit();
}
@Parameters("url")
@Test()
public void dws2(String dUrl) {
	//open the browser
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.navigate().to(dUrl);
	driver.quit();
}
@Parameters("url")
@Test
public void dws3(String dUrl) {
	//open the browser
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.navigate().to(dUrl);
	driver.quit();
}
@Parameters("url")
@Test
public void dws4(String dUrl) {
	//open the browser
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.navigate().to(dUrl);
	driver.quit();
}
@Parameters("url")
@Test
public void dws5(String dUrl) {
	//open the browser
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.navigate().to(dUrl);
	driver.quit();
}
}
