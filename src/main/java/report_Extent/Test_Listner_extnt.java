package report_Extent;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Test_Listner_extnt implements ISuiteListener, ITestListener {
    public void onStart(ISuite suite)
    {
      Extent_Reporter.ini_reports();
    }
    public void onFinish(ISuite suite)
    {
        Extent_Reporter.end_report();
    }
    public void onTestStart(ITestResult result)
    {
        Extent_Reporter.add_report(result.getName().toString());
    }
public void onTestSuccess(ITestResult result)
{
    Extent_Logger.on_pass(result.getName().toString());
}
public void onTestFailure(ITestResult result)
{
Extent_Logger.on_fail(result.getName().toString());
}
public void onTestSkipped(ITestResult result)
{
    Extent_Logger.on_info(result.getName().toString());
}



}
