package pages;

import org.openqa.selenium.By;

public class LoginPage {

	// Login Page
    public static final By USERNAME = By.xpath("//input[@name='username']");
    public static final By PASSWORD = By.xpath("//input[@name='password']");
    public static final By SUBMIT = By.xpath("//button[@type=\"submit\"]");
}
