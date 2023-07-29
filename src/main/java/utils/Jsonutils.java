package utils;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Jsonutils {
   private static ObjectMapper objectMapper=  new ObjectMapper();
    public static Map<String, Object> readEndPointAsMap(String fileName, String env) throws IOException {

        String filepath = "./src/test/resources/ticketbooking/"+env+"/"+fileName;
     Map<String,Object> endpointurl=   objectMapper.readValue(new File(filepath), new TypeReference<>() {});


     return endpointurl;
    }
}
