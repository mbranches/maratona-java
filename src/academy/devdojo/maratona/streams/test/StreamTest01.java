package academy.devdojo.maratona.streams.test;

import academy.devdojo.maratona.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//1. Order Light Novel by title
//2. Retrieve the first 3 titles Light Novels with price less than 4
public class StreamTest01 {
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
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));

        List<String> titles = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4) {
                titles.add(lightNovel.getTitle());
            }
            if (titles.size() > 2) break;
        }

        System.out.println(lightNovels);
        System.out.println(titles);
    }
}
