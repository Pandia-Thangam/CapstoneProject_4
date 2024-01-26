package stepDefinitions;

import functions.FramesPage;
import io.cucumber.java.en.Then;

public class FramesPageSteps extends FramesPage {
	
	@Then("I validated the expected links are present")
	public void validateIfExpectedLinksPresent() throws InterruptedException {
		isNestedFramesLinkPresent();
		isIFrameLinkPresent();
		Thread.sleep(2000);
	}
}
