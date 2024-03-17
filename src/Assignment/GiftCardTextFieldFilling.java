package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GiftCardTextFieldFilling {
	public static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	
	String given_title="Demo Web Shop. $25 Virtual Gift Card";
    driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	Thread.sleep(2000);
	String current_title = driver.getTitle();
	if(given_title.contains(current_title)) {
		System.out.println("entering in gift card page is successfull");
		List<WebElement> g_values = driver.findElements(By.xpath("//div[@class='giftcard']/div/input"));
		iterate1(g_values);
	}
	else {
		System.out.println("entering in an gift card is unsuccessfull....");
		driver.close();
	}
	
}
public static void iterate1(List<WebElement> values) {
	String[]value= {"manu","jmani2305@gmail.com","mj","mj@gmail.com"};
	int i=0;
	for (WebElement web : values) {
		web.sendKeys(value[i++]);
	}
}

}
