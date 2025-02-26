package academy.devdojo.maratona.streams.test;

import academy.devdojo.maratona.streams.domain.Category;
import academy.devdojo.maratona.streams.domain.LightNovel;
import academy.devdojo.maratona.streams.domain.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingByTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Naruto", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99, Category.FANTASY),
            new LightNovel("Boruto", 5.99, Category.FANTASY),
            new LightNovel("Dragon Ball", 2.99, Category.DRAMA),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Shippuden", 1.99, Category.FANTASY),
            new LightNovel("Boku no Hero", 4, Category.ROMANCE)
    ));

    public static void main(String[] args) {
        Map<Category, Long> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream()
                .collect(
                        Collectors.groupingBy(
                                LightNovel::getCategory,
                                Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)))
                );

        System.out.println(collect1);

        Map<Category, LightNovel> collect2 = lightNovels.stream()
                .collect(
                        Collectors.groupingBy(
                                LightNovel::getCategory,
                                Collectors.collectingAndThen(
                                        Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)),
                                        Optional::get
                                )
                        )
                );

        System.out.println(collect2);

    }
}
