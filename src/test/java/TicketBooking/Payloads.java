package TicketBooking;


import TicketBooking.LombokPojo.BookingLombokPojo;
import TicketBooking.LombokPojo.BookingLombokdates;
import TicketBooking.Pojos.BookingPojo;
import TicketBooking.Pojos.Bookingdates;
import net.datafaker.Faker;
import utils.DataGeneratorKeys;
import utils.RandomDataGenerate;

import java.util.HashMap;
import java.util.Map;

public class Payloads {

    public static String getCreateBookingPayloadAsString(Boolean depositPaid, String checkin, String checkout, String additionalneeds) {

        Faker faker = new Faker();
        String fName = faker.name().firstName();
        String lName = faker.name().lastName();
        int totalPrice = Integer.parseInt(faker.number().digits(4));

        return "{\n" +
                "    \"firstname\" : \"" + fName + "\",\n" +
                "    \"lastname\" : \"" + lName + "\",\n" +
                "    \"totalprice\" : " + totalPrice + ",\n" +
                "    \"depositpaid\" : " + depositPaid + ",\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"" + checkin + "\",\n" +
                "        \"checkout\" : \"" + checkout + "\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"" + additionalneeds + "\"\n" +
                "}";
    }

    public static void getCreateBookingPayloadFromMap(String fName, String lName, int totalPrice, Boolean depositPaid, String checkin, String checkout, String additionalneeds) {

        Map<String, Object> payload = new HashMap<String, Object>();
        payload.put("firstname", fName);
        payload.put("lastname", lName);
        payload.put("totalprice", totalPrice);
        payload.put("depositpaid", depositPaid);
        payload.put("bookingdates", checkin);

        payload.put("", additionalneeds);

    }

    public static BookingPojo getCreateBookingPayloadAsPojo() {
        BookingPojo bookingPojo = new BookingPojo();
        bookingPojo.setFirstname(RandomDataGenerate.getRandomDataFor(DataGeneratorKeys.FIRST_NAME));
        bookingPojo.setLastname(RandomDataGenerate.getRandomDataFor(DataGeneratorKeys.LAST_NAME));
        bookingPojo.setTotalprice(RandomDataGenerate.getRandomTotalPrice());
        bookingPojo.setDepositpaid(true);

        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2018-01-01");
        bookingdates.setCheckout("2019-01-01");
        bookingPojo.setBookingdates(bookingdates);
        bookingPojo.setAdditionalneeds("Lunch");

        return bookingPojo;
    }


    public static BookingLombokPojo getPayloadAsLombokPojo()
    {

        BookingLombokdates bookinglombokdates = BookingLombokdates.builder().checkin("2018-01-01").checkout("2019-01-01").build();

        BookingLombokPojo bookinglombokpojo = BookingLombokPojo.builder().firstname(RandomDataGenerate.getRandomDataFor(DataGeneratorKeys.FIRST_NAME)).
                lastname(RandomDataGenerate.getRandomDataFor(DataGeneratorKeys.LAST_NAME)).
                totalprice(RandomDataGenerate.getRandomTotalPrice()).
                depositpaid(true).bookingdates(bookinglombokdates).additionalneeds("breakfast").build();


        return bookinglombokpojo;
    }



}
