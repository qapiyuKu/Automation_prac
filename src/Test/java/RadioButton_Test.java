import baselib.BaseLib;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DemologinPage;
import pages.RadioButton_Page;
import utilites.PrintUtility;
import utilites.WaitUtility;

import java.io.IOException;

public class RadioButton_Test extends BaseLib {
    private RadioButton_Page obj;
    private static Logger logger= LogManager.getLogger(RadioButton_Test.class);
    @Test(priority = 1)
    public void test_Driver_Initialization() throws IOException
    {
        logger.debug("hfiuyhaihfiuhsd");
        logger.info("hfiuyhaihfiuhsd");
        obj=new RadioButton_Page();
    }
    @Test(priority = 2)
    public void test_click_WebElement()
    {
        obj.click_WebElement();
    }
    @Test(priority = 3)
    public void test_clickOn_RadioButton() throws InterruptedException {
       obj.clickOn_RadioButton();
    }
    @Test(priority = 4)
    public void test_clickOn_Yes_RadioButton() throws IOException {
        obj.clickOn_Yes_RadioButton();
    }
    @Test(priority = 5)
    public void test_titlevaerify_YesButton()
    {
       obj.titlevaerify_YesButton();
    }

}
