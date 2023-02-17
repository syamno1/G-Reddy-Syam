package Reddy.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractClass.AbstractComponent;

public class SearchPage extends AbstractComponent {
	WebDriver driver;

	public SearchPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@class='_3704LK']")
	WebElement type;

	public void send() {
		type.sendKeys("ipad");

	}

	public void suggest() {
		waitforElementToAppear(By.cssSelector(".lrtEPN"));
		List<WebElement> options = driver.findElements(By.cssSelector(".lrtEPN"));
		WebElement select = options.stream().filter(o -> o.findElement(By.tagName("span")).getText().equals("ipad"))
				.findFirst().orElse(null);
		select.findElement(By.cssSelector(".r85cly")).click();
	}
}
