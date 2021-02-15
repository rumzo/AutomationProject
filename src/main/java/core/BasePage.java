package core;

import utils.Browser;
import org.openqa.selenium.By;

public class BasePage {
    protected static String getText(By locator){
       return Browser.driver.findElement(locator).getText();
    }
}
