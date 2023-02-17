package Flipkart.ReddySyam;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Reddy.PageObjects.CheckoutPage;
import Reddy.PageObjects.LandingPage;
import Reddy.PageObjects.LoginPage;
import Reddy.PageObjects.PlaceorderPage;
import Reddy.PageObjects.SearchPage;
import Reddy.PageObjects.productpage;
import Reddy.TestComponents.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAlonetest extends BaseTest {

	@Test
	public void order() throws InterruptedException {

		LandingPage lp = new LandingPage(driver);
		lp.goTo();
		SearchPage sp = new SearchPage(driver);
		sp.send();
		sp.suggest();
		productpage pp = new productpage(driver);
		pp.filter();
		Thread.sleep(2000);
		pp.selectproduct();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String ParentId = it.next();
		String ChildId = it.next();
		driver.switchTo().window(ChildId);
		CheckoutPage cp = new CheckoutPage(driver);
		cp.add();
		String proname = cp.items();
		System.out.println(proname);
		PlaceorderPage PoP = new PlaceorderPage(driver);
		PoP.place();
		LoginPage Logp = new LoginPage(driver);
		Logp.credentials("syamcherry4@gmail.com", "9885852338");
		Boolean match = Logp.Display();
		System.out.println(match);

	}

}
