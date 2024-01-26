package libraries;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableLib {

	public static WebDriver driver;

	public static void openApplication() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);

		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	public static void quitDriver() {
		driver.quit();
	}

	public static void threadWait(int delayValue) {
		try {
			Thread.sleep(delayValue);
		} catch (Exception e) {
			System.out.println("Thread wait was unsuccessful");
		}
	}

	public static void clickElement(By ele) {
		try {
			driver.findElement(ele).click();
		} catch (Exception e) {
			System.out.println("Element not found");
		}
	}

	public static void explicitWait(By ele) {
		try {
			new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ele));
		} catch (Exception e) {
			System.out.println("Wait element not found");
		}
	}

	public static String getURLOfPage() {
		String URL = null;
		try {
			URL = driver.getCurrentUrl();
		} catch (Exception e) {
			System.out.println("Could not retrieve the URL of the page");
		}

		return URL;
	}

	public static String getTextFromElemeent(By ele) {
		String elementString = null;
		try {
			return driver.findElement(ele).getText();
		} catch (Exception e) {
			System.out.println("Element not found");
		}
		return elementString;
	}

	public static void navigateBackToHomePage() {
		try {
			if (!driver.getCurrentUrl().equalsIgnoreCase("https://the-internet.herokuapp.com/")) {
				driver.navigate().back();
			}
		} catch (Exception e) {
			System.out.println("Could not navigate back to home page");
		}
	}

	public static void selectDropDownByWebElement(By element, String optionELement) {
		try {
			Select dropDown = new Select(driver.findElement(element));
			dropDown.selectByVisibleText(optionELement);
		} catch (Exception e) {
			System.out.println("Element not found");
		}
	}

	public static Boolean isElementSelected(By element) {
		try {
			return driver.findElement(element).isSelected();
		} catch (Exception e) {
			System.out.println("Element not found");
		}
		return false;
	}

	public static WebElement getWebElement(By element) {
		return driver.findElement(element);

	}
}
