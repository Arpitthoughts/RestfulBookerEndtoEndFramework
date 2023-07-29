package TicketBooking.LombokPojo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookingLombokPojo {

    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private BookingLombokdates bookingdates;
    private String additionalneeds;


}
