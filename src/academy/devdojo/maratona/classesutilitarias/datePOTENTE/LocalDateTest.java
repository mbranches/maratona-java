package academy.devdojo.maratona.classesutilitarias.datePOTENTE;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest {
    public static void main(String[] args) {
//        System.out.println(new Date());
//        System.out.println(Calendar.getInstance());
        LocalDate date = LocalDate.of(2022, Month.JANUARY, 27);
        LocalDate agora = LocalDate.now();
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear()); //ano bissexto

        System.out.println();

        System.out.println(agora);
    }
}
