package TicketBooking.LombokPojo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookingLombokdates {

    private String checkin;
    private String checkout;
}
