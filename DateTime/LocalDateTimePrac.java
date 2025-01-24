package DateTime;

import java.time.LocalDateTime;

public class LocalDateTimePrac {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime customTime = LocalDateTime.of(2025,1,25,6, 10, 30);
        System.out.println(customTime);

        LocalDateTime stringDate = LocalDateTime.parse("2020-01-25T06:10:30");
        System.out.println(stringDate);
    }
}
