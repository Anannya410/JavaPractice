package DateTime;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Formatter {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("2024-12-23"); //string can be given only in this particular format
        System.out.println(localDate);

        String date = "25/04/2025";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate2 = LocalDate.parse(date, dateTimeFormatter);
        System.out.println(localDate2);

        String dateTime = "25/04/2025 10:30:45 IST";
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z");
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(dateTime, dateTimeFormatter2);
        System.out.println(zonedDateTime);
    }
}
