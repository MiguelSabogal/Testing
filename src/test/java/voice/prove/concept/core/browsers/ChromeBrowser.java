package voice.prove.concept.core.browsers;

import voice.prove.concept.core.IBrowser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import voice.prove.concept.page_objects.PageObjectBase;

public class ChromeBrowser extends PageObjectBase implements IBrowser {

    private static final String KEY = "webdriver.path";
    private static final String CHROME_DRIVER = "webdriver.chrome.driver";

    public ChromeBrowser() {
        PageFactory.initElements(driver, this);
    }

    @Override
    public void open() {
        WebDriverManager.chromedriver().setup();
        System.setProperty(KEY, System.getProperty(CHROME_DRIVER));
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
    }
}
