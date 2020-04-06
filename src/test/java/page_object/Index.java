package page_object;

import org.openqa.selenium.WebDriver;
/*
 * 
 * Created by: Sebastian Calvo
 * Modified by:
 * Date: 31/03/2020
 * Description: Class where the index objects are located
*/
public class Index {
	
	WebDriver driver;
	public Index(WebDriver driver) {
		this.driver = driver;
	}
	/*
	 * 
	 * Created by: Sebastian Calvo
	 * Modified by:
	 * Date: 31/03/2020
	 * Description: Method where the page is checked
	*/
	public boolean checkIndexPage() {
		if(driver.getCurrentUrl().equalsIgnoreCase("https://twitter.com/home")) {
			return true;
		}
		else {
			return false;
		}
	}
}
