package baselib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utilites.ReadPropertyFile;

import java.io.IOException;

public class BaseLib {
    public static WebDriver driver;
     static String BrowserName;
     static String  URL;

@BeforeTest
    public static WebDriver launch_driver() throws IOException
    {
    BrowserName=ReadPropertyFile.getPropertyvalue("browser");
    URL=ReadPropertyFile.getPropertyvalue("url");
   if(BrowserName.equalsIgnoreCase("chrome"))
   {
       driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get(URL);

   }

    else if(BrowserName.equalsIgnoreCase("edge"))
    {
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
    }

        return driver;
    }

@AfterTest
public void close_browser()
{
    //driver.close();
}
//    public static void main(String[] args) throws IOException {
//        BaseLib b=new BaseLib();
//        b.setup();
//
//    }

}
