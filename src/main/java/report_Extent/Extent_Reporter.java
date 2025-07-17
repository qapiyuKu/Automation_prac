package report_Extent;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.File;

public class Extent_Reporter {

private static ExtentReports extentReports;
private static ExtentTest extenttest;
private static ExtentSparkReporter  spark;
        public static void ini_reports()
        {
            extentReports=new ExtentReports();
            File file=new File("C:\\Users\\Nitin\\IdeaProjects\\Automation_prac\\src\\Test\\resources\\reports" +
                    "spardf.html");
             spark=new ExtentSparkReporter(file);
            extentReports.attachReporter(spark);
        }
    public static void add_report(String m)
    {
         extenttest=extentReports.createTest(m);
         Extent_manager.set_thread_exe_test(extenttest);
    }
    public static void end_report()
    {
        extentReports.flush();
    }



}
