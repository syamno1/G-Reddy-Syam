package Reddy.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractClass.AbstractComponent;

public class LoginPage extends AbstractComponent {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='text']")
	WebElement Email;
	@FindBy(xpath = "//span[contains(text(),'CONTINUE')]")
	WebElement continuee;
	@FindBy(xpath = "(//input)[2]")
	WebElement Mobile;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;
	@FindBy(xpath = "//div[@class='_3Vt5_3']")
	WebElement messege;

	public void credentials(String email, String mobile) {
		Email.sendKeys(email);
		continuee.click();
		Mobile.sendKeys(mobile);
		submit.click();
	}

	public Boolean Display() {
		return messege.isDisplayed();
	}
}
