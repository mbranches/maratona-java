package academy.devdojo.maratona.lambdas.test;

import academy.devdojo.maratona.lambdas.domain.Anime;
import academy.devdojo.maratona.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

//Reference to a non-static method directly from the class
public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Marcus", "Vinicius", "Branches"));
        names.sort(String::compareTo);
        System.out.println(names);
        Function<String, Integer> numStringToInteger = Integer::parseInt;
        System.out.println(numStringToInteger.apply("10"));

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(names, "Marcus"));
    }

}
