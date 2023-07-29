package TicketBooking;

import RestUtils.RestUtilsMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.Map;

import static TicketBooking.Base.endpointurl;

public class BookingAPIS {

    public static Response createTicketBooking(Object payload) {

        String endpoint = (String) Base.endpointurl.get("createBookingEndpoint");


        Response response = RestUtilsMethods.performPost(endpoint, payload, new HashMap<>());
        return response;
    }

}
