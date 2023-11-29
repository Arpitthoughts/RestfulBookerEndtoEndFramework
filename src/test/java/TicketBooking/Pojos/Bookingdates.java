package TicketBooking.Pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;


@Data
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Bookingdates {

    private String checkin;
    private String checkout;

}
