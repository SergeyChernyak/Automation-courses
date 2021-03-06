package page;

import conf.InitDriver;
import io.qameta.allure.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage extends InitDriver {
    public FacebookLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement emailField;

    @FindBy(xpath = "//*[@id=\"pass\"]")
    private WebElement passField;

    @FindBy(id = "loginbutton")
    private WebElement loginButton;


    @Step("Get url")
    public FacebookLoginPage navigateTo(String url) {
        driver.get(url);
        return this;
    }


    @Step("Login step to Facebbok")
    public FacebookNavigation login (String login, String password) {
//        wait.visible(emailField);
        emailField.clear();
        emailField.sendKeys(login);

        passField.clear();
        passField.sendKeys(password);

        loginButton.click();
        return new FacebookNavigation();
    }

}
