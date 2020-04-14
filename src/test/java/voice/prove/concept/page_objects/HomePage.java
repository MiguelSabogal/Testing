package voice.prove.concept.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageObjectBase{

    //--------------Page Objects--------------//
    private final String BTN_CONTINUE = "//button[text()='Continue']";
    private final String LNK_FEED = "Feed";
    //----------------------------------------//

    public HomePage() {
        PageFactory.initElements(driver,this);
    }


    public void clicOnContinueOnWelcome() {
        driver.findElement(By.xpath(BTN_CONTINUE)).click();
    }

    public boolean validateFeedLinkIsPresent() {
        try {
            WebElement btn_feed = driver.findElement(By.linkText(LNK_FEED));
            return btn_feed.isEnabled();
        }catch(Exception e){
            return false;
        }
    }
}
