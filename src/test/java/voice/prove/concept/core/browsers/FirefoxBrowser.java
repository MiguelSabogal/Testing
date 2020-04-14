package voice.prove.concept.core.browsers;

import voice.prove.concept.core.IBrowser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.PageFactory;
import voice.prove.concept.page_objects.PageObjectBase;

public class FirefoxBrowser extends PageObjectBase implements IBrowser {

    private static final String KEY = "webdriver.path";
    private static final String FIREFOX_DRIVER = "webdriver.gecko.driver";

    public FirefoxBrowser() {
        PageFactory.initElements(driver, this);
    }

    @Override
    public void open() {
        WebDriverManager.firefoxdriver().arch32().setup();
        System.setProperty(KEY, System.getProperty(FIREFOX_DRIVER));
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        driver = new FirefoxDriver(firefoxOptions);
    }
}
