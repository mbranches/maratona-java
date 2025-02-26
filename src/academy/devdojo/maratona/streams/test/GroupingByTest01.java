package academy.devdojo.maratona.streams.test;

import academy.devdojo.maratona.streams.domain.Category;
import academy.devdojo.maratona.streams.domain.LightNovel;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingByTest01 {
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
        Map<Category, List<LightNovel>> categoryLightNovelMap = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()) {
                case DRAMA : drama.add(lightNovel); break;
                case FANTASY: fantasy.add(lightNovel); break;
                case ROMANCE: romance.add(lightNovel); break;
            }

            categoryLightNovelMap.put(Category.DRAMA, drama);
            categoryLightNovelMap.put(Category.FANTASY, fantasy);
            categoryLightNovelMap.put(Category.ROMANCE, romance);
        }

        System.out.println(categoryLightNovelMap);

        //COM COLLECTORS:

        Map<Category, List<LightNovel>> groupBY = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory));

        System.out.println(groupBY);
    }
}
