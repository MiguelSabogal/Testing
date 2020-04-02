package steps_definition;

import io.cucumber.java8.*;
import page_object.Login;

public class LoginSteps implements En {
	Login login;
	
	public LoginSteps() {
		Given("I want to create an account on Twitter", () -> {
			login.signIn();
		});
	}
}
