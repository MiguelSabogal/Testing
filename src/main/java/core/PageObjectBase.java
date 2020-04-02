package core;

import org.openqa.selenium.WebDriver;
import enumerations.Browser;
import interfaces.IBrowser;

public class PageObjectBase {
	public static WebDriver driver;

	/**
	 * Constructs a new instance, that initialize the PageObjectBase
	 */
	public PageObjectBase() {
	}

	/**
	 * Initiate the browser specified on Configuration.properties file
	 */
	public void open() {
		try {
			Browser browserInformation = getBrowserInformation();
			String className = String.format("core.browsers.%s", browserInformation.className);
			Class<?> fullClassName = Class.forName(className);
			core.Browser browser = new core.Browser((IBrowser) fullClassName.newInstance());
			browser.open();
		} catch (Exception e) {
			String errorMessage = "----------- There was an error while open the browser. -----------";
			throw new Error(errorMessage);
		}
	}

	/**
	 * Close the driver and kill the process of the driver
	 */
	public static void close() {
		driver.close();
		if (driver != null) {
			driver.quit();
		}

		killBrowser();
	}

	/**
	 * Kill the process related to the browser
	 */
	private static void killBrowser() {
		String task = "";
		try {
			Browser browserInformation = getBrowserInformation();
			task = browserInformation.taskName;

			String cmdKill = String.format("taskill /IM %s /F", task);
			Process processToKill;

			processToKill = Runtime.getRuntime().exec(cmdKill);
			processToKill.waitFor();
			if (processToKill.exitValue() == 0) {
				System.out.println(String.format("The task %s was finished", task));
			} else {
				System.out.println(String.format("The task %s was not finished", task));
			}
		} catch (Exception e) {
			System.out.println(String.format("Impossible to kill the process %s", task));
		}
	}

	/**
	 * Get the information related to the browser specified on
	 * Configuration.properties file.
	 * 
	 * @return The information of the Browser
	 */
	private static Browser getBrowserInformation() {
		ConfigurationFilesReader.loadPropertiesFromFile(PageObjectBase.class);
		String currentBrowser = ConfigurationFilesReader.getStringProperty("selenium.browser");
		Browser[] browserList = Browser.values();
		for (Browser browserInformation : browserList) {
			if (browserInformation.toString().contains(currentBrowser)) {
				return browserInformation;
			}
		}

		return null;
	}
}