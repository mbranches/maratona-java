package academy.devdojo.maratona.streams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapTest02 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("Sei", "lá", "mano"));
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));

        Stream<String> stringStream = words.stream()
                .map(w -> w.split("")) //Stream<String[]>
                .flatMap(Arrays::stream);

        System.out.println(stringStream.toList());
    }
}
