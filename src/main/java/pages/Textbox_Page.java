package pages;

import baselib.BaseLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Textbox_Page extends BaseLib
{
    private WebDriver driver;

    public Textbox_Page()
    {
        this.driver=BaseLib.driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//div[@class='card mt-4 top-card'])[1]")
    private WebElement login;

    @FindBy(xpath = "//span[text()='Text Box']")
    private WebElement TextBoxButton;
    @FindBy(xpath = "//input[@id='userName']")
    private WebElement FUllName;
    @FindBy(xpath = "//input[@id='userEmail']")
    private WebElement EmailId;
    @FindBy(xpath = "//textarea[@id='currentAddress']")
    private WebElement CurrentAddress;
    @FindBy(xpath = "//textarea[@id='permanentAddress']")
    private WebElement PeemanentAddress;
    @FindBy(xpath = "//button[@id='submit']")
    private WebElement SubmitButton;

    public void loginclick_element()
    {
        login.click();

    }

    public void click_OnTextBoxButton()
{
    TextBoxButton.click();
}
    public void enter_FullName()
{
    FUllName.sendKeys("Piyush");
}

    public void enter_Emaild()
{
    EmailId.sendKeys("Piytush@gmail.com");
}

    public void enter_CurrentAddress()
{
    CurrentAddress.sendKeys("NOIDA");
}

    public void enter_PermanentAddress()
{
    PeemanentAddress.sendKeys("Bihar");
}
    public void click_SubmitButton()
{
    SubmitButton.click();
}




}
