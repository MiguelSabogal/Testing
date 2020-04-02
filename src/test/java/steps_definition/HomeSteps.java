package steps_definition;

import io.cucumber.java8.*;
import page_object.Home;

public class HomeSteps implements En {
	/**
	 * Constructs a new instance, that initialize the steps to home page
	 */
	public HomeSteps() {
		Given("I want to create an account on Twitter", () -> {
			Home home = new Home();
			home.signIn();
		});
	}
}
