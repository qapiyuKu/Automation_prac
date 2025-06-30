package baselib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilites.ReadPropertyFile;

import java.io.IOException;

public class BaseLib {
    public static WebDriver driver;
     static String BrowserName;
     static String  URL;


    public void setup() throws IOException {
    BrowserName=ReadPropertyFile.getPropertyvalue("browser");
    URL=ReadPropertyFile.getPropertyvalue("url");
   if(BrowserName.equalsIgnoreCase("chrome"))
   {
       driver=new ChromeDriver();
       driver.get(URL);
   }

    else if(BrowserName.equalsIgnoreCase("edge"))
    {
        driver=new EdgeDriver();
        driver.get(URL);
    }
}

    public static void main(String[] args) throws IOException {
        BaseLib b=new BaseLib();
        b.setup();

    }

}
