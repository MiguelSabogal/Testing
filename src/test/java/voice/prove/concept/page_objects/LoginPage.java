package voice.prove.concept.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageObjectBase{


    //--------------Page Objects--------------//
    private final String EDT_USERNAME = "input[class^='username-input']";
    private final String EDT_PASSWORD = "input[class^='password-input']";
    private final String BTN_CONTINUE = "input[type='submit']";
    //----------------------------------------//

    public LoginPage() {
        PageFactory.initElements(driver,this);
    }


    public void navigateToVoiceLoginPage() {
        //driver.get("http://staging.beta.voice.com/");
    }

    public void insertUsername(String username) {
        driver.findElement(By.cssSelector(EDT_USERNAME)).sendKeys(username);
    }

    public void insertPassword(String password) {
        driver.findElement(By.cssSelector(EDT_PASSWORD)).sendKeys(password);
    }

    public void clicOnContinue() {
        driver.findElement(By.cssSelector(BTN_CONTINUE)).click();

    }
}
