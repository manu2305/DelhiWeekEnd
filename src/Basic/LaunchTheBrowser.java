package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTheBrowser {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.spicejet.com/");
	driver.close();
}
}
