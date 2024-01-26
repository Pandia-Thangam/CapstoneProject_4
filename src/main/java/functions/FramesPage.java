package functions;

import org.openqa.selenium.By;
import libraries.ReusableLib;
import org.testng.Assert;

public class FramesPage extends ReusableLib {

	By linkNestedFrames = By.linkText("Nested Frames");
	By linkIFrames = By.linkText("iFrame");

	public void isNestedFramesLinkPresent() {
		Assert.assertEquals(getWebElement(linkNestedFrames).isDisplayed(), true, "Nested Frames link is not present");
	}

	public void isIFrameLinkPresent() {
		Assert.assertEquals(getWebElement(linkIFrames).isDisplayed(), true, "iFrame link is not present");
		threadWait(2000);
	}
}