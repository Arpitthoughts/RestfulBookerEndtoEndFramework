package ReportingManager;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.Arrays;

public class Setup implements ITestListener {
    private ExtentReports extentReports;
    public static ThreadLocal<ExtentTest>extentTestThreadLocal= new ThreadLocal<>();

    @Override
    public void onStart(ITestContext context) {

        extentReports= ExtentReportManager.createExReportInstance("./Reports/"+ExtentReportManager.getReportName(),ExtentReportManager.getReportName(),"API Automation");

    }

    @Override
    public void onTestStart(ITestResult result) {
ExtentTest test=extentReports.createTest("Test Name -->"+result.getTestClass().getName()+"--"+result.getMethod().getMethodName());
        extentTestThreadLocal.set(test);

    }

    @Override
    public void onTestSuccess(ITestResult result) {

    }

    @Override
    public void onTestFailure(ITestResult result) {

        ExtentReportManager.logFailDetails(result.getThrowable().getMessage());
      String stacktrace=  Arrays.toString(result.getThrowable().getStackTrace());
        stacktrace= stacktrace.replaceAll(",","<br>");
        String formattedStackTrace="<details>\n" +
                "    <summary>Click here to view Exception logs</summary>\n" +
                "    "+stacktrace+"\n" +
                "</details>";

      ExtentReportManager.logExceptionDetails(formattedStackTrace);
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }




    @Override
    public void onFinish(ITestContext context) {

        if(extentReports!=null)
            extentReports.flush();
    }
}
