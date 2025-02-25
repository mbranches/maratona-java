package academy.devdojo.maratona.streams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapTest01 {
    public static void main(String[] args) {
        List<List<String>> business = new ArrayList<>();
        List<String> graphicDesigners = List.of("William", "Lucas", "Roberto");
        List<String> devs = List.of("Marcus", "Vinicius", "Lima");
        List<String> teachers = List.of("Mario", "Silveira", "Maria");

        business.add(graphicDesigners);
        business.add(devs);
        business.add(teachers);

//        for (List<String> cargo : business) {
//            for (String people : cargo) {
//                System.out.println(people);
//            }
//            System.out.println();
//        }

        business.stream() //List<List<String>> -> Stream<List<String>
                .flatMap(Collection::stream) //Stream<List<String> -> List<String> -> Stream<String> -- ou seja, ta indo no ultimo nivel
                .forEach(System.out::println);

    }
}
