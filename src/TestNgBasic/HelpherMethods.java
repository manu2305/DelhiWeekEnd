package TestNgBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HelpherMethods {
	@Test(priority = 2)
	public void easyMyTrip() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		driver.close();
		Reporter.log("easyMtTrip",true);
	}
	@Test(priority=1,invocationCount = 2,threadPoolSize = 1)
	public void redBus() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.close();
		Reporter.log("RedBus",true);
	}
	@Test(priority = 0)
	public void indiaMart() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.indiamart.com/");
		driver.close();
		Reporter.log("indiaMart",true);
	}
}
