package pages.backend;

import core.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Browser;

import java.util.concurrent.TimeUnit;

public class AdminLogin extends BasePage {

    private static final By USERNAME_INPUT_FIELD = By.id("input-username");
    private static final By PASSWORD_INPUT_FIELD = By.id("input-password");
    private static final By LOGIN_BUTTON = By.className("btn-primary");
    private static final By VALIDATION_MESSAGE = By.cssSelector(".alert-danger");


    public static void goTo() {
        Browser.driver.get("http://shop.pragmatic.bg/admin");
    }

    public static void login(String username, String password) {
        Browser.driver.findElement(USERNAME_INPUT_FIELD).sendKeys(username);
        Browser.driver.findElement(PASSWORD_INPUT_FIELD).sendKeys(password);
        Browser.driver.findElement(LOGIN_BUTTON).click();
    }

    public static void verifyValidationMessage(String expectedValidationMessage, String messageOnFailure) {
        String actualValidationMessage = getText(VALIDATION_MESSAGE);
        Assert.assertTrue(messageOnFailure, actualValidationMessage.contains(expectedValidationMessage));

    }
}
