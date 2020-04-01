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
	
	public void openWebPage(WebDriver driver,String url) {
		driver.get(url);
	}
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	
	
	
	
	
}
