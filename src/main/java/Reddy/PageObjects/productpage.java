package Reddy.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractClass.AbstractComponent;

public class productpage extends AbstractComponent {
	WebDriver driver;

	public productpage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@class='_10UF8M'])[2]")
	WebElement LowtoHigh;
	@FindBy(xpath = "(//div[@class='_4rR01T'])[1]")
	WebElement product;

	public void filter() {
		LowtoHigh.click();
	}

	public void selectproduct() {

		product.click();
	}
}
