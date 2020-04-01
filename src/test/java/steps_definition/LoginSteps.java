package steps_definition;


import static org.junit.Assert.assertTrue;

import Utilidades.BaseUtil;
import io.cucumber.java8.*;
import page_object.TwitterMainPage;

public class LoginSteps implements En {

	private BaseUtil base;
	
	TwitterMainPage twitterMainPage;
	
	public LoginSteps(BaseUtil base) {
		this.base = base;
		
		Given("I want to navigate to twitter main page", () -> {
			this.twitterMainPage = new TwitterMainPage(this.base);
			twitterMainPage.navigateToTwitter();});
		
		When("I want to log into Twitter with username {string} and password {string}", (String username, String password) -> {
			twitterMainPage.clicOnSignInButton();
			twitterMainPage.enterUsername(username);
			twitterMainPage.enterPassword(password);
			twitterMainPage.loginWithButton();
		});
		
		Then("I validate the successful login into Twitter",() ->{
			assertTrue(twitterMainPage.homeButtonIsPresent());
		});
	}
		
}
