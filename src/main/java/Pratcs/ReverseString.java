package Pratcs;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;

public class ReverseString implements ISuiteListener, ITestListener {

    @Override
    public void onFinish(ISuite suite) {
        ISuiteListener.super.onFinish(suite);
    }

    public static void main(String[] args) {

    }

}
