package locators;

import org.openqa.selenium.By;

public class CommonLocators {

	// Login Page
    public static final By USERNAME = By.xpath("//input[@name='username']");
    public static final By PASSWORD = By.xpath("//input[@name='password']");
    public static final By SUBMIT = By.xpath("//button[@type=\"submit\"]");
    
    //CreateAdmin
    public static final By ADMIN_TAB = By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Admin']");
    public static final By ADD_ROLE_BUTTON = By.xpath("//button[normalize-space()='Add']");
    public static final By USER_DROPDOWN = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
    public static final By EMP_NAME = By.xpath("//input[@placeholder='Type for hints...']");
    public static final By STATUS_DROPDOWN = By.cssSelector("div[class='oxd-grid-2 orangehrm-full-width-grid'] div:nth-child(1) div:nth-child(1) div:nth-child(2) div:nth-child(1) div:nth-child(1) div:nth-child(2) i:nth-child(1)");
    public static final By ADMIN_USERNAME = By.cssSelector("div[class='oxd-form-row'] div[class='oxd-grid-2 orangehrm-full-width-grid'] div[class='oxd-grid-item oxd-grid-item--gutters'] div[class='oxd-input-group oxd-input-field-bottom-space'] div input[class='oxd-input oxd-input--active']");
    public static final By ADMIN_PASSWORD = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']");
    public static final By ADMIN_CNF_PASSWORD = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']");
    public static final By ADMIN_SAVE = By.xpath("//button[normalize-space()='Save']");
    
    
}
