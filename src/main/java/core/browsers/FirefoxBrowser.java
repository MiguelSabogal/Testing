package core.browsers;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.PageFactory;

import core.PageObjectBase;
import interfaces.IBrowser;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxBrowser extends PageObjectBase implements IBrowser {
	/**
	 * CONTANTS
	 */
	private static final String KEY = "webdriver.path";
	private static final String FIREFOX_DRIVER = "webdriver.gecko.driver";

	/**
	 * Constructs a new instance, that initialize the driver to Chrome browser
	 */
	public FirefoxBrowser() {
		PageFactory.initElements(driver, this);
	}

	/**
	 * Open firefox browser
	 */
	@Override
	public void open() {
		WebDriverManager.firefoxdriver().arch32().setup();
		System.setProperty(KEY, System.getProperty(FIREFOX_DRIVER));
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		driver = new FirefoxDriver(firefoxOptions);
	}
}
