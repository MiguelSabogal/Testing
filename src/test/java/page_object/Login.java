package page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.PageObjectBase;

public class Login extends PageObjectBase {
	@FindBy(how = How.XPATH, using = "//a[@data-testid='login']//span[text()='Iniciar sesión']")
	private WebElement spn_SignIn;
	
	@FindBy(how = How.NAME, using = "username_or_email")
	private WebElement txt_Username;

	/**
	 * Constructs a new instance, that initialize the elements of the login page
	 */
	public Login() {
		PageFactory.initElements(driver, this);
	}

	/**
	 * Sign in the user on the web site
	 */
	public void signIn() {
		spn_SignIn.click();
		
		// Input the username
		
		// Input the password
		
		// Click on sign in button
	}
}
