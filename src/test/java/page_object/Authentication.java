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
	By pepito = By.xpath("//*[@id=\"react-root\"]/div/div/div[2]");
	By user = By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/section/form/div/div[1]/div/label/div/div[2]");
	By pass = By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/section/form/div/div[2]/div/label");
	By login = By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/section/form/div/div[3]/div/div/span/span");
			
	public Authentication(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public void writeUser(String usuario) {
		webDriver.switchTo().frame(webDriver.findElement(pepito));
		List <WebElement> childrens = webDriver.findElement (pepito).findElements(By.tagName("*"));
		System.out.println(".Hola soy beto " + childrens.size() + " " + childrens.get(0).getTagName());
		
		
		
		webDriver.findElement(pepito).click();
		//	List <WebElement> hijos = driver.findElement(By).findElements(By)
		webDriver.findElement(user).sendKeys(usuario);
	}
	
	public void writePass(String password) {
		webDriver.findElement(pass).sendKeys(password);
	}
	
	public void loginButton() {
	webDriver.findElement(login).click();
	}
	
}
