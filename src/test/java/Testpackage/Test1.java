package Testpackage;

import java.text.Normalizer;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Test1 {

    public static void main(String[] args) {

      LocalDate ld=  LocalDate.now();
        System.out.println(ld);

        LocalDate ld1= LocalDate.now(ZoneId.of("America/Chicago"));
        System.out.println(ld1);

        System.out.println(LocalDate.now().minusDays(1));

        DateTimeFormatter Format=  DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        System.out.println(LocalDate.now().format(Format));

        LocalTime.now();

    }
}
