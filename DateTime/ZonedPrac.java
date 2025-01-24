package DateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedPrac {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        Set<String> availableZones = ZoneId.getAvailableZoneIds();
        availableZones.forEach(System.out::println);
        //Here are not required to use the Stream class because the Set interface implements the iterable interface which proved forEach implementation
        //All collections can do this

        //But to use other Stream specific functions we will need to convert it to a stram
        availableZones.stream()
                .filter(zone -> zone.contains("America"))
                .forEach(System.out::println);


        ZonedDateTime zonedDateTime = ZonedDateTime.of(2025, 12, 1, 14, 30, 30, 20, ZoneId.of("America/New_York"));
        System.out.println(zonedDateTime);

        System.out.println();
        ZonedDateTime indiaTime = ZonedDateTime.now();
        System.out.println("Time in india right now : "+indiaTime);

        System.out.println();
        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Time in new york right now : "+newYorkTime);
    }
}
