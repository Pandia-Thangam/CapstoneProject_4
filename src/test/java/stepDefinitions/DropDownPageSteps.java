package stepDefinitions;

import functions.DropDownPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DropDownPageSteps extends DropDownPage {
	
	@When("I select {string} value from Dropdown")
	public void selectDropDownOption(String optionValue) {
		selectedDropDownValue(optionValue);
	}
	
	@Then("I see {string} is selected")
	public void validateIfExpectedOption(String optionValue) throws InterruptedException {
		isDropDownValueSelected(optionValue);
	}
}
