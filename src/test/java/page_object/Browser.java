package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	/**
	 * Open the browser 
	 */
	public WebDriver open() {
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();
	}
	
	public void getURL(WebDriver driver,String url) {
		driver.get(url);
	}
	
	
	
}
