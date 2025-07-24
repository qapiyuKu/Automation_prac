package utilites;

import com.google.common.io.Files;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTRotY;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

public class ScreenshotUtility
{
    public static File screenshotFile(WebDriver driver, String Filename)  {
        try
        {
            String timestamp = java.time.LocalDateTime.now().toString().replace(":", "-");
            TakesScreenshot ts=(TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);
            File dst = new File("C:\\Users\\Nitin\\IdeaProjects\\Automation_prac\\src" +
                    "\\main\\resources\\screenshot_"+ timestamp + Filename+  ".png");
            Files.copy(src,dst);
            return src;

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage()+  " Screenshot File me issue hai");
        }
    }
    public static String screenshotBase64(WebDriver driver,String Filename) throws IOException {
        {
            try {
                String timestamp = java.time.LocalDateTime.now().toString().replace(":","-");
                TakesScreenshot ts=(TakesScreenshot) driver;
                String src = ts.getScreenshotAs(OutputType.BASE64);
                byte [] base64byte= Base64.getDecoder().decode(src);
                File dst=new File("C:\\Users\\Nitin\\IdeaProjects\\Automation_prac\\src" +
                        "\\main\\resources\\screenshot_"+ timestamp + Filename+  ".png");
                FileOutputStream fos=new FileOutputStream(dst);
                fos.write(base64byte);
                return src;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage()+"Error in screenshot in Base64");
            }
        }
    }


    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com");
       // ScreenshotUtility.screenshotFile(driver,"Demofil");
        ScreenshotUtility.screenshotBase64(driver,"Demo64");

    }

}
