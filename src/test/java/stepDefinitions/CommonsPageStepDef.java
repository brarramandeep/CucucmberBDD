package stepDefinitions;

import io.cucumber.java.en.Given;
import pageObjects.CommonsPage;
import utils.TestContextSetUp;

public class CommonsPageStepDef {

	TestContextSetUp testContextSetUp;
	public CommonsPage commonsPage;

	public CommonsPageStepDef(TestContextSetUp testContextSetUp) {
		this.testContextSetUp = testContextSetUp;
		commonsPage = testContextSetUp.pageObjectManager.getCommonsPage();

	}
	
	@Given("^in the (.+), the user click on the (.+)")
	public void in_the_user_clicks_on_the_link(String pageName,Object NameObjectName) {
		NameObjectName=commonsPage.getAQuoteLink;
		commonsPage.clickOnLink(NameObjectName);
	    
	}

}
