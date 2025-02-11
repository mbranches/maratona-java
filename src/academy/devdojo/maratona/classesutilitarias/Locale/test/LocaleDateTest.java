package academy.devdojo.maratona.classesutilitarias.Locale.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleDateTest {
    public static void main(String[] args) {
        //pt-br
        Locale localeBR = new Locale("pt", "BR");
        Locale localeItaly = new Locale("it", "IT");
        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeBR);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);

        System.out.println("BR: " + df1.format(calendar.getTime()));
        System.out.println("Italy: " + df2.format(calendar.getTime()));

        System.out.println(localeBR.getDisplayCountry());
        System.out.println(localeBR.getDisplayCountry(localeItaly));
    }
}
