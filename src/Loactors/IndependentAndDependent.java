package Loactors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentAndDependent {
public static void main(String[] args) {
	String given_url="https://demowebshop.tricentis.com/digital-downloads";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/digital-downloads");
	//String[]value= {"jmani","mani"};
	String[]value=new String[5];
	value[0]="";
	if(given_url.equalsIgnoreCase(driver.getCurrentUrl())) {
		System.out.println("entering into digitel page is successfull");
		WebElement price = driver.findElement(By.xpath("(//a[text()='Music 2'])[2]/../../div[3]/div/span"));
		System.out.println(price.getText());
	}
	else {
		System.out.println("entering into digitel page is unsuccessfull");
	}
 	
}
}
