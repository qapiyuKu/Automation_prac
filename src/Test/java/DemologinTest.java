import baselib.BaseLib;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.DemologinPage;

import java.io.IOException;

public class DemologinTest extends BaseLib {

   private DemologinPage obj;
   @Test(priority = 1)
   public void test_Driver_Initialization() throws IOException
   {
     obj=new DemologinPage();
   }
   @Test(priority = 2)
    public void test_loginclick_element()
    {

        obj.loginclick_element();
    }
}
