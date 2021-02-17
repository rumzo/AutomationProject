package pages.frontend;

import core.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.Browser;

public class RegisterAccount extends BasePage {

    private static final By FIRST_NAME_FIELD = By.id("input-firstname");
    private static final By LAST_NAME_FIELD = By.id("input-lastname");
    private static final By EMAIL_FIELD = By.id("input-email");
    private static final By TELEPHONE_FIELD = By.id("input-telephone");
    private static final By PASSWORD_FIELD = By.id("input-password");
    private static final By PASSWORD_CONFIRM_FIELD = By.id("input-confirm");
    private static final By SUBSCRIBE_RADIO_BUTTON = By.xpath("(//div[@class='form-group']//label[@class='radio-inline'])[1]");
    private static final By PRIVACY_POLICY_CHECKBOX = By.xpath("//div[@class='pull-right']//input[@name='agree']");
    private static final By CONTINUE_BUTTON = By.xpath("//div[@class='pull-right']//input[@type='submit']");
    private static final By REGISTRATION_MESSAGE = By.cssSelector("#content >h1");

    public static void goTo() {
        Browser.driver.get("http://shop.pragmatic.bg/index.php?route=account/register");
    }

    public static void register(String firstName, String lastName, String email, int telephone, String password, String c) {
        Browser.driver.findElement(FIRST_NAME_FIELD).sendKeys(firstName);
        Browser.driver.findElement(LAST_NAME_FIELD).sendKeys(lastName);
        Browser.driver.findElement(EMAIL_FIELD).sendKeys(email);
        Browser.driver.findElement(TELEPHONE_FIELD).sendKeys(String.valueOf(telephone));
        Browser.driver.findElement(PASSWORD_FIELD).sendKeys(password);
        Browser.driver.findElement(PASSWORD_CONFIRM_FIELD).sendKeys(password);

        Browser.driver.findElement(PRIVACY_POLICY_CHECKBOX).click();
        Browser.driver.findElement(CONTINUE_BUTTON).click();
    }


    public static void verifyRegistrationMessage(String expectedRegistrationMessage, String messageOnFailure) {
        Browser.driver.get("http://shop.pragmatic.bg/index.php?route=account/success");
        String actualValidationMessage = getText(REGISTRATION_MESSAGE);
        Assert.assertTrue(messageOnFailure,actualValidationMessage.contains(expectedRegistrationMessage));
    }
}
