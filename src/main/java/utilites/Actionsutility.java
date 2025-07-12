package utilites;

import baselib.BaseLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actionsutility  {

    static Actions act;


    public void MouseHover(WebDriver driver , WebElement element)
    {
        act=new Actions(driver);
        act.moveToElement(element).perform();
    }
    public void ClickandHold(WebDriver driver,WebElement element)
    {
        act=new Actions(driver);
        act.clickAndHold(element).perform();;
    }
    public void Rightclick(WebDriver driver,WebElement element)
    {
        act=new Actions(driver);
        act.contextClick(element).perform();
    }
    public void DoubleClick(WebDriver driver,WebElement element)
    {
        act=new Actions(driver);
        act.doubleClick(element).perform();
    }
    public void DragandDrop(WebDriver driver,WebElement source, WebElement target)
    {
        act=new Actions(driver);
        act.dragAndDrop(source,target).perform();
    }

}
