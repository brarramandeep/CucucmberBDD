package pageObjects;

import org.openqa.selenium.WebDriver;

//we have created this PageObjectManager class to get all the page objects that we need in step def so that we can avoid createing
//page objects directly in stef def classes and each page object will need a driver and we are here passing driver from this constructor 
// and this constructor will get the driver from testContext class as we are using dependency injection for this as well

public class PageObjectManager {
	public WebDriver driver;
	PageObjectManager  PageObjectManager;
	HomePage homePage;
	ClaimsPage claimsPage;
	CommonsPage commonsPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public HomePage getHomePage() {
		
		homePage=new HomePage(driver);
		return homePage;
		
	}
	
public ClaimsPage getClaimsPage() {
		
		claimsPage=new ClaimsPage(driver);
		return claimsPage;
		
	}

public CommonsPage getCommonsPage() {
	commonsPage=new CommonsPage(driver);
	return commonsPage;
	
}
	
	
	
	

}
