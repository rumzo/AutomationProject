package pages.frontend;

import core.BasePage;
import org.openqa.selenium.By;

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

}
