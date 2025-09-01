package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {
    public static void pressDownArrowAndEnter(WebDriver driver, WebElement element) {
        element.click(); // focus on the element
        new Actions(driver)
            .sendKeys(Keys.ARROW_DOWN)
            .sendKeys(Keys.ENTER)
            .perform();
    }
}

