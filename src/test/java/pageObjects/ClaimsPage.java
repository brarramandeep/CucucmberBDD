package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClaimsPage {
	public WebDriver driver;

	private By claimslInk = By.xpath("//nav[@class='menu__mobile-pages']/ul/li[3]");

	public ClaimsPage(WebDriver driver) {

		this.driver = driver;
	}

	public void clickonclaimsLink() {

		driver.findElement(claimslInk).click();
	}

}
