package academy.devdojo.maratona.streams.test;

import academy.devdojo.maratona.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//1. Order Light Novel by title
//2. Retrieve the first 3 titles Light Novels with price less than 4
public class StreamTest02 {
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
        List<String> lightNovelsFiltered = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(lightNovelsFiltered);
    }
}
