package academy.devdojo.maratona.streams.test;

import academy.devdojo.maratona.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsTest01 {
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
        DoubleSummaryStatistics summaryPrice = lightNovels.stream()
                .collect(Collectors.summarizingDouble(LightNovel::getPrice));

        System.out.println(summaryPrice);

        String titles = lightNovels.stream()
                .map(LightNovel::getTitle)
                .collect(Collectors.joining(", ")); // ele não usa delimitador no utimo item

        System.out.println(titles);

    }
}
