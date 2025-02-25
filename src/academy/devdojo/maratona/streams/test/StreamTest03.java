package academy.devdojo.maratona.streams.test;

import academy.devdojo.maratona.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Naruto", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Boruto", 5.99),
            new LightNovel("Dragon Ball", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Shippuden", 1.99),
            new LightNovel("Boku no Hero", 4)
    ));

    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        long count = stream.filter(lightNovel -> lightNovel.getPrice() <= 4).count();

        //não posso usar a variavel stream pois quando eu fecho uma stream eu não posso reabrir a mesma
        long distinct = lightNovels.stream()
                .distinct() //se não for comparavel ele não vai conseguir saber qual é destinto
                .count();

        System.out.println(distinct);
        System.out.println(count);
    }
}
