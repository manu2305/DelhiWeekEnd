package SelectCLass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetoptionsMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/QSP1/Downloads/demo.html");
			WebElement single_dropDownMenu = driver.findElement(By.id("standard_cars"));
			Select s_ref = new Select(single_dropDownMenu);
			List<WebElement> cars = s_ref.getOptions();
			System.out.println(cars);
			int i=0;
			for (WebElement web : cars) {
				//s_ref.selectByIndex(i++);
				web.click();
				Thread.sleep(1000);
			}
}
	}
