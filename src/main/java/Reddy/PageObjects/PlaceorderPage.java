package Reddy.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractClass.AbstractComponent;

public class PlaceorderPage extends AbstractComponent {
	WebDriver driver;

	public PlaceorderPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'Place Order')]")
	WebElement place;

	public void place() {
		place.click();
	}
}
