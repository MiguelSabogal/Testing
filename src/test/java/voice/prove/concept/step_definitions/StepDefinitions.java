package voice.prove.concept.step_definitions;

import io.cucumber.java8.En;
import org.junit.Assert;
import voice.prove.concept.page_objects.HomePage;
import voice.prove.concept.page_objects.LoginPage;

public class StepDefinitions implements En {

    public StepDefinitions(LoginPage loginPage, HomePage homePage) {
        Given("that I navigate to voice main page", () -> {
            loginPage.navigateToVoiceLoginPage();
        });

        When("i logged into voice with username {string} and passsword {string}", (String username, String password) -> {
            loginPage.insertUsername(username);
            loginPage.insertPassword(password);
            loginPage.clicOnContinue();
        });

        Then("i should be directed to voice home page", () -> {
            homePage.clicOnContinueOnWelcome();
            Assert.assertTrue(homePage.validateFeedLinkIsPresent());

        });
    }
}
