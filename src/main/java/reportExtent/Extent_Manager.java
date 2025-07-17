package reportExtent;

import com.aventstack.extentreports.ExtentTest;

public class Extent_Manager {

 private static ThreadLocal<ExtentTest>thread_ex_test=new ThreadLocal<>();
 public static void set_thread_ex_text(ExtentTest ex_text)
 {
     thread_ex_test.set(ex_text);
 }
 public static ExtentTest get_thread_ex_test()
 {
    return thread_ex_test.get();
 }

}
