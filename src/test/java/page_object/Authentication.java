package page_object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Authentication {
	/**
	 * Log and authenticate in twitter 
	 */
	WebDriver webDriver;
	By user = By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/form/div/div[1]/label/div/div[2]/div/input");
	By pass = By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/form/div/div[2]/label/div/div[2]/div/input");
	By login = By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/form/div/div[3]/div/div");
			
	public Authentication(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public void writeUser(String usuario) throws InterruptedException {
		webDriver.manage().window().maximize();
		Thread.sleep(5000);
		webDriver.findElement(user).sendKeys(usuario);
	}
	
	public void writePass(String password) {
		webDriver.findElement(pass).sendKeys(password);
	}
	
	public void loginButton() {
	webDriver.findElement(login).click();
	}
	
}
