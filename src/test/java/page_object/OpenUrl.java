package page_object;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenUrl {
	/**
	 * Open Url 
	 */
	
	WebDriver driver;
	public WebDriver url() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.twitter.com/");
		return driver;
	}
}
