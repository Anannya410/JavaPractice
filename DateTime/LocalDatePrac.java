package DateTime;

import java.time.LocalDate;
import java.time.Month;

public class LocalDatePrac {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate myDate = LocalDate.of(2019, 1, 1);
        int dayOfMonth = now.getDayOfMonth();
        Month month = now.getMonth();
        int monthInt = now.getMonthValue();
        int year = now.getYear();

        System.out.println(dayOfMonth);
        System.out.println(month);
        System.out.println(monthInt);
        System.out.println(year);


        System.out.println();
        LocalDate today = LocalDate.now();
        System.out.println("Today : "+today);
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("Tomorrow : "+tomorrow);
        LocalDate yesterday = LocalDate.now().minusDays(1);
        System.out.println("Yesterday : "+yesterday);
        LocalDate pastMonth = LocalDate.now().minusMonths(1);
        System.out.println("Past Month : "+pastMonth);

        if(today.isAfter(yesterday)) System.out.println("Hello world!");
    }
}
