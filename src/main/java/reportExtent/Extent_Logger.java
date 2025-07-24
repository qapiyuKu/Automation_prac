package reportExtent;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import java.io.File;

public class Extent_Logger {
    public static void on_pass(String m)
    {
        Extent_Manager.get_thread_ex_test().pass(MarkupHelper.createLabel(m, ExtentColor.GREEN));
    }

    public static void on_fail(String m)
    {
        Extent_Manager.get_thread_ex_test().fail(MarkupHelper.createLabel(m, ExtentColor.RED));
    }

    public static void on_info(String m)
    {
      Extent_Manager.get_thread_ex_test().info(MarkupHelper.createLabel(m,ExtentColor.YELLOW));
    }
    public static void on_log_response(String m)
    {
        Extent_Manager.get_thread_ex_test().pass(MarkupHelper.createLabel(m,ExtentColor.BROWN));
    }
    public static void on_log_reponse_with_screenshot(String m, File file)
    {
       Extent_Manager.get_thread_ex_test().pass(MarkupHelper.
               createLabel(m,ExtentColor.BROWN)).addScreenCaptureFromPath(file.getAbsolutePath());
    }
    public static void on_log_response_with_screenshot_Base64(String m,String base64)
    {
       Extent_Manager.get_thread_ex_test().pass(MarkupHelper.
               createLabel(m,ExtentColor.BROWN)).addScreenCaptureFromBase64String(base64);
    }




}
