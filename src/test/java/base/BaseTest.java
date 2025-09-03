package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

import pages.LoginPage;
public class BaseTest {
	protected WebDriver driver;
	 @BeforeMethod
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	    }

	    @AfterMethod
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	    
	
	    
	    public void login(String username, String password) throws InterruptedException {
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	        
	        driver.findElement(LoginPage.USERNAME).sendKeys(username);
	        driver.findElement(LoginPage.PASSWORD).sendKeys(password);
	        driver.findElement(LoginPage.SUBMIT).click();

	        Thread.sleep(3000); 
	    }
}
