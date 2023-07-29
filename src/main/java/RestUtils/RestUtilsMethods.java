package RestUtils;

import ReportingManager.ExtentReportManager;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

import java.util.Map;

public class RestUtilsMethods {

    private static RequestSpecification getRequestSpecification(String endPoint, Object Payload, Map<String,Object> headers){
       return RestAssured.given().log().all().baseUri(endPoint).header("Content-Type","application/json").body(Payload);

    }

    private static void printRequestLogInReport(RequestSpecification requestSpecification){

        QueryableRequestSpecification queryableRequestSpecification=SpecificationQuerier.query(requestSpecification);
        ExtentReportManager.logInfoDetails("Base URI is "+queryableRequestSpecification.getBaseUri());
        ExtentReportManager.logInfoDetails("Http Method is "+queryableRequestSpecification.getMethod());
        ExtentReportManager.logInfoDetails("Headers are "+queryableRequestSpecification.getHeaders());
        ExtentReportManager.logInfoDetails("Request body is ");
        ExtentReportManager.logJson(queryableRequestSpecification.getBody());
    }


    private static void printResponseLogInReport(Response response){

        ExtentReportManager.logInfoDetails("Status code is "+ response.getStatusCode());
        ExtentReportManager.logInfoDetails("Response body is ");
        ExtentReportManager.logJson(response.getBody().prettyPrint());
        ExtentReportManager.logInfoDetails("Response headers are "+ response.getHeaders().asList().toString());
    }


    public static Response performPost(String endPoint, Object Payload, Map<String,Object> headers){


        RequestSpecification request=getRequestSpecification(endPoint,Payload,headers);
        Response response=request.when().post();
        printRequestLogInReport(request);
        printResponseLogInReport(response);
        return response;

    }
}
