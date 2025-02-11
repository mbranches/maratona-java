package academy.devdojo.maratona.classesutilitarias.localdatetimePOTENTE;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateTimePOTENTE {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDate date = LocalDate.of(2022, Month.MARCH, 6);
        LocalTime time = LocalTime.of(9, 45, 0);
        LocalDateTime dateTime = date.atTime(time);
        LocalDateTime timeDate = time.atDate(date);
        System.out.println(dateTime);
        System.out.println(timeDate);
    }
}
