package voice.prove.concept.page_objects;


import voice.prove.concept.core.Browser;
import voice.prove.concept.core.BrowsersEnum;
import voice.prove.concept.core.ConfigurationFilesReader;
import voice.prove.concept.core.IBrowser;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;

public class PageObjectBase {

    public static WebDriver driver;

    public PageObjectBase() {
    }

    /**
     * Initiate the browser specified on Configuration.properties file
     */
    public void open() {
        try {
            BrowsersEnum browserInformation = getBrowserInformation();
            String className = String.format("voice.prove.concept.core.browsers.%s", browserInformation.className);
            Class<?> fullClassName = Class.forName(className);
            Browser browser = new Browser((IBrowser) fullClassName.newInstance());
            browser.open();
        } catch (Exception e) {
            String ERROR_MESSAGE = "----------- There was an error while open the browser. -----------";
            throw new Error(ERROR_MESSAGE, e);
        }
    }

    /**
     * Close the driver
     */
    public static void close() {
        driver.close();
        if (driver != null) {
            driver.quit();
        }
    }

    /**
     * Get the information related to the browser specified on
     * Configuration.properties file.
     *
     * @return The information of the Browser
     */
    private static BrowsersEnum getBrowserInformation() {
        ConfigurationFilesReader.loadPropertiesFromFile(PageObjectBase.class);
        String currentBrowser = ConfigurationFilesReader.getStringProperty("selenium.browser");

        return Arrays.asList(BrowsersEnum.values())
                .stream()
                .filter(e -> e.toString().contains(currentBrowser))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException(String.format("Unsupported type %s.", currentBrowser)));
    }

}
