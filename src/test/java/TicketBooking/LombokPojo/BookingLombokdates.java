package TicketBooking.LombokPojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Data
@Builder()
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookingLombokdates {

    private String checkin="2018-01-01";
    private String checkout="2019-01-01";
}
