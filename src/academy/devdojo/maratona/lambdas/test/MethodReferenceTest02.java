package academy.devdojo.maratona.lambdas.test;

import academy.devdojo.maratona.lambdas.domain.Anime;
import academy.devdojo.maratona.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Naruto", 210), new Anime("OnePiece", 900), new Anime("Dragon Ball", 211)));
//        animes.sort((o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));
//        animes.sort((a1, a2) -> AnimeComparators.compareByTitle(a1, a2));
        animes.sort(AnimeComparators::compareByTitle);
        System.out.println(animes);
        animes.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animes);
    }
}
