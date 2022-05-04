package login.com.herokuapp.internet_the.testsuite;

import login.com.herokuapp.internet_the.pages.LoginPage;
import login.com.herokuapp.internet_the.testbase.TestBase;
import login.com.herokuapp.internet_the.utility.Utility;
import org.junit.Assert;
import org.testng.annotations.Test;


public class LoginTest extends TestBase {
    LoginPage loginPage= new LoginPage();

    @Test
    public void login(){
        loginPage.enterUserName("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnButton();
        String actualMessage= loginPage.errorMessage();
        String expectedMessage= "Secure Area";
        Assert.assertEquals("Login Message",expectedMessage,actualMessage);
    }
    @Test
    public void verifyTheUsernameErrorMessage() {
        loginPage.enterUserName("tomsmith1");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnButton();
        String actualMessage= loginPage.invalidUsernameErrorMessage();
        String expectedMessage= "Your username is invalid!";
        Assert.assertEquals("Login Message",expectedMessage,actualMessage);
    }
    @Test
    public void verifyThePasswordErrorMessage() {
        loginPage.enterUserName("tomsmith");
        loginPage.enterPassword("SuperSecretPassword");
        loginPage.clickOnButton();
        String actualMessage= loginPage.invalidPasswordErrorMessage();
        String expectedMessage= "Your password is invalid!";
        Assert.assertEquals("Login Message",expectedMessage,actualMessage);
    }
}