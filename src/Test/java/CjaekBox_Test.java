import baselib.BaseLib;
import org.testng.annotations.Test;
import pages.CjaeckBox_Page;

public class CjaekBox_Test extends BaseLib {
    private CjaeckBox_Page obj;
    @Test(priority = 0)
    public void inilization()
    {
        obj=new CjaeckBox_Page();
    }
    @Test(priority = 1)
    public void test_clickOnElement() throws InterruptedException {
        obj.clickOnElement();
    }
    @Test(priority = 2)
    public void test_clickOnCheckBox() throws InterruptedException {
       obj.clickOnCheckBox();
    }
    @Test(priority = 3)
    public void test_clickOnHome() throws InterruptedException {
        obj.clickOnHome();
    }
    @Test(priority = 4)
    public void test_clickOnDesktop()
    {
        obj.clickOnDesktop();
    }
    @Test(priority = 5)
    public void test_clickOnNote()
    {
        obj.clickOnNote();
    }
    @Test(priority = 6)
    public void test_getCaptureDisplayForNotes()
    {
       obj.getCaptureDisplayForNotes();
    }

}
