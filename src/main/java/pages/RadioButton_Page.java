package pages;

import baselib.BaseLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reportExtent.Extent_Logger;
import utilites.JavaScriptUtility;
import utilites.ScreenshotUtility;
import utilites.WaitUtility;

import java.io.File;
import java.io.IOException;

public class RadioButton_Page extends BaseLib {
    private WebDriver driver;

    public RadioButton_Page()
    {
        this.driver=BaseLib.driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//div[@class='card mt-4 top-card'])[1]")
    private WebElement login;
    @FindBy(xpath = "//span[text()='Radio Button']")
    private WebElement Radiobutton;
    @FindBy(xpath = "//input[@id='yesRadio']")
    private WebElement YesRadiobutton;
    @FindBy(xpath = "//span[text()='Yes']")
    WebElement Titele_Yes;
    public void click_WebElement()
    {
        JavaScriptUtility.scrollUptoElement(login,driver);
        login.click();
    }
    public void clickOn_RadioButton() throws InterruptedException {
        Radiobutton.click();
        WaitUtility.hardCodedwait(1);
    }
    public void clickOn_Yes_RadioButton() throws IOException {
        try {
            JavaScriptUtility.scrollUptoElement(YesRadiobutton,driver);
            YesRadiobutton.click();
        }
        catch (Exception e)
        {
            File x = ScreenshotUtility.screenshotFile(driver, "clickOn_Yes_RadioButton");
            Extent_Logger.on_log_reponse_with_screenshot("clickOn_Yes_RadioButton",x);
            String s = ScreenshotUtility.screenshotBase64(driver, "gfghfhghg");
            Extent_Logger.on_log_response_with_screenshot_Base64("popopooo", s);
            Extent_Logger.on_fail("Fail");
        }
    }
    public void titlevaerify_YesButton()
    {
        String s = Titele_Yes.getText();
        System.out.println(s);
        Assert.assertEquals(s,"Yes");
    }




}
