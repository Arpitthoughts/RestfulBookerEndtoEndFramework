package TicketBooking;



import TicketBooking.LombokPojo.BookingLombokPojo;
import TicketBooking.Pojos.BookingPojo;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


import javax.imageio.stream.ImageInputStream;
import java.io.IOException;

public class BookingTests extends BookingAPIS {


    @Test(enabled = false)
    public void createBookingTest() throws IOException {

       /* String env=System.getProperty("env")==null ? "qa" : System.getProperty("env");
        System.out.println("user want to test in "+env+" environment");*/

      /*  String payload = Payloads.getCreateBookingPayloadAsString(true,
                "2018-01-01", "2019-01-01", "Lunch");*/




        //Response response = BookingAPIS.createTicketBooking(Payloads.getPayloadAsLombokPojo());

        //Using all values as default

        //BookingLombokPojo payload=new BookingLombokPojo();
        //Response response = BookingAPIS.createTicketBooking(payload);

        //Using all default values except firstname

       /* BookingLombokPojo payload=new BookingLombokPojo().toBuilder().firstname("Arpit").build();
        Response  response= createTicketBooking(payload);

        Assert.assertEquals(response.getStatusCode(),200);
        */

     //   BookingLombokPojo payload=new BookingLombokPojo().toBuilder().gender(Gender.male).build();
       // System.out.println(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(payload));

    }



    @Test
    public void createBookingAndReceiveResponse() throws JsonProcessingException {

        BookingLombokPojo payload=new BookingLombokPojo();
        Response response=createTicketBooking(payload);
        BookingLombokPojo actualBooking= response.getBody().jsonPath().getObject("booking", BookingLombokPojo.class);

       Assert.assertEquals(actualBooking,payload);

        System.out.println("Additional needs value is "+actualBooking.getAdditionalneeds());

    }
}
