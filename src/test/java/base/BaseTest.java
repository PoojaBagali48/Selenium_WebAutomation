package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import locators.CommonLocators;

public class BaseTest {
	protected WebDriver driver;
	 @BeforeClass
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	    }

	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	    
	
	    
	    public void login(String username, String password) throws InterruptedException {
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	        
	        driver.findElement(CommonLocators.USERNAME).sendKeys(username);
	        driver.findElement(CommonLocators.PASSWORD).sendKeys(password);
	        driver.findElement(CommonLocators.SUBMIT).click();

	        Thread.sleep(3000); 
	    }
}
