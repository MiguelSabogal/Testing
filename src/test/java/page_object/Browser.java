package page_object;

import java.util.concurrent.TimeUnit;

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
	
	public void waitPageLoaded(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	
	public void closeDriver(WebDriver driver) {
		driver.close();
	}
	
	
	
	
}
