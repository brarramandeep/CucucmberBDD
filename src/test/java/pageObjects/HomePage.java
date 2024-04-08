package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage {

	public WebDriver driver;
	// we are making these private as only these classes can modify it only methods
	// are oublic to other classes and these methods use these private objectss
	// now others clasases cannot view these private objects but they can use these
	// methods.
	private By provinceDropdownList = By.xpath("//*[@class='i-cmp-province-selector__body'][1]/ul/li/label/span[2]");

	private By confirmCookie = By.xpath("//button[@class='ic-button ic-button--style--tertiary-inverse']");
	private By confirmProvinceButton = By.xpath("//*[text()='Confirm'][1]");
	private By intactMessage = By.xpath("//*[@class='i-hero-banner__title']/div");

	public HomePage(WebDriver driver) {

		this.driver = driver;
	}

	public void selectProvince(String province) {

		for (WebElement ele : driver.findElements(provinceDropdownList)) {
			if (ele.getText().equalsIgnoreCase(province)) {
				ele.click();
				break;

			}

		}

	}

	public void confirmCookie() {
		driver.findElement(By.xpath("//button[@class='ic-button ic-button--style--tertiary-inverse']")).click();

	}

	public void confirmProvinceButton() {
		driver.findElement(confirmProvinceButton).click();

	}

	public void assertIntactMessage(String message) {

		String actualMessage = driver.findElement(intactMessage).getText();

		Assert.assertEquals(actualMessage, message);

	}

}