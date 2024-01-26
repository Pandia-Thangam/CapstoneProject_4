package objects;

import io.cucumber.java.After;
import libraries.ReusableLib;

public class Hooks extends ReusableLib {

	public static void before() {
		// openApplication();
	}

	@After
	public static void after() {
		quitDriver();
	}
}
