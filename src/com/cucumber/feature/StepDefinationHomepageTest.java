/**
 * 
 */
package com.cucumber.feature;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Hardik
 *
 */
public class StepDefinationHomepageTest {

	@Given("^I want to open MSC Website$")
	public void i_want_to_open_MSC_Website() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Function to open MSC url ");
	}

	@When("^I open it in Chrome browser$")
	public void i_open_it_in_Chrome_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Function to open Chrome browser");
	}

	@Then("^I validate the url$")
	public void i_validate_the_url() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Function to validate the expected URL");
	}
}