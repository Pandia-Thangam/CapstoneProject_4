package functions;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import libraries.ReusableLib;

public class HomePage extends ReusableLib {

	By linkABTesting = By.xpath("//a[text()='A/B Testing']");
	By linkDropdown = By.xpath("//a[text()='Dropdown']");
	By linkFrames = By.xpath("//a[text()='Frames']");

	protected static final List<String> headerABTest = Arrays.asList("A/B Test Variation 1", "A/B Test Control");
	protected static final String textABtest = "Also known as split testing";

	public void navigateToABTesting() {
		clickElement(linkABTesting);
	}

	public void navigateToDropdown() {
		clickElement(linkDropdown);
	}

	public void navigateToFrames() {
		clickElement(linkFrames);
	}
}