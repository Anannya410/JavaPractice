package DateTime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodPrac {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate then = LocalDate.of(2025,1,18);

        Period between = Period.between(now, then);
        System.out.println(between.getDays());
    }
}
