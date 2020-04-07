package steps_definition;

import org.openqa.selenium.support.ui.Sleeper;

import io.cucumber.java8.En;
import page_object.LoginPage;

public class LoginStepsTwo implements En {
	
	public LoginStepsTwo(LoginPage login) {
	
	Given("A user put the {string} and {string}", (String string, String string2) -> {
		login.openPage();
		Thread.sleep(2000);
		login.fillUser(string);
		login.fillPass(string2);
	    
	});

	When("The user do click in a login button", () -> {
	    login.clickButton();
	});

	Then("It should load the main menu", () -> {
		//TODO
	    
	});
	
	Then("It should load the error message", () -> {
		//TODO
	});
	
	}
}
