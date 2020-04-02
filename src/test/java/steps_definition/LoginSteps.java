package steps_definition;

import io.cucumber.java8.*;
import page_object.LoginPage;

public class LoginSteps implements En {

//	LoginPage login = new LoginPage();

	public LoginSteps(LoginPage login) {
		Given("I want to open Twitter in a browser", () -> {
			login.openPage();
			Thread.sleep(5000);
		});
		
		When("I want to write <user> <password>", ( String user, String password) -> {
		  login.fillUser(user);
		  login.fillPass(password);
		});

	}
}
