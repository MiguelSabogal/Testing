package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	WebDriver driver;
	
	/**
	*  method to instance the driver
	*/
	
	public LoginPage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	/**
	*  Open the URL into the Browser
	*/

	public void openPage() {
		driver.get("Https://www.twitter.com/login");
	}

	/**
	*  Open the URL into the Browser
	*  
	*  @param userName user to login
	*/
	public void fillUser(String userName) {
		driver.findElement(By.name("session[username_or_email]")).sendKeys(userName);
	}
	
	/**
	*  Open the URL into the Browser
	*  
	*  @param userPass password to login
	*/
	public void fillPass(String userPass) {
		driver.findElement(By.name("session[password]")).sendKeys(userPass);
	}
	
	/**
	*  Button to click to enter on Twitter
	*/
	public void clickButton() {
		driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/form/div/div[3]/div/div")).click();
	}
	

}
