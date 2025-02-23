package academy.devdojo.maratona.lambdas.test;

import academy.devdojo.maratona.lambdas.domain.Anime;
import academy.devdojo.maratona.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

//Reference to an instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Naruto", 210), new Anime("OnePiece", 900), new Anime("Dragon Ball", 211)));
//        animes.sort((o1, o2) -> animeComparators.compareByEpisodesNonStatic(o2, o2));
        animes.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animes);
    }
}
