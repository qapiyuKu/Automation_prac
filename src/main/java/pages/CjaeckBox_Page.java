package pages;

import baselib.BaseLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilites.JavaScriptUtility;
import utilites.WaitUtility;

public class CjaeckBox_Page extends BaseLib {
    private WebDriver driver;
    String DisplayValue="";
    String ExpectedvalueForNotes="notes";
    public CjaeckBox_Page()
    {
        this.driver=BaseLib.driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//div[@class='card mt-4 top-card'])[1]")
    private WebElement Element;
    @FindBy(xpath = "//span[text()='Check Box']")
    private WebElement CheckBoxButton;
    @FindBy(xpath = "((//button[@type='button'])[4])")
    private WebElement HomeButton;
    @FindBy(xpath = "(//button[@title='Toggle'])[2]")
    private WebElement DesktopButton;
    @FindBy(xpath = "//span[text()='Notes']")
    private WebElement Notes;
    @FindBy(xpath = "//span[text()='notes']")
    private WebElement DisplayNotes;

    public void clickOnElement()
    {
        Element.click();
    }
    public void clickOnCheckBox() throws InterruptedException {
        CheckBoxButton.click();
        WaitUtility.hardCodedwait(1);
    }
    public void clickOnHome() throws InterruptedException {
        HomeButton.click();
        JavaScriptUtility.scrollUptoElement(DesktopButton,driver);
        WaitUtility.elementToBeClickable(driver,10,DesktopButton);

    }
    public void clickOnDesktop()
    {
        DesktopButton.click();
    }
    public void clickOnNote()
    {
        Notes.click();
    }

    public String getCaptureDisplayForNotes()
    {
         DisplayValue = DisplayNotes.getText();
        Assert.assertEquals(DisplayValue, ExpectedvalueForNotes, "Value miss match");
         return DisplayValue;
    }


}
