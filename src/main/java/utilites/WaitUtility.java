package utilites;

import baselib.BaseLib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtility  {

  public static void hardCodedwait(int x) throws InterruptedException
  {
      Thread.sleep(x*1000);
  }
  public static void implicitWait(int y,WebDriver driver)
  {
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(y*1000));
  }

  public static void waitUpToElementVisiable(WebDriver driver,int x, WebElement element)
  {
      WebDriverWait wait_visibleElement=new WebDriverWait(driver, Duration.ofSeconds(x*1000));
      wait_visibleElement.until(ExpectedConditions.visibilityOf(element));
  }
  public  static void elementToBeClickable(WebDriver driver,int x,WebElement element)
  {
      WebDriverWait waitUpToClickble=new WebDriverWait(driver,Duration.ofSeconds(x*1000));
      waitUpToClickble.until(ExpectedConditions.elementToBeClickable(element));

  }

}
