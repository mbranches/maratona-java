package academy.devdojo.maratona.lambdas.test;

import academy.devdojo.maratona.lambdas.domain.Anime;
import academy.devdojo.maratona.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

//Reference to a construtor
public class MethodReferenceTest04 {
    public static void main(String[] args) {
//        Supplier<AnimeComparators> newAnimeComparators = () -> new AnimeComparators();
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Naruto", 210), new Anime("OnePiece", 900), new Anime("Dragon Ball", 211)));

        animes.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animes);

        BiFunction<String, Integer, Anime> animeFactory = Anime::new;

        System.out.println(animeFactory.apply("Seila", 122));
    }

}
