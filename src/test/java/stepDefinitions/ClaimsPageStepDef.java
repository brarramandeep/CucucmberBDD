package stepDefinitions;

import io.cucumber.java.en.When;
import pageObjects.ClaimsPage;
import utils.TestContextSetUp;

public class ClaimsPageStepDef {
	TestContextSetUp testContextSetUp;
	ClaimsPage claimsPage;

	public ClaimsPageStepDef(TestContextSetUp testContextSetUp) {
		this.testContextSetUp = testContextSetUp;
		claimsPage=testContextSetUp.pageObjectManager.getClaimsPage();
	}

	

	@When("^(.+), the user clicks on the Claims link.$")
	public void in_the_home_page_the_user_clicks_on_the_claims_link(String pageName) {
		
		claimsPage.clickonclaimsLink();
		
	}

}
