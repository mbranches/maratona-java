package academy.devdojo.maratona.streams.test;

import academy.devdojo.maratona.streams.domain.Category;
import academy.devdojo.maratona.streams.domain.LightNovel;
import academy.devdojo.maratona.streams.domain.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByTest02 {
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
        Map<Promotion, List<LightNovel>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(ln ->
                        ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
                ));

        System.out.println(collect);

        //Ordenando os ordenados por categoria, por promoção
        //Map<Category, Map<Promotion, List<LightNovel>>

        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(
                        LightNovel::getCategory,
                        Collectors.groupingBy(
                                ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
                        )));

        for (Map.Entry<Category,Map<Promotion, List<LightNovel>>> entry : collect1.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Map.Entry<Promotion, List<LightNovel>> entry2 : entry.getValue().entrySet()) {
                System.out.println("    " + entry2.getKey() + ":");
                entry2.getValue().forEach(v -> System.out.println("        " + v));
            }

        }
    }
}
