package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClaimsPage {
	public WebDriver driver;

	private By claimslInk = By.xpath("//span[@class='i-cmp-primary-nav-button__label' and text()='Claims']");

	public ClaimsPage(WebDriver driver) {

		this.driver = driver;
	}

	public void clickonclaimsLink() {

		driver.findElement(claimslInk).click();
	}

}
