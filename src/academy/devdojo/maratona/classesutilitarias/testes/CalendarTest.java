package academy.devdojo.maratona.classesutilitarias.testes;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) System.out.println("domingo é o primeiro dia da semana");

        System.out.println(c.get(Calendar.DAY_OF_YEAR));

        c.add(Calendar.DAY_OF_MONTH, 2);
        Date date = c.getTime();
        System.out.println(date);
    }
}
