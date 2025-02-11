package academy.devdojo.maratona.classesutilitarias.Duration;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        //Local date nao suportado pois não ha segundos nela. para ela se utiliza PERIOD

        LocalDateTime agr = LocalDateTime.now();
        LocalDateTime nowAfterTwoYear = LocalDateTime.now().plusYears(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime timePlu7hours = timeNow.plusHours(7);

        System.out.println(Duration.between(agr, nowAfterTwoYear));
        System.out.println(Duration.between(timePlu7hours, timeNow));
    }
}
