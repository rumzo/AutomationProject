package pages.frontend;

import core.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.Browser;

public class UserLogin extends BasePage {

    private static final By USERNAME_INPUT_FIELD = By.id("input-email");
    private static final By PASSWORD_INPUT_FIELD = By.id("input-password");
    private static final By LOGIN_BUTTON = By.xpath("(//div[@id='account-login']//div[@class='form-group'])[2]/following-sibling::input[@type='submit']");
    private static final By VALIDATION_MESSAGE = By.cssSelector(".alert-danger");

    public static void goTo() {
        Browser.driver.get("http://shop.pragmatic.bg/index.php?route=account/login");
    }

    public static void login(String username, String password) {
        Browser.driver.findElement(USERNAME_INPUT_FIELD).sendKeys(username);
        Browser.driver.findElement(PASSWORD_INPUT_FIELD).sendKeys(password);
        Browser.driver.findElement(LOGIN_BUTTON).click();
    }

    public static void verifyVerificationMessage(String expectedValidationMessage, String messageOnFailure) {
        String actualValidationMessage = getText(VALIDATION_MESSAGE);
        Assert.assertTrue(messageOnFailure, actualValidationMessage.contains(expectedValidationMessage));
    }
}
