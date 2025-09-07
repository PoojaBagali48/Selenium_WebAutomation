package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {
    public static void pressDownArrowAndEnter(WebDriver driver, WebElement element) {
        element.click();
        new Actions(driver)
            .sendKeys(Keys.ARROW_DOWN)
            .sendKeys(Keys.ENTER)
            .perform();
    }  
        
        // Using CTRL+A + DELETE
    public static void clearText(WebElement element) {
        element.click();  
        element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        element.sendKeys(Keys.DELETE);
        
        
    }
     
}

