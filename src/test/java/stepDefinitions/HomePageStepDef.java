package stepDefinitions;

import java.util.List;

//4.29   5 lakh:40    at end cash value: min     max:

//3.83   5 lakh:103    72000 at end cash value: 75 : 1.64 cash value   85: 4.16   75:3.14  65:4.0   

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import utils.TestContextSetUp;

public class HomePageStepDef {

	TestContextSetUp testContextSetUp;
	public HomePage homePage;

	public HomePageStepDef(TestContextSetUp testContextSetUp) {
		this.testContextSetUp = testContextSetUp;
		homePage=testContextSetUp.pageObjectManager.getHomePage();

	}

	

	@Given("^the user log into the application and select (.+) as Province$")
	public void the_user_log_into_the_application_and_select_as_province(String province) {


		
		
		

//		homePage.selectProvince(province);
		homePage.confirmCookie();
//		homePage.confirmProvinceButton();
	}

	@Then("^(.+), the user assert that the text message (.+) is displayed in the page$")
	public void the_user_assert_that_the_text_message_is_displayed_in_the_page(String pageName, String message) {
		homePage.assertIntactMessage(message);
	}

	@Given("User Navigates to the application")
	public void Navigates() {
		System.out.println("Navigated to the Url");

	}

	@Given("the user is on Landing page")
	public void the_user_is_on_landing_page() {

		System.out.println("user is on the Landing Page ");
	}

	@When("User clicks on the Personal Link")
	public void user_clicks_on_the_personal_link() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on the Vehicle Insurance Link")
	public void user_clicks_on_the_vehicle_insurance_link() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("the user assert that the message {string} is displayed in the page")
	public void the_user_assert_that_the_message_is_displayed_in_the_page(String message) {

		System.out.println("The Message is printed" + message);

	}

	@Then("^the user assert that regex is working when sending data (.+)$")
	public void the_user_assert_that_regex_is_working_when_sending_data(String string) {
		// Write code here that turns the phrase above into concrete actions

	}

	@Given("the user fills the registeration form")
	public void the_user_fills_the_registeration_form(List<Object> data) {

		System.out.println("The FirstName is" + data.get(0));
		System.out.println("The LastName is " + data.get(1));
		System.out.println("The PhoneNumber is " + data.get(2));
		System.out.println("The Email is" + data.get(3));

	}

}
