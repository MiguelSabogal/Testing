package steps_definition;

import io.cucumber.java8.*;
import page_object.LoginPage;

public class LoginSteps implements En {

	public LoginSteps(LoginPage login) {
		Given("I want to open Twitter in a browser", () -> {
			login.openPage();
			Thread.sleep(1000);
		});
		
		When("I want to write {string} and {string}", (String string, String string2) -> {
			login.fillUser(string);
			login.fillPass(string2);
			login.clickButton();
		});
		
//		When("I want to write {user} {password}", (String user, String password) -> {
//			  login.fillUser(user);
//			  login.fillPass(password);
//			  login.clickButton();
//		});


	}
}
