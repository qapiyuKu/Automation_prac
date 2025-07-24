package reportExtent;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Test_Listner_for_Ectent_Report_testng implements ISuiteListener, ITestListener {

    public void onStart(ISuite suite) {
        Extent_Reporter.inti_report();
    }

    public void onFinish(ISuite suite) {
        Extent_Reporter.end_Report();
    }

    public void onTestStart(ITestResult result) {
        Extent_Reporter.add_Report(result.getMethod().getMethodName().toString());
    }

    public void onTestSuccess(ITestResult result) {
        Extent_Logger.on_pass(result.getMethod().getMethodName().toString());
    }

    public void onTestFailure(ITestResult result) {
        Extent_Logger.on_fail(result.getMethod().getMethodName().toString());
    }


    public void onTestSkipped(ITestResult result) {
        Extent_Logger.on_info(result.getMethod().getMethodName().toString());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        Extent_Logger.on_info(result.getMethod().getMethodName().toString());
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        Extent_Logger.on_info(result.getMethod().getMethodName().toString());
    }

}
