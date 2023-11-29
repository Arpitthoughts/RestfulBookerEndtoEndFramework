package TicketBooking.LombokPojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.apache.commons.lang3.stream.Streams;
import utils.DataGeneratorKeys;
import utils.RandomDataGenerate;

import java.util.List;
import java.util.stream.Stream;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookingLombokPojo {

    //Stream.of("male","female","others").findAny().get()
    //private String gender= List.of("male","female","others").get(RandomDataGenerate.getRandomNumber());

    //private Gender gender;
    private String firstname= RandomDataGenerate.getRandomDataFor(DataGeneratorKeys.FIRST_NAME);
    private String lastname=RandomDataGenerate.getRandomDataFor(DataGeneratorKeys.LAST_NAME);
    private int totalprice=RandomDataGenerate.getRandomTotalPrice();
    private boolean depositpaid=true;
    private BookingLombokdates bookingdates=new BookingLombokdates();
    private String additionalneeds="Lunch";


}
