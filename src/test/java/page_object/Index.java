package page_object;

import org.openqa.selenium.WebDriver;

public class Index {
	
	WebDriver driver;
	public Index(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean checkIndexPage() {
		if(driver.getCurrentUrl().equalsIgnoreCase("https://twitter.com/home")) {
			return true;
		}
		else {
			return false;
		}
	}
}
