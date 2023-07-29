package TicketBooking;



import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.DataGeneratorKeys;
import utils.Jsonutils;
import utils.RandomDataGenerate;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BookingTests extends BookingAPIS {


    @Test
    public void createBookingTest() throws IOException {

       /* String env=System.getProperty("env")==null ? "qa" : System.getProperty("env");
        System.out.println("user want to test in "+env+" environment");*/

      /*  String payload = Payloads.getCreateBookingPayloadAsString(true,
                "2018-01-01", "2019-01-01", "Lunch");*/




        Response response = BookingAPIS.createTicketBooking(Payloads.getPayloadAsLombokPojo());

        Assert.assertEquals(response.getStatusCode(),200);


    }
}
