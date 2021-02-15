package pages.backend;

import org.junit.Assert;
import org.openqa.selenium.By;
import utils.Browser;


public class AdminDashboard {

    private static final By DASHBOARD_H1_PAGE_TITLE = By.cssSelector("div.container-fluid > h1");

    public static void verifyPageTitle(String expectedPageTitle, String messageOnFailure) {
        String actualPageTitle = Browser.driver.findElement(DASHBOARD_H1_PAGE_TITLE).getText();

        Assert.assertEquals(expectedPageTitle, actualPageTitle);
    }
}
