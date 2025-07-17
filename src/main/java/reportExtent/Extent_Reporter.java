package reportExtent;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.File;


public class Extent_Reporter {
    private static  ExtentReports extentReports;

    public static void inti_report()
    {
        extentReports = new ExtentReports();
        File fil=new File("");
        ExtentSparkReporter spark = new ExtentSparkReporter(fil);
        extentReports.attachReporter(spark);
    }
    public static void add_Report(String m)
    {

        extentReports.createTest(m);
    }
    public static void end_Report()
    {

        extentReports.flush();
    }



}
