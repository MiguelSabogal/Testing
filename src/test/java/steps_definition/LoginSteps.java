package steps_definition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java8.*;
import page_object.Browser;

public class LoginSteps implements En {
	Browser browser;
	WebDriver driver;
	
	public LoginSteps() {
		Given("I want to open Twitter in a browser", ()->{
			browser = new Browser();
			driver =browser.open();
		});
		
		
		
	}
	
	
}
