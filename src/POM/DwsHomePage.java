package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsHomePage {
	
	public DwsHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath ="//input[@id='small-searchterms']")
WebElement search_field;

@FindBy(xpath = "//input[@type='submit']")
WebElement search_button;
public void search_field(String value) {
	search_field.sendKeys(value);
}
public void search_click() {
	search_button.click();
}
}
