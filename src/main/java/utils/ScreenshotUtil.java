package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {

    public static String captureScreenshot(WebDriver driver, String testName) {
        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String destPath = "test-output/screenshots/" + testName + "_" + timestamp + ".png";
            File dest = new File(destPath);
            dest.getParentFile().mkdirs(); 
            Files.copy(src.toPath(), dest.toPath());
            return destPath;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
