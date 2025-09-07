 package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.InfoPage;
import utils.KeyboardActions;

public class MyInfoUpdate extends BaseTest {

@Test	
public void updateInfo() throws InterruptedException{
		
        // Login using BaseTest 
        login("Admin", "admin123");
	
        //Open MyInfo Page
       driver.findElement(InfoPage.InfoTab).click();
       Thread.sleep(5000);
       
      //Enter FirstName
      WebElement firstName = driver.findElement(InfoPage.Fname);
      KeyboardActions.clearText(firstName);
       firstName.sendKeys("Nezuko");
       Thread.sleep(5000);
       
     //Enter MiddleName
       WebElement middleName = driver.findElement(InfoPage.Mname);
       KeyboardActions.clearText(middleName);
       Thread.sleep(5000);
       
     //Enter LastName
       WebElement lastName = driver.findElement(InfoPage.Lname);
       KeyboardActions.clearText(lastName);
       lastName.sendKeys("Kamado");
       Thread.sleep(5000);
       
     //Enter EmployeeID
       WebElement empID = driver.findElement(InfoPage.EmpID);
       KeyboardActions.clearText(empID);
       empID.sendKeys("090912");
       Thread.sleep(5000);
       
     //Enter otherID
       WebElement otherID = driver.findElement(InfoPage.OtherID);
       KeyboardActions.clearText(otherID);
       Thread.sleep(5000);
    
      //Enter DOB
       WebElement dateOfBirth = driver.findElement(InfoPage.DOB);
       KeyboardActions.clearText(dateOfBirth);
       dateOfBirth.sendKeys("1999-08-04");
       Thread.sleep(5000);
       
       //Select Gender
       WebElement gender = driver.findElement(InfoPage.Gender);
       gender.click();
       Thread.sleep(5000);
       
       //Driver License
       WebElement license = driver.findElement(InfoPage.DriversLicense);
       KeyboardActions.clearText(license);
       license.sendKeys("ABC123");
       Thread.sleep(5000);
       
       //Select Nationality
       driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")).click();
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@role='listbox']")));
       WebElement indianOpt = driver.findElement(By.xpath("//div[@role='option' and normalize-space(.)='Indian']"));
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", indianOpt);
       indianOpt.click();
       Thread.sleep(5000);
       
       //Save the Info
       WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
       WebElement saveButton = wait1.until(ExpectedConditions.elementToBeClickable(InfoPage.Save));
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", saveButton);
       saveButton.click();
       Thread.sleep(10000);
       System.out.println("Displayed: " + saveButton.isDisplayed());
       System.out.println("Enabled: " + saveButton.isEnabled());
   
       
}
}
