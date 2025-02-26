package academy.devdojo.maratona.streams.test;

import academy.devdojo.maratona.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FindAndMatching {
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
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 9));
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 1.5)); // if everything matches the predicate
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() > 1.5)); //if none matches the predicade

        Optional<LightNovel> any = lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .findAny(); //if you dont care about the order ->return an optional

        any.ifPresent(System.out::println);

        Optional<LightNovel> first = lightNovels.stream().filter(ln -> ln.getPrice() > 3).findFirst();
    }
}
