package steps_definition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java8.*;
import page_object.Browser;
import page_object.Explore;

public class LoginSteps implements En {
	Browser browser;
	Explore explore;
	WebDriver driver;
	
	public LoginSteps() {
		
		Given("I want to open {string} in a browser", (String url)->{
			browser = new Browser();
			driver =browser.open();
			browser.openWebPage(driver, url);
			browser.maximizeWindow(driver);
			
		});
		explore = new Explore(driver);
		
		When("I enter {string} in the user field",(String user)->{
			explore.waitUserName();
			explore.fillUserName(user);
			
		});
		
		When("I enter {string} in the password field", (String password)->{
			explore.fillPassword(password);
		});
		
		When("I press the login button",()->{
			
		});
		
		Then("I see the index page",()->{
			
			
		});
		
		
		
		
		
		
	}
	
	
}
