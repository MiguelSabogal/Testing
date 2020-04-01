package steps_definition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java8.*;
import page_object.Browser;
import page_object.OpenUrl;

public class LoginSteps implements En {
	Browser browser;
	OpenUrl openUrl;
	
	
	public LoginSteps() {
		Given ("I want to open Twitter in a browser", ()->{
			browser = new Browser();
			browser.open();
		});
		
		When ("Open twitter home page", ()->{
			openUrl = new OpenUrl();
			openUrl.url();
		});
		
		
	}
}
