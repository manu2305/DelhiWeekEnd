package Loactors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {
public static void main(String[] args) {
	//open the browser
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//enter into the dws page
		driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.name("q")).sendKeys("Books");
		driver.findElement(By.id("small-searchterms")).sendKeys("Books");
}
}
