package Loactors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
public static void main(String[] args) {
	//open The Browser
	WebDriver driver=new ChromeDriver();
	//maximize the window
	driver.manage().window().maximize();
	//enter into Dws
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Pen");
	driver.findElement(By.cssSelector("input[value='Search']")).click();
	driver.close();
	
}
}
