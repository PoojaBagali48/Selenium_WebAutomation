package tests;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseTest;
import locators.CommonLocators;
import utils.KeyboardActions;

public class CreateAdmin extends BaseTest {

	@Test
    public void createAdminRole() throws InterruptedException {
		
        // Login using BaseTest method
        login("Admin", "admin123");

        new WebDriverWait(driver, Duration.ofSeconds(5))
        .until(ExpectedConditions.elementToBeClickable(CommonLocators.ADMIN_TAB))
        .click();
       // driver.findElement(CommonLocators.ADMIN_TAB).click();
        driver.findElement(CommonLocators.ADD_ROLE_BUTTON).click();
        driver.findElement(CommonLocators.USER_DROPDOWN).click();
        WebElement dropdownElement = null;
		KeyboardActions.pressDownArrowAndEnter(driver, dropdownElement);
        driver.findElement(CommonLocators.EMP_NAME).sendKeys("Marvel");
        driver.findElement(CommonLocators.STATUS_DROPDOWN).click();
		KeyboardActions.pressDownArrowAndEnter(driver, dropdownElement);
        driver.findElement(CommonLocators.ADMIN_USERNAME).sendKeys("Tony Stark");
        driver.findElement(CommonLocators.ADMIN_PASSWORD).sendKeys("Tony123");
        driver.findElement(CommonLocators.ADMIN_CNF_PASSWORD).sendKeys("Tony123");
        driver.findElement(CommonLocators.ADMIN_SAVE).click();
        
        
    }
}
