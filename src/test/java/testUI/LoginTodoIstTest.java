package testUI;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.LoginPage;
import pages.MainPage;
import session.Session;

/**
 * @autor : eynar.pari
 * @date : 02/10/2020.
 **/
public class LoginTodoIstTest {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Before
    public void before(){
        Session.getInstance().getDriver().get("https://todoist.com/");
    }

    @DisplayName("verify The Login Using User And Password")
    @Description("This test case is to verify verify The Login Using User And Password")
    @Owner("Eynar Pari")
    @Test
    public void verifyTheLoginUsingUserAndPassword() throws InterruptedException {
        mainPage.singUpFreeButton.click();
        loginPage.emailTextBox.type("afloresgizmo@ucb.com");
        loginPage.passwordTextBox.type("afm12345678");
        loginPage.signupButton.click();
        // Verification
        Thread.sleep(2000);
        Assert.assertFalse("ERROR , no se pudo realizar el login!",loginPage.signupButton.isDisplayedOnPage());
    }

    @After
    public void after(){
       Session.getInstance().closeBrowser();
    }

}
