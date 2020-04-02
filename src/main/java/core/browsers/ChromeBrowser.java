package core.browsers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import core.PageObjectBase;
import interfaces.IBrowser;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser extends PageObjectBase implements IBrowser {
	/**
	 * CONTANTS
	 */
	private static final String KEY = "webdriver.path";
	private static final String CHROME_DRIVER = "webdriver.chrome.driver";

	/**
	 * Constructs a new instance, that initialize the driver to Chrome browser
	 */
	public ChromeBrowser() {
		PageFactory.initElements(driver, this);
	}

	/**
	 * Open Chrome browser
	 */
	@Override
	public void open() {
		WebDriverManager.chromedriver().arch32().setup();
		System.setProperty(KEY, System.getProperty(CHROME_DRIVER));
		ChromeOptions chromeOptions = new ChromeOptions();
		driver = new ChromeDriver(chromeOptions);
	}
}
