package DateTime;

import java.time.LocalTime;

public class LocalTimePrac {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("The current time is : "+now);

        LocalTime customTime = LocalTime.of(14, 30, 30);
        System.out.println("The custom time is : "+customTime);

        String timeInString = "15:30";
        LocalTime timeFromString = LocalTime.parse(timeInString);
        System.out.println("The time converted from string : "+timeFromString);
    }
}
