package academy.devdojo.maratona.classesutilitarias.localtimePOTENTE;

import java.time.LocalTime;

public class LocaTimeTest {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.of(23, 30, 57);
        LocalTime agr = LocalTime.now();
        System.out.println(lt);
        System.out.println(agr);

        System.out.println();

        System.out.println(lt.getHour());
        System.out.println(lt.getMinute());
        System.out.println(lt.getSecond());
    }
}
