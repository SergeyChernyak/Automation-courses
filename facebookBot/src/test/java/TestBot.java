import org.testng.annotations.Test;
import conf.BaseTest;
import page.FacebookLoginPage;

public class TestBot extends BaseTest {

    @Test
    public void testBot () {
        FacebookLoginPage loginPage = new FacebookLoginPage();

        loginPage
                .navigateTo("https://www.facebook.com")
                .login("striker-life@mail.ru", "******")
                .writeMessage();
    }
}
