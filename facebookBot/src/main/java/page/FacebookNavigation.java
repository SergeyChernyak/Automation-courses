package page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Wait;

public class FacebookNavigation extends FacebookLoginPage {
    private Wait wait;

    public FacebookNavigation() {
        this.wait = new Wait(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"u_0_d\"]")
    private WebElement buttonOpenActiveChat;

    @FindBy(css = "a[href='https://www.facebook.com/messages/t/100001183712199']")
    private WebElement buttonOpenDialog;

    @FindBy(xpath = "//div[@class='_5rpb']/descendant::div[@class='notranslate _5rpu' and @role='combobox']")
    private WebElement fieldMessage;

    @FindBy(className = "_5c9_")
    private WebElement notMessage;

    @FindBy(className = "_5c9q")
    private WebElement isMessage;

    public FacebookNavigation writeMessage() {
        buttonOpenActiveChat.click();
        try {
            if (isMessage.isDisplayed()) {
                buttonOpenDialog.click();
                fieldMessage.sendKeys("Hi! I'm fine.");
                fieldMessage.sendKeys(Keys.ENTER);
                fieldMessage.sendKeys("And you?");
            }
        }
        catch (Exception e) {
            buttonOpenDialog.click();
            fieldMessage.sendKeys("Hi. How are you?");
        }
        fieldMessage.sendKeys(Keys.ENTER);
        return this;
    }

}
