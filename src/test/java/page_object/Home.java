package page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.PageObjectBase;

public class Home extends PageObjectBase {
	@FindBy(how = How.XPATH, using = "//a[@data-testid='login']//span[text()='Log in']")
	private WebElement spn_SignIn;

	@FindBy(how = How.NAME, using = "session[username_or_email]")
	private WebElement txt_Username;

	@FindBy(how = How.NAME, using = "session[password]")
	private WebElement txt_Password;

	@FindBy(how = How.XPATH, using = "(//div[@data-testid='LoginForm_Login_Button']//span[text()='Log in'])[position()=1]")
	private WebElement btn_SignIn;

	/**
	 * Constructs a new instance, that initialize the elements of the login page
	 */
	public Home() {
		PageFactory.initElements(driver, this);
	}

	/**
	 * Sign in the user on the web site
	 */
	public void signIn() {
		// Sign in option in the footer of the page
		spn_SignIn.click();

		// Input the username
		txt_Username.sendKeys("");

		// Input the password
		txt_Password.sendKeys("");

		// Click on sign in button
		btn_SignIn.click();
		
		// Assert
	}
}
