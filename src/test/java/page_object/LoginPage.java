package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	WebDriver driver;

	public LoginPage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void openPage() {
		driver.get("Https://www.twitter.com/login");
	}

	public void fillUser(String userName) {
		driver.findElement(By.name("session[username_or_email]")).sendKeys(userName);
	}
	
	public void fillPass(String userPass) {
		driver.findElement(By.name("session[password]")).sendKeys(userPass);
	}
	
	public void clickButton() {
		driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/form/div/div[3]/div/div")).click();
	}
	

}
