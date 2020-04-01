package steps_definition;

import static org.junit.Assert.fail;

import org.openqa.selenium.WebDriver;

import io.cucumber.java8.*;
import page_object.Browser;
import page_object.Login;
import page_object.Index;

/*
 * 
 * Created by: Sebastian Calvo
 * Date: 31/03/2020
 * Modified by:
 * Description: Class where the steps to login are written 
*/



public class LoginSteps implements En {
	Browser browser;
	Login explore;
	WebDriver driver;
	Index index;
	
	public LoginSteps() {
		
		Given("I want to open {string} in a browser", (String url)->{
			browser = new Browser();
			driver =browser.open();
			browser.openWebPage(driver, url);
			browser.maximizeWindow(driver);
			browser.waitPageLoaded(driver);	
		});
		
		When("I enter {string} in the user field",(String user)->{
			explore = new Login(driver);
			explore.fillUserName(user);
			
		});
		
		When("I enter {string} in the password field", (String password)->{
			explore.fillPassword(password);
		});
		
		When("I press the login button",()->{
			explore.clickLoginButton();
			browser.waitPageLoaded(driver);
			
		});
		
		Then("I see the index page",()->{
			index = new Index(driver);
			if(!index.checkIndexPage()) {
				browser.closeDriver(driver);
				fail();
			}
			browser.closeDriver(driver);
			
		});
		
		
		
		
		
		
	}
	
	
}
