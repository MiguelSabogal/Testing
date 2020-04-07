package steps_definition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java8.*;
import page_object.Browser;
import page_object.Authentication;

public class LoginSteps implements En {
	Browser browser;
	Authentication authentication;
	WebDriver webDriver;
	
	
	
	public LoginSteps() {
		Given ("I want to open Twitter in a browser", ()->{
			browser = new Browser();
			webDriver = browser.open();
			webDriver.get("https://www.twitter.com/login");
		});

		When("Write user {string}", (String usuario) -> {
			authentication = new Authentication(webDriver);
			authentication.writeUser(usuario);
		});
		
		When("Write pass {string}", (String password) -> {
			authentication = new Authentication(webDriver);
			authentication.writePass(password);
		});

		When("Click login button", () -> {
			authentication = new Authentication(webDriver);
			authentication.loginButton();
		});

		Then("Twitter home page", () -> {
			authentication = new Authentication(webDriver);
		});
	}
}
