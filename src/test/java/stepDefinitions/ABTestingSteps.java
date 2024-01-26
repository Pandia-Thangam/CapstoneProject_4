package stepDefinitions;

import functions.ABTestingPage;
import io.cucumber.java.en.Then;

public class ABTestingSteps extends ABTestingPage {
	
	@Then("I validate the AB Testing header")
	public void validateABTesting() {
		validateABTestingHeader();
	}
}
