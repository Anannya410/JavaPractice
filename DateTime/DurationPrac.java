package DateTime;

import java.time.Duration;
import java.time.Instant;

public class DurationPrac {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);

        Instant start = Instant.now();
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        Instant end = Instant.now();

        Duration d1 = Duration.between(start, end);
        System.out.println("Duration 1 "+d1);

        Instant start1 = Instant.now();
        try{
            Thread.sleep(10000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        Instant end1 = Instant.now();
        Duration d2 = Duration.between(start1, end1);

        System.out.println("Duration 2 "+d2);

        System.out.println("Comparison between d1 and d2 "+d2.compareTo(d1));
    }
}
