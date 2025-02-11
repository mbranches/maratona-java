package academy.devdojo.maratona.classesutilitarias.temporalAdjuster;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ObterPrxDiaUtil implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays =1;
        switch (dayOfWeek) {
            case FRIDAY: addDays = 3; break;
            case SATURDAY: addDays = 2; break;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class Exercicio {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        LocalDateTime NowPrxDiaUtel = now.with(new ObterPrxDiaUtil());
        System.out.println(NowPrxDiaUtel.getDayOfWeek());
    }
}
