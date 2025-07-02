package pages;

import baselib.BaseLib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class DemologinPage extends BaseLib {
   private  WebDriver driver;
   public DemologinPage() throws IOException {

//       this.driver = BaseLib.launch_driver();
       this.driver = BaseLib.driver;
      PageFactory.initElements(driver,this);
   }

@FindBy(xpath = "(//div[@class='card mt-4 top-card'])[1]")
   private WebElement login;


    public void loginclick_element()
    {
        login.click();

    }

}
