package report_Extent;

import com.aventstack.extentreports.ExtentTest;

public class Extent_manager {

    public static ThreadLocal<ExtentTest>thread_ext_test=new ThreadLocal<>();
    public static void set_thread_exe_test(ExtentTest ex_test)
    {
        thread_ext_test.set(ex_test);
    }
    public static ExtentTest get_thread_exe_test()
    {
        return thread_ext_test.get();
    }
}
