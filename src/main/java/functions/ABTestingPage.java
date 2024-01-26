package functions;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;

import libraries.ReusableLib;
import org.testng.Assert;

public class ABTestingPage extends ReusableLib {

	By headerABTestControl = By.xpath("//div[@id='content']//h3");
	By textABTesting = By.xpath("//div[@id='content']//p");

	protected static final List<String> headerABTest = Arrays.asList("A/B Test Variation 1", "A/B Test Control");
	protected static final String textABtest = "Also known as split testing";

	public void validateABTestingHeader() {
		Assert.assertEquals(headerABTest.contains(getTextFromElemeent(headerABTestControl)), true, "A/B Test Variation 1");
		Assert.assertEquals(getTextFromElemeent(textABTesting).contains(textABtest), true,
				"A/B test control text is not containing expected text");
		threadWait(2000);
	}
}