package report_Extent;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import java.io.File;

public class Extent_Logger {
    public static void on_pass(String m)
    {
        Extent_manager.get_thread_exe_test().pass(MarkupHelper.createLabel(m, ExtentColor.GREEN));
    }
    public static void on_fail(String m)
    {
        Extent_manager.get_thread_exe_test().fail(MarkupHelper.createLabel(m, ExtentColor.RED));
    }
    public static void on_info(String m)
    {
        Extent_manager.get_thread_exe_test().info(MarkupHelper.createLabel(m, ExtentColor.YELLOW));
    }
    public static void on_log_response(String m)
    {
        Extent_manager.get_thread_exe_test().info(MarkupHelper.createLabel(m, ExtentColor.BROWN));
    }
    public static void on_log_response(String m, File file)
    {
        Extent_manager.get_thread_exe_test().info(MarkupHelper.createLabel(m, ExtentColor.BROWN)).addScreenCaptureFromPath(file.getAbsolutePath());
    }

}
