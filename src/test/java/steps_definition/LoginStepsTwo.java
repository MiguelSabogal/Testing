package steps_definition;

import io.cucumber.java8.En;
import page_object.LoginPage;

public class LoginStepsTwo implements En {
	
	public LoginStepsTwo(LoginPage login) {
	
	Given("A user put the {string} and {string}", (String string, String string2) -> {
		login.openPage();
		login.fillUser(string);
		login.fillPass(string2);
	    
	});

	When("The user do click in a login button", () -> {
	    login.clickButton();
	});

	Then("It should load the main menu", () -> {
		
	    
	});

//	Given("A user put the {string} and {string}", (String string, String string2) -> {
//	    
//	});

//	When("The user do click in a login button", () -> {
//	    
//	});

	Then("It should load the login Error", () -> {
	   
	});

	}
}
