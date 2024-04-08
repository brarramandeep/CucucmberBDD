package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonsPage {

	public WebDriver driver;
	public By getAQuoteLink = By.xpath("//*[@id='getQuote-bt-desktop-modal']/span");

	public CommonsPage(WebDriver driver) {

		this.driver = driver;
	}

	public void clickOnLink(Object nameObjectName) {

		driver.findElement((By) nameObjectName).click();

	}

}
