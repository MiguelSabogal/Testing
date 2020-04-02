package core.browsers;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.support.PageFactory;

import core.ConfigurationFilesReader;
import core.PageObjectBase;
import interfaces.IBrowser;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IExploreBrowser extends PageObjectBase implements IBrowser {
	/**
	 * CONTANTS
	 */
	private static final String KEY = "webdriver.path";
	private static final String IE_DRIVER = "webdriver.ie.driver";
	private static final String STRATEGY = "selenium.pageLoadStrategy";
	private static final String IGNORE_PROTECTED_CAPABILITY = "ignoreProtectedModeSettings";

	/**
	 * Constructs a new instance, that initialize the driver to Chrome browser
	 */
	public IExploreBrowser() {
		PageFactory.initElements(driver, this);
	}

	/**
	 * Open IExplore browser
	 */
	@Override
	public void open() {
		WebDriverManager.iedriver().arch32().setup();
		System.setProperty(KEY, System.getProperty(IE_DRIVER));
		InternetExplorerOptions ieOptions = new InternetExplorerOptions();
		ieOptions.setCapability(IGNORE_PROTECTED_CAPABILITY, true);
		ieOptions
				.setPageLoadStrategy(PageLoadStrategy.fromString(ConfigurationFilesReader.getStringProperty(STRATEGY)));
		driver = new InternetExplorerDriver(ieOptions);
	}
}
