package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilidades.BaseUtil;

public class TwitterMainPage{

	private BaseUtil base;
	private static WebDriverWait wait;
	//-----------------Object Mapping---------------//
	private final String BTN_LOGIN = "(//span[contains(text(),'Log in')])[1]"; 
	private final String EDT_USER = "session[username_or_email]";
	private final String EDT_PASSWORD = "session[password]";
	private final String BTN_LOGIN2 = "div[class$='r-bcqeeo r-q4m81j r-qvutc0']";
	private final String BTN_HOME = "//span[contains(text(),'Home')]";
	//----------------------------------------------//

	public TwitterMainPage(BaseUtil base) {
		this.base = base;
		wait = new WebDriverWait(this.base.driver, 10);
	}
	
	public void navigateToTwitter() {
		
		this.base.driver.get("https://twitter.com");
		
	}

	public void clicOnSignInButton() {
		WebElement btnLogin = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BTN_LOGIN)));
		btnLogin.click();
		
	}
	
	public void enterUsername(String username) {
		WebElement edtUsuario = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(EDT_USER)));
		edtUsuario.sendKeys(username);
		
	}
	
	public void enterPassword(String password) {
		WebElement edtPassword = this.base.driver.findElement(By.name(EDT_PASSWORD));
		edtPassword.sendKeys(password);
		
	}
	
	public void loginWithButton() {
		WebElement btnLogin2 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(BTN_LOGIN2)));
		btnLogin2.click();
		
	}

	public boolean homeButtonIsPresent() {
		try {
		WebElement btnHome = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(BTN_HOME)));
		return btnHome.isDisplayed();
		}catch (Exception e) {
			return false;
		}	
	}






	
	
}
