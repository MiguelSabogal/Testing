package steps_definition;


import static org.junit.Assert.assertTrue;

import Utilidades.BaseUtil;
import io.cucumber.java8.*;
import page_object.TwitterMainPage;

public class LoginSteps extends BaseUtil implements En {

	private BaseUtil base;
	
	TwitterMainPage twitterMainPage;
	
	public LoginSteps(BaseUtil base) {
		this.base = base;
		
		Given("I want to navigate to twitter main page", () -> {
			this.twitterMainPage = new TwitterMainPage(this.base);
			twitterMainPage.navigateToTwitter();});
		
		When("I want to log into Twitter with username {string} and password {string}", (String username, String password) -> {
			twitterMainPage.logInWithUsernameAndPassword(username,password);
		});
		
		Then("I validate the successful login into Twitter",() ->{
			assertTrue(twitterMainPage.homeButtonIsPresent());
		});
	}
		
}
