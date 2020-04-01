package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Explore {
	WebDriver driver;
	By userTextField = By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/form/div/div[1]/label/div/div[2]/div/input");
	By passwordTextField = By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/form/div/div[2]/label/div/div[2]/div/input");
	By loginButton = By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/form/div/div[3]/div/div");
	public Explore(WebDriver driver) {
		this.driver = driver;
	}
	
	public void fillUserName(String user) {
		driver.findElement(userTextField).sendKeys(user);
	}
	
	public void fillPassword(String password) {
		driver.findElement(passwordTextField).sendKeys(password);
	}
	
	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}
	
	
	
	

}
