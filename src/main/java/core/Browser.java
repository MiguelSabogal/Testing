package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import interfaces.IBrowser;

public class Browser extends PageObjectBase implements IBrowser{
	protected IBrowser browser;
	
	/**
	 * Constructs a new instance, that initialize the PageObjectBase class when is
	 * specified the browser
	 * 
	 * @param browser The browser to be opened
	 */
	public Browser(IBrowser browser) {
		this.browser = browser;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * Open the browser specified
	 */
	@Override
	public void open() {
		try {
			// Load the properties from Configuration.properties file
			ConfigurationFilesReader.loadPropertiesFromFile(PageObjectBase.class);
			this.browser.open();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(
					ConfigurationFilesReader.getLongProperty("selenium.implicitlyWait"), TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(
					ConfigurationFilesReader.getLongProperty("selenium.pageLoadTimeOut"), TimeUnit.SECONDS);

			driver.get(ConfigurationFilesReader.getStringProperty("site"));
		} catch (Exception e) {
			String errorMessage = String.format("----------- Was not possible to initiate the browser", e);
			throw new Error(errorMessage);
		}
	}
}
