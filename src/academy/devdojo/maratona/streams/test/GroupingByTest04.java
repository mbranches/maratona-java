package academy.devdojo.maratona.streams.test;

import academy.devdojo.maratona.streams.domain.Category;
import academy.devdojo.maratona.streams.domain.LightNovel;
import academy.devdojo.maratona.streams.domain.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingByTest04 {
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
        Map<Category, DoubleSummaryStatistics> staticsGrupCategory = lightNovels.stream()
                .collect(Collectors.groupingBy(
                        LightNovel::getCategory,
                        Collectors.summarizingDouble(LightNovel::getPrice))
                );
        System.out.println(staticsGrupCategory);

        //Map<Category, List<Promotion>>
        Map<Category, Set<Promotion>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(
                        LightNovel::getCategory,
                        Collectors.mapping(GroupingByTest04::getPromotion, Collectors.toSet())
                ));
        System.out.println(collect);

        Map<Category, LinkedHashSet<Promotion>> collect2 = lightNovels.stream()
                .collect(Collectors.groupingBy(
                        LightNovel::getCategory,
                        Collectors.mapping(GroupingByTest04::getPromotion, Collectors.toCollection(LinkedHashSet::new))
                ));

        System.out.println(collect2);
    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
