import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import conf.BaseTest;
import org.testng.reporters.DotTestListener;
import page.FacebookLoginPage;

@Listeners({DotTestListener.class})
@Epic("Regression Test")
@Feature("Login Test")

public class TestBot extends BaseTest {

    @Severity(SeverityLevel.BLOCKER)
    @Description("Login to facebook and send messages")
    @Test
    public void testBot () {
        FacebookLoginPage loginPage = new FacebookLoginPage();

        loginPage
                .navigateTo("https://www.facebook.com")
                .login("striker-life@mail.ru", "*******")
                .writeMessage();
    }
}
