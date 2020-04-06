package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
 * 
 * Created by: Sebastian Calvo
 * Modified by:
 * Date: 31/03/2020
 * Description: Class where the login objects are located
*/

public class Login {
	WebDriver driver;
	By userTextField = By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/form/div/div[1]/label/div/div[2]/div/input");
	By passwordTextField = By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/form/div/div[2]/label/div/div[2]/div/input");
	By loginButton = By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/form/div/div[3]/div/div");
	
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	/*
	 * 
	 * Created by: Sebastian Calvo
	 * Modified by:
	 * Date: 31/03/2020
	 * Description: Method where the username textfield is filled
	*/
	public void fillUserName(String user) {
		driver.findElement(userTextField).sendKeys(user);
	}
	/*
	 * 
	 * Created by: Sebastian Calvo
	 * Modified by:
	 * Date: 31/03/2020
	 * Description: Method where password textfield is filled
	*/
	public void fillPassword(String password) {
		driver.findElement(passwordTextField).sendKeys(password);
	}
	/*
	 * 
	 * Created by: Sebastian Calvo
	 * Modified by:
	 * Date: 31/03/2020
	 * Description: Method to Click login button
	*/
	
	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}
	
	
	
	

}
