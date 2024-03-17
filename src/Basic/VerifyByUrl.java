package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByUrl {
public static void main(String[] args) {
	String given_Url="https://demowebshop.tricentis.com/";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	String current_url = driver.getCurrentUrl();
	if(given_Url.equalsIgnoreCase(current_url)) {
		System.out.println("iam in DWS page");
		driver.close();
	}
	else
		System.out.println("iam not in DWs page");
	
	
}
}
