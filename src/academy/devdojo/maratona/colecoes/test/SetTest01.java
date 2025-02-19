package academy.devdojo.maratona.colecoes.test;

import academy.devdojo.maratona.colecoes.domain.Manga;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>(); //--------> permite apenas elementos unicos e serão organizados pelo hash(não tem como ter controle de como eles estarão organizados, portanto não há get)
        mangas.add(new Manga(5L, "Attack on titan",19.9));
        mangas.add(new Manga(1L, "Naruto",21.5));
        mangas.add(new Manga(4L, "Boruto",15.9));
        mangas.add(new Manga(6L, "Boku no hero",19.7));
        mangas.add(new Manga(2L, "Dragon ball",14));
        mangas.add(new Manga(2L, "Dragon ball",14));

        for (Manga manga : mangas) System.out.println(manga);
    }
}
