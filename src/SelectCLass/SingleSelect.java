package SelectCLass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP1/Downloads/demo.html");
		WebElement single_dropDownMenu = driver.findElement(By.id("standard_cars"));
		Select s_ref = new Select(single_dropDownMenu);
		Thread.sleep(2000);
         s_ref.selectByIndex(2);
         Thread.sleep(2000);
         s_ref.selectByVisibleText("Land Rover");
         Thread.sleep(2000);
         s_ref.selectByValue("nin");
}
}
