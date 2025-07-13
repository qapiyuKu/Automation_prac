package utilites;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility {

    public static void clickWithJavaScript(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",element);
    }
    public static void scrollUptoElement(WebElement element,WebDriver driver)
    {
      JavascriptExecutor js=(JavascriptExecutor) driver;
      js.executeScript("arguments[0].scrollIntoView();",element);
    }
    public static void sendkeyValueThroughjavaScript(WebElement element,String value,WebDriver driver)
    {
     JavascriptExecutor js=(JavascriptExecutor) driver;
     js.executeScript("arguments[0].value=value",element);
    }
    public static void scrolToptoBottom(WebDriver driver)
    {
     JavascriptExecutor js=(JavascriptExecutor) driver;
     js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
}
