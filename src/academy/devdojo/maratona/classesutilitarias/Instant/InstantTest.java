package academy.devdojo.maratona.classesutilitarias.Instant;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest {
    public static void main(String[] args) {
        Instant agr = Instant.now();
        System.out.println(agr); //zulutime
        System.out.println(LocalDateTime.now());
    }
}
