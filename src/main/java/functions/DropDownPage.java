package functions;

import org.openqa.selenium.By;
import libraries.ReusableLib;
import org.testng.Assert;

public class DropDownPage extends ReusableLib {

	By dropDownList = By.id("dropdown");
	By optionOptionOne = By.xpath("//option[text()='Option 1']");

	public void selectedDropDownValue(String optionValue) {
		selectDropDownByWebElement(dropDownList, optionValue);
	}

	public void isDropDownValueSelected(String optionValue) {
		Assert.assertEquals(isElementSelected(optionOptionOne), true, "Expected option is not selected");
		threadWait(2000);
	}
}