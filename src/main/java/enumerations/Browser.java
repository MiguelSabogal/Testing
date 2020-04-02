package enumerations;

public enum Browser {
	CHROME("chromedriver.exe", "ChromeBrowser"), 
	FIREFOX("firefox.exe", "FirefoxBrowser"), 
	IEXPLORE("iexplore.exe", "IExploreBrowser");

	public final String taskName;
	public final String className;

	/**
	 * Builds a new instance of the browser enumerator
	 * 
	 * @param taskName The name of the process task
	 */
	private Browser(String taskName, String className) {
		this.taskName = taskName;
		this.className = className;
	}
}
