package base;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.MediaEntityBuilder;

import io.github.bonigarcia.wdm.WebDriverManager;

import pages.LoginPage;
import utils.ReportManager;
import utils.ScreenshotUtil;
public class BaseTest {
	
	protected WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        ReportManager.initReports();
    }

    @BeforeMethod
    public void setUp(Method method) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        ReportManager.createTest(method.getName()); // Start a new test
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            String screenshotPath = ScreenshotUtil.captureScreenshot(driver, result.getName());
            ReportManager.getTest().fail("Test failed: " + result.getThrowable(),
                    MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            ReportManager.getTest().pass("Test passed");
        } else if (result.getStatus() == ITestResult.SKIP) {
            ReportManager.getTest().skip("Test skipped");
        }

        if (driver != null) {
            driver.quit();
        }

        ReportManager.flushReports();
    }

    public void login(String username, String password) throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(LoginPage.USERNAME).sendKeys(username);
        driver.findElement(LoginPage.PASSWORD).sendKeys(password);
        driver.findElement(LoginPage.SUBMIT).click();
        Thread.sleep(3000); 
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	protected WebDriver driver;
//	 @BeforeMethod
//	    public void setUp() {
//	        WebDriverManager.chromedriver().setup();
//	        driver = new ChromeDriver();
//	    }
//
//	    @AfterMethod
//	    public void tearDown() {
//	        if (driver != null) {
//	            driver.quit();
//	        }
//	    }
//	    
//	
//	   
//	    public void login(String username, String password) throws InterruptedException {
//	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	        driver.manage().window().maximize();
//	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//	        
//	        driver.findElement(LoginPage.USERNAME).sendKeys(username);
//	        driver.findElement(LoginPage.PASSWORD).sendKeys(password);
//	        driver.findElement(LoginPage.SUBMIT).click();
//
//	        Thread.sleep(3000); 
//	    }
//	    
	   
	    
	    
}
