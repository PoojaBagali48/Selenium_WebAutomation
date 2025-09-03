package tests;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.AdminPage;
import utils.KeyboardActions;

public class CreateAdmin extends BaseTest {

	@Test
    public void createAdminRole() throws InterruptedException {
		
        // Login using BaseTest 
        login("Admin", "admin123");

        new WebDriverWait(driver, Duration.ofSeconds(5))
        .until(ExpectedConditions.elementToBeClickable(AdminPage.ADMIN_TAB))
        .click();
        
        //Add admin role
        driver.findElement(AdminPage.ADD_ROLE_BUTTON).click();
        Thread.sleep(2000);
        WebElement dropdownElement = driver.findElement(AdminPage.USER_DROPDOWN);
        KeyboardActions.pressDownArrowAndEnter(driver, dropdownElement);
		Thread.sleep(5000);
		
		//employee name
        WebElement inputField = driver.findElement(AdminPage.EMP_NAME);
        inputField.sendKeys("test"); // Enter value
        Thread.sleep(5000);
        inputField.sendKeys(Keys.ARROW_DOWN);    // Press Down Arrow
        inputField.sendKeys(Keys.ENTER);         // Press Enter again
        
       
        //Select status
        dropdownElement = driver.findElement(AdminPage.STATUS_DROPDOWN);
        Thread.sleep(2000);
        KeyboardActions.pressDownArrowAndEnter(driver, dropdownElement);
        Thread.sleep(2000);
        
        //Username and password
        driver.findElement(AdminPage.ADMIN_USERNAME).sendKeys("Tony Stark");
        Thread.sleep(2000);
        driver.findElement(AdminPage.ADMIN_PASSWORD).sendKeys("Tony@12399");
        driver.findElement(AdminPage.ADMIN_CNF_PASSWORD).sendKeys("Tony@12399");
        Thread.sleep(2000);
        driver.findElement(AdminPage.ADMIN_SAVE).click();
        
        
    }
}
