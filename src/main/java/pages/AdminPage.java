package pages;

import org.openqa.selenium.By;

public class AdminPage {

	    public static final By ADMIN_TAB = By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Admin']");
	    public static final By ADD_ROLE_BUTTON = By.xpath("//button[normalize-space()='Add']");
	    public static final By USER_DROPDOWN = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
	    public static final By EMP_NAME = By.xpath("//input[@placeholder='Type for hints...']");
	    public static final By STATUS_DROPDOWN = By.xpath("//div[3]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]");
	    public static final By ADMIN_USERNAME = By.cssSelector("div[class='oxd-form-row'] div[class='oxd-grid-2 orangehrm-full-width-grid'] div[class='oxd-grid-item oxd-grid-item--gutters'] div[class='oxd-input-group oxd-input-field-bottom-space'] div input[class='oxd-input oxd-input--active']");
	    public static final By ADMIN_PASSWORD = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']");
	    public static final By ADMIN_CNF_PASSWORD = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']");
	    public static final By ADMIN_SAVE = By.xpath("//button[normalize-space()='Save']");
	    public static final By SUGGESTIONS = By.xpath("//div[@class=\"oxd-autocomplete-text-input--after\"]");
	    
}
