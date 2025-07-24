package reportExtent;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.File;


public class Extent_Reporter {
    private static  ExtentReports extentReports;
    private static ExtentTest extenttest ;

    public static void inti_report()
    {
        extentReports = new ExtentReports();
        File fil=new File("C:\\Users\\Nitin\\IdeaProjects\\Automation_prac\\src\\main\\resources\\spark.html");
        ExtentSparkReporter spark = new ExtentSparkReporter(fil);
        extentReports.attachReporter(spark);
    }
    public static void add_Report(String m)
    {

        extenttest=extentReports.createTest(m);
        Extent_Manager.set_thread_ex_test(extenttest);
    }
    public static void end_Report()
    {

        extentReports.flush();
    }



}
