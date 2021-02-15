package pages.frontend;

import core.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.Browser;

public class MyAccount extends BasePage {

    private static final By MY_ACCOUNT_H1_TITLE = By.cssSelector("div #logo a");

    public static void verifyPageTitle(String expectedPageTitle, String mesageOnFailure) {
        String actualPageTitle = Browser.driver.findElement(MY_ACCOUNT_H1_TITLE).getText();

        Assert.assertEquals(expectedPageTitle,actualPageTitle);
    }
}
