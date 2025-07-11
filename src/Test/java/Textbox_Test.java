import baselib.BaseLib;
import org.testng.annotations.Test;
import pages.Textbox_Page;

import java.io.IOException;

public class Textbox_Test extends BaseLib {
    private  Textbox_Page obj;
    @Test(priority = 0)
    public void testDriverInitilization()
    {
        obj=new Textbox_Page();
    }
    @Test(priority = 1)
    public void test_loginclick_element()
    {
        obj.loginclick_element();

    }
    @Test(priority = 2)
    public void  test_click_OnTextBoxButton()
    {
      obj.click_OnTextBoxButton();
    }
    @Test(priority = 3)
    public void enter_FullName() throws IOException {
        obj.enter_FullName();
    }
    @Test(priority = 4)
    public void enter_Emaild() throws IOException {
        obj.enter_Emaild();
    }
    @Test(priority = 5)
    public void enter_CurrentAddress() throws IOException {
        obj.enter_CurrentAddress();
    }
    @Test(priority = 6)
    public void enter_PermanentAddress() throws IOException {
        obj.enter_PermanentAddress();
    }
    @Test(priority = 7)
    public void click_SubmitButton()
    {
        obj.click_SubmitButton();
    }

}
