package page_object;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	/**
	 * Open the browser 
	 */
	
	WebDriver driver;
	public WebDriver open() {
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();
	}	
 
}

