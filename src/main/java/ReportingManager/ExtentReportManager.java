package ReportingManager;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ExtentReportManager {

public static ExtentReports extentReports;
    public static ExtentReports createExReportInstance(String filePath, String reportName, String documentTitle){

        ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter(new File(filePath));
        extentSparkReporter.config().setReportName(reportName);
        extentSparkReporter.config().setDocumentTitle(documentTitle);
        extentSparkReporter.config().setTheme(Theme.DARK);
        extentSparkReporter.config().setEncoding("utf-8");

        extentReports= new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);

        return extentReports;
    }


    public static String getReportName(){
        DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss");
        LocalDateTime localDateTime=LocalDateTime.now();
       String formattedDateTime= dateTimeFormatter.format(localDateTime);
       String fileName = "API Automation Report"+formattedDateTime+".html";
       return fileName;

    }

    public static void logPassDetails(String log){

        Setup.extentTestThreadLocal.get().pass(MarkupHelper.createLabel(log, ExtentColor.GREEN));

    }

    public static void logFailDetails(String log){

        Setup.extentTestThreadLocal.get().fail(MarkupHelper.createLabel(log, ExtentColor.RED));


    }
    public static void logExceptionDetails(String log){

        Setup.extentTestThreadLocal.get().fail(log);


    }
    public static void logInfoDetails(String log){

        Setup.extentTestThreadLocal.get().info(MarkupHelper.createLabel(log, ExtentColor.GREY));

    }
    public static void logWarnDetails(String log){

        Setup.extentTestThreadLocal.get().warning(MarkupHelper.createLabel(log, ExtentColor.YELLOW));

    }

    public static void logJson(String json){

        Setup.extentTestThreadLocal.get().info(MarkupHelper.createCodeBlock(json, CodeLanguage.JSON));

    }

  /*  public static void logHeaders(List headersList){

        String[][] arrayHeaders = headersList.stream().map(header ->new String[] {header.getName(), header.getValue() })
                .toArray(String[][] :: new);
        Setup.extentTestThreadLocal.get().info(MarkupHelper.createTable(arrayHeaders));

    }*/
}
