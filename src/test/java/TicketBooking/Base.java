package TicketBooking;

import utils.Jsonutils;

import java.io.IOException;
import java.util.Map;

public class Base {
    public  static Map<String, Object> endpointurl;
    static{
        String env=System.getProperty("env")==null ? "qa" : System.getProperty("env");
        System.out.println("user want to test in "+env+" environment");

        try {
            endpointurl = Jsonutils.readEndPointAsMap("createbooking.json",env);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
