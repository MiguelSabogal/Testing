package steps_definition;

import io.cucumber.java8.*;
import page_object.Browser;

public class LoginSteps implements En {
	Browser browser;
	
	public LoginSteps() {
		Given("I want to open Twitter in a browser", ()->{
			browser = new Browser();
			browser.open();
		});
	}
}
