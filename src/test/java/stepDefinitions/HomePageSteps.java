package stepDefinitions;

import functions.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageSteps extends HomePage {

	@Given("I launch the HeroKuApp")
	public void launchHeroKuApp() throws InterruptedException {
		openApplication();
	}

	@When("I access the AB Testing page")
	public void accessABTesting() {
		navigateToABTesting();
	}

	@When("I navigate back to Home page and access {string}")
	public void navigateToHomeAccessDropDown(String pageValue) {
		navigateBackToHomePage();
		if ("Dropdown".equalsIgnoreCase(pageValue)) {
			navigateToDropdown();
		} else if ("Frames".equalsIgnoreCase(pageValue)) {
			navigateToFrames();
		}
	}
}
